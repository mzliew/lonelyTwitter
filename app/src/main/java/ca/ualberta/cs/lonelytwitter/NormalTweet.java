package ca.ualberta.cs.lonelytwitter;

import java.util.Date;
/**
 * This class starts a new Normal tweet with date and message.
 */



/**
 * Created by mzliew on 1/19/17.
 */
public class NormalTweet extends Tweet {
    /**
     * Instantiates a new Normal tweet.
     *
     * @param message the message
     */
    public NormalTweet(String message) {
        super(message);
    }

    /**
     * Instantiates a new Normal tweet.
     *
     * @param date    the date
     * @param message the message
     */
    public NormalTweet(Date date, String message) {
        super(date, message);
    }


    @Override
    public Boolean isImportant() {
        return true;
    }
}

