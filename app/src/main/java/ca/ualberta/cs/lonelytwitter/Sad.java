package ca.ualberta.cs.lonelytwitter;

import java.util.Date;
/**
 * This class implements the mood "sad" with the date.
 */

/**
 * Created by mzliew on 1/19/17.
 */
public class Sad extends Mood {

    /**
     * Instantiates a new Sad.
     *
     * @param date the date
     */
    public Sad(Date date) {
        super(date);
    }

    @Override

    public String getMood(){
        return "Sad";
    };
}

