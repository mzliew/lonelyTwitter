package ca.ualberta.cs.lonelytwitter;

import java.util.Date;
/**
 * This class implements the mood "angry" with the date.
 */


/**
 * Created by mzliew on 1/19/17.
 */
public class Angry extends Mood {

    /**
     * Instantiates a new Angry.
     *
     * @param date the date
     */
    public Angry(Date date) {
        super(date);
    }

    @Override
    public String getMood(){
        return "Angry";
    };
}
