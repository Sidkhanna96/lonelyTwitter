package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by skhanna1 on 9/12/17.
 */

public abstract class currentMood {

    /**
     * mood stirng
     */
    private String mood;
    private Date date;

    /**
     * connstructor
     * @param mood
     */
    public currentMood(String mood){
        this.mood = mood;
        this.date = new Date();
    }

    /**
     * constructor
     */
    public currentMood(String mood, Date date) {
        this.mood = mood;
        this.date = date;
    }

    /**
     * check type moode
     * @return
     */
    public abstract String typeMood();

    /**
     * message setter
     * @param mood
     */
    public void setMessage(String mood){
        this.mood = mood;
    }

    /**
     * message getter
     * @return
     */
    public String getMessage(){
        return this.mood;
    }

    /**
     * message getter
     * @return
     */
    public Date getDate() {
        return date;
    }

    /**
     * message setter
     * @param date
     */
    public void setDate(Date date) {
        this.date = date;
    }
}
