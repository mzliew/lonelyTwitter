package ca.ualberta.cs.lonelytwitter;
/**
 * This class gets the message and sets the message that is given.
 */

/**
 * Created by mzliew on 1/19/17.
 */
public interface Tweetable {
    /**
     * Gets message.
     *
     * @return the message
     */
    public String getMessage();

    /**
     * Sets message.
     *
     * @param string the string
     * @throws TweetTooLongException the tweet too long exception
     */
    public void setMessage(String string) throws TweetTooLongException;
}
