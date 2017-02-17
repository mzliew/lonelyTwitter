package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

/**
 * Created by mzliew on 2/16/17.
 */

public class TweetList {
    private ArrayList<NormalTweet> tweets = new ArrayList<NormalTweet>();

    public void addTweet(NormalTweet tweet) {
        if (tweets.contains(tweet))
        {
            throw new IllegalArgumentException();
        }
        else {
            tweets.add(tweet);
        }
    }

    public boolean hasTweet(NormalTweet tweet){
        return tweets.contains(tweet);
    }

    public NormalTweet getTweet(int index){
        return tweets.get(0);
    }

    public ArrayList<NormalTweet> getTweets()
    {
        return tweets;
    }

    public void delete(NormalTweet tweet){
        tweets.remove(tweet);
    }


    public int count()
    {
        int sizes = tweets.size();
        return sizes;
    }
}
