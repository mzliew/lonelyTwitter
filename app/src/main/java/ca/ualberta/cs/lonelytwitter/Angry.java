package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by mzliew on 1/19/17.
 */
public class Angry extends Mood {

    public Angry(Date date) {
        super(date);
    }

    @Override
    public String getMood(){
        return "Angry";
    };
}
