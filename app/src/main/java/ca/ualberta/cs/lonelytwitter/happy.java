package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by skhanna1 on 9/12/17.
 */

public class happy extends currentMood{
    public happy(String mood){super(mood);}
    public happy(String mood, Date date){
        super(mood,date);
    }
    public String typeMood(){
        return "happy";
    }

}