package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by mzliew on 1/19/17.
 */

public abstract class Mood {

    private Date date;

    public Mood(Date date)
    {
        this.date = date;
    }
    public Mood() {
        this.date = new Date(System.currentTimeMillis());
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public abstract String getMood();
}
