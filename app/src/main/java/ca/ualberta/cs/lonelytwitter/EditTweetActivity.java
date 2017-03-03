package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class EditTweetActivity extends Activity {
    private static final String FILENAME = "file.sav";
    private ArrayList<Tweet> tweetList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);
        TextView showTweet = (TextView)findViewById(R.id.textView);
//        loadFromFile();
        Bundle extra = getIntent().getExtras();
        int position = extra.getInt("index");
        //tweetList = tweetList.get(position);
        showTweet.setText(position);
    }

    private void loadFromFile() {
        try {
            FileInputStream fis = openFileInput(FILENAME);
            BufferedReader in = new BufferedReader(new InputStreamReader(fis));
            Gson gson = new Gson();
            // Taken from http://stackoverflow.com/questions/12384064/gson-convert-from-json-to-a-typed-arraylistt
            // 2017-01-26 17:54:00
            tweetList = gson.fromJson(in, new TypeToken<ArrayList<Tweet>>(){}.getType());
            fis.close();
        } catch (FileNotFoundException e) {
            tweetList = new ArrayList<Tweet>();
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }
}

