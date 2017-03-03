package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.w3c.dom.Text;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;

public class EditTweetActivity extends Activity {
    private static final String FILENAME = "file.sav";
    private ArrayList<Tweet> tweetList;
    private Tweet current;
    int position;
    TextView messageText;
    TextView dateText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle extra = getIntent().getExtras();
        position = extra.getInt("index");
        setContentView(R.layout.activity_edit_tweet);
        messageText = (TextView) findViewById(R.id.textView);
        dateText = (TextView) findViewById(R.id.textView2);
        loadFromFile();
        String message = current.getMessage();
        Date date = current.getDate();
        messageText.setText(message);
        dateText.setText(date.toString());
    }

    private void loadFromFile() {
        try {
            FileInputStream fis = openFileInput(FILENAME);
            BufferedReader in = new BufferedReader(new InputStreamReader(fis));
            Gson gson = new Gson();
            // Taken from
            // http://stackoverflow.com/questions/12384064/gson-convert-from-json-to-a-typed-arraylistt
            // 2017-01-26 17:54:00
            tweetList = gson.fromJson(in, new TypeToken<ArrayList<NormalTweet>>(){}.getType());
            current = tweetList.get(position);
            fis.close();
        } catch (FileNotFoundException e) {
            tweetList = new ArrayList<Tweet>();
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }
    public TextView getMessage() {
        return messageText;
    }
    public TextView getDate() {
        return dateText;
    }

}