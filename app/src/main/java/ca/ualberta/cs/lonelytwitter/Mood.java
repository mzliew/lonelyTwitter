package ca.ualberta.cs.lonelytwitter;

import java.util.Date;
/**
 * Sets the current date for the mood and the mood.
 */

/**
 * Created by mzliew on 1/19/17.
 */
public abstract class Mood {

    private Date date;

    /**
     * Instantiates a new Mood.
     *
     * @param date the date
     */
    public Mood(Date date) {
        this.date = new Date(System.currentTimeMillis());
    }

    /**
     * Gets date of the mood.
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

    /**
     * Gets mood.
     *
     * @return the mood
     */
    public abstract String getMood();
}
