package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by skhanna1 on 9/12/17.
 */

public class sad extends currentMood{
    public sad(String mood){super(mood);}
    public sad(String mood, Date date){
        super(mood,date);
    }
    public String typeMood(){
        return "sad";
    }

}
