package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by watts1 on 9/12/17.
 */

public class ImportantTweet extends Tweet implements Tweetable {

    /**
     * constructor
     * @param message
     */
    public ImportantTweet(String message){
        super(message);
    }

    /**
     * constructor with parameters
     */
    public ImportantTweet(String message, Date date) {
        super(message, date);
    }

    /**
     * check if tweet is important
     *
     * @return
     */
    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;
    }
}
