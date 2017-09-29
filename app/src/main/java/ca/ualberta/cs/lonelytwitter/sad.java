package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by skhanna1 on 9/12/17.
 */

public class sad extends currentMood{
    /**
     * constructor
     * @param mood
     */
    public sad(String mood){super(mood);}

    /**
     * constructor with parameters
     * @param mood
     * @param date
     */
    public sad(String mood, Date date){
        super(mood,date);
    }

    /**
     * type mood
     * @return
     */
    public String typeMood(){
        return "sad";
    }

}
