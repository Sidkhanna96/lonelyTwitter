package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by skhanna1 on 9/12/17.
 */

public abstract class currentMood {

    private String mood;
    private Date date;

    public currentMood(String mood){
        this.mood = mood;
        this.date = new Date();
    }

    public currentMood(String mood, Date date) {
        this.mood = mood;
        this.date = date;
    }

    public abstract String typeMood();

    public void setMessage(String mood){
        this.mood = mood;
    }

    public String getMessage(){
        return this.mood;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
