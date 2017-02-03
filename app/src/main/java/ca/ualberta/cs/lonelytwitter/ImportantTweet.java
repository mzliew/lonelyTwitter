package ca.ualberta.cs.lonelytwitter;

import java.util.Date;
/**
 * This class implements an important tweet if it is labelled one.
 * @param message
 */


/**
 * Created by mzliew on 1/19/17.
 */
public class ImportantTweet extends Tweet {
    /**
     * Instantiates a new Important tweet.
     *
     * @param message the message
     */
    public ImportantTweet(String message) {
        super(message);
    }

    /**
     * Instantiates a new Important tweet.
     *
     * @param date    the date
     * @param message the message
     */
    public ImportantTweet(Date date, String message) {
        super(date, message);
    }

    @Override
    public Boolean isImportant() {
        return true;
    }

}
