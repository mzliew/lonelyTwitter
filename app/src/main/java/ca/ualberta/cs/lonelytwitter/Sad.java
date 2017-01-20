package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by mzliew on 1/19/17.
 */

public class Sad extends Mood {

    public Sad(Date date) {
        super(date);
    }

    @Override

    public String getMood(){
        return "Sad";
    };
}

