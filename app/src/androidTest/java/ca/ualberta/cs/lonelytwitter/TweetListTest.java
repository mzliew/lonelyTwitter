package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import java.util.ArrayList;
import java.util.IllegalFormatException;

/**
 * Created by mzliew on 2/16/17.
 */

public class TweetListTest extends ActivityInstrumentationTestCase2 {
    public TweetListTest() {
        super(LonelyTwitterActivity.class);

    }
    public void testAddTweet(){
        TweetList tweets = new TweetList();
        NormalTweet tweet = new NormalTweet("some tweet");
        tweets.addTweet(tweet);
        assertTrue(tweets.hasTweet(tweet));
    }

    public void testHasTweet(){
        TweetList tweets = new TweetList();
        NormalTweet tweet = new NormalTweet("some tweet");
        assertFalse(tweets.hasTweet(tweet));
        tweets.addTweet(tweet);
        assertTrue(tweets.hasTweet(tweet));
    }

    public void testGetTweet(){
        TweetList tweets = new TweetList();
        NormalTweet tweet = new NormalTweet("some tweet");
        tweets.addTweet(tweet);
        NormalTweet returnedTweet = tweets.getTweet(0);
        assertEquals(returnedTweet.getMessage(), tweet.getMessage());
        assertEquals(returnedTweet.getDate(), tweet.getDate());
    }

    public void testGetTweets(){
        TweetList tweets = new TweetList();
        NormalTweet tweet = new NormalTweet("some tweet");
        NormalTweet tweet1 = new NormalTweet("some tweet1");
        NormalTweet tweet2 = new NormalTweet("some tweet2");
        tweets.addTweet(tweet);
        tweets.addTweet(tweet1);
        tweets.addTweet(tweet2);
        ArrayList<NormalTweet> copy = tweets.getTweets();
        assertEquals(tweet,copy.get(0));
        assertEquals(tweet1,copy.get(1));
        assertEquals(tweet2,copy.get(2));

    }
    public void testDeleteTweet(){
        TweetList tweets = new TweetList();
        NormalTweet tweet = new NormalTweet("some tweet");
        tweets.addTweet(tweet);
        tweets.delete(tweet);
        assertFalse(tweets.hasTweet(tweet));
    }

    public void testAddDupTweets(){
        TweetList tweets = new TweetList();
        NormalTweet tweet = new NormalTweet("some tweet");
        tweets.addTweet(tweet);
        try {
            tweets.addTweet(tweet);
            assertTrue(false);
        }
        catch(IllegalArgumentException e){
        }
    }

    public void testGetCount(){
        TweetList tweets = new TweetList();
        NormalTweet tweet = new NormalTweet("some tweet");
        tweets.addTweet(tweet);
        int count = tweets.count();
        assertEquals(1,count);
    }
}
