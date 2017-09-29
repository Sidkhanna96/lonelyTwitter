package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by watts1 on 9/12/17.
 */

/**
 * tweet constructor
 */
public abstract class Tweet {
    /**
     * message the user enters
     */
    private String message;

    /**
     * date the tweet was made
     */
    private Date date;

    /**
     * constructor
     * @param message
     */
    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }

    /**
     * constructor with parameters
     * @param message
     * @param date
     */
    public Tweet(String message, Date date) {
        this.message = message;
        this.date = date;
    }

    /**
     * checks if tweet is important
     * @return
     */
    public abstract Boolean isImportant();


    /**
     * tweet setter
     * @param message
     * @throws TweetTooLongException
     */
    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() > 140){
            throw new TweetTooLongException();
        } else {
            this.message = message;
        }
    }

    /**
     * tweet message getter
     * @return
     */
    public String getMessage(){
        return this.message;
    }

    /**
     * tweet date getter
     * @return
     */
    public Date getDate() {
        return date;
    }

    /**
     * tweet setter date
     * @param date
     */
    public void setDate(Date date) {
        this.date = date;
    }
}
