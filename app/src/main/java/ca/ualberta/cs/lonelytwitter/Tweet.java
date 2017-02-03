package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;
import java.util.PriorityQueue;
import java.util.concurrent.ExecutionException;
/**
 * This class makes a new tweet and sets the message and date.
 */

/**
 * Created by mzliew on 1/19/17.
 */
public abstract class Tweet implements Tweetable{

    private Date date;
    private String message;
    private ArrayList<Mood> Moods;

    /**
     * Instantiates a new Tweet.
     *
     * @param message the message
     */
    public Tweet(String message) {
        this.message = message;
        this.date = new Date();
    }

    /**
     * Instantiates a new Tweet.
     *
     * @param date    the date
     * @param message the message
     */
    public Tweet(Date date, String message) {
        this.message = message;
        this.date = date;
    }

    /**
     * Gets date.
     *
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * Sets date.
     *
     * @param date the date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) throws TweetTooLongException{

        if (message.length() > 140) {
            throw new TweetTooLongException();
        }
        this.message = message;
    }

    /**
     * Add mood.
     *
     * @param mood the mood
     */
    public void addMood(Mood mood)
    {
        Moods.add(mood);
    }

    /**
     * Sets isImportant boolean.
     *
     * @return the boolean
     */
    public abstract Boolean isImportant();

    @Override
    public String toString(){

        return date.toString() + "|" + message;
    }
}
