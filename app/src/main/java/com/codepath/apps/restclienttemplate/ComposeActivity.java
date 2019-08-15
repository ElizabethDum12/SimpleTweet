package com.codepath.apps.restclienttemplate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.codepath.apps.restclienttemplate.models.Tweet;
import com.loopj.android.http.JsonHttpResponseHandler;

import org.json.JSONObject;

import cz.msebera.android.httpclient.Header;

// CREATE BY GLORIA

public class ComposeActivity extends AppCompatActivity {

    public static final int MAX_TWEET_LENGTH = 280;

    private EditText etCompose;
    private Button btnTweet;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compose);

        // initializes instance variables
        etCompose = findViewById(R.id.etCompose);
        btnTweet= findViewById(R.id.btnTweet);

        //set  the onClick listener on button
        btnTweet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tweetContent = etCompose.getText().toString();
                //TODO :error handling
                if (tweetContent.isEmpty()){
                    Toast.makeText(ComposeActivity.this, "Your Tweet is empty", Toast.LENGTH_LONG).show();
                    return;
                }
                if (tweetContent.length()> MAX_TWEET_LENGTH){
                    Toast.makeText(ComposeActivity.this, "Your Tweet is too long", Toast.LENGTH_LONG).show();
                    return;
                }
                Toast.makeText(ComposeActivity.this, tweetContent, Toast.LENGTH_LONG).show();

            }
        });


        //make the api call to twitter to publish the content in edit text

    }


}

