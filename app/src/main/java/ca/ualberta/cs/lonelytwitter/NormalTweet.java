package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by watts1 on 9/12/17.
 */

/**
 * creating normal tweet
 */
public class NormalTweet extends Tweet {

    /**
     * normal tweet constructor
     * @param message
     */
    public NormalTweet(String message) {
        super(message);
    }

    /**
     * Normal tweet constructor with parameters
     * @param message
     * @param date
     */
    public NormalTweet(String message, Date date) {
        super(message, date);
    }

    /**
     * checks if tweet isimportant
     * @return
     */
    @Override
    public Boolean isImportant(){
        return Boolean.FALSE;
    }

}
