package ca.ualberta.cs.lonelytwitter;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class LonelyTwitterActivity extends Activity {

	/**
	 * variables FileName: values are stored in file.sav
	 */
	private static final String FILENAME = "file.sav";
	/**
	 * used to acces the tweet the user makes
	 */
	private EditText bodyText;
	/**
	 * The original tweet list
	 */
	private ListView oldTweetsList;
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		bodyText = (EditText) findViewById(R.id.body);
		/**
		 * creates the save button
		 */
		Button saveButton = (Button) findViewById(R.id.save);
		oldTweetsList = (ListView) findViewById(R.id.oldTweetsList);

		/**
		 * Action to perform after the user presses the save button to save
		 * the tweet made by the user
		 */
		saveButton.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				setResult(RESULT_OK);

				/**
				 * convert the input made by the user to strnig
				 */
				String text = bodyText.getText().toString();

				/**
				 * user makes a normal tweet
				 */
				NormalTweet newTweet = new NormalTweet("Hello");
				/**
				 * user makes an important tweet
				 */
				ImportantTweet newTweet2 = new ImportantTweet("hello", new Date());

				/**
				 * get date when tweet made
				 */
				newTweet2.getDate();

				try {
					newTweet.setMessage("Goodbye");
				} catch (TweetTooLongException e){

				}
				Log.d("TWEET", newTweet.getMessage());


				/**
				 * addinf the tweet to the list of tweets made
				 */
				ArrayList<Tweet> tweetList = new ArrayList<Tweet>();
				tweetList.add(newTweet);
				tweetList.add(newTweet2);
				/**
				 * save tweets in a file
				 */
				saveInFile(text, new Date(System.currentTimeMillis()));
				//finish();

			}
		});
	}

	/**
	 * do this on start of the app
	 */
	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		/**
		 * loading tweet from file
		 */
		String[] tweets = loadFromFile();
		/**
		 * bridge between UI and the data of tweet
		 */
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				R.layout.list_item, tweets);
		oldTweetsList.setAdapter(adapter);
	}


	/**
	 * load values from file
	 * @return tweets
	 */
	private String[] loadFromFile() {
		ArrayList<String> tweets = new ArrayList<String>();
		try {
			FileInputStream fis = openFileInput(FILENAME);
			BufferedReader in = new BufferedReader(new InputStreamReader(fis));
			String line = in.readLine();
			while (line != null) {
				tweets.add(line);
				line = in.readLine();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tweets.toArray(new String[tweets.size()]);
	}

	/**
	 * save value from file
	 * @param text
	 * @param date
	 */
	private void saveInFile(String text, Date date) {
		try {
			FileOutputStream fos = openFileOutput(FILENAME,
					Context.MODE_APPEND);
			fos.write(new String(date.toString() + " | " + text)
					.getBytes());
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}