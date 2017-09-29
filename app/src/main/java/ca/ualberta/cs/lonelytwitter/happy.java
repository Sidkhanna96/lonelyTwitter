package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by skhanna1 on 9/12/17.
 */

public class happy extends currentMood{
    /**
     * happy constructor
     * @param mood
     */
    public happy(String mood){super(mood);}

    /**
     * constructor
     * @param mood
     * @param date
     */
    public happy(String mood, Date date){
        super(mood,date);
    }

    /**
     * type mood
     * @return
     */
    public String typeMood(){
        return "happy";
    }

}