package com.codepath.apps.restclienttemplate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.codepath.apps.restclienttemplate.models.Tweet;
import com.loopj.android.http.JsonHttpResponseHandler;

import org.json.JSONObject;

import cz.msebera.android.httpclient.Header;

// CREATE BY GLORIA

public class ComposeActivity extends AppCompatActivity {

    ImageView ivProfile;
    TextView tvUsername;
    EditText etTweet;
    Button btnCancel;
    Button btnPost;
    TextView tvCounter;
    TwitterClient client;
    String imageUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compose);

        // initializes instance variables
        ivProfile = this.findViewById(R.id.ivProfile);
        tvUsername = this.findViewById(R.id.tvUsername);
        etTweet = this.findViewById(R.id.etTweet);
        btnCancel = this.findViewById(R.id.btnCancel);
        btnPost = this.findViewById(R.id.btnPost);
        client = TwitterApp.getRestClient(this);
    }

    public void onCancel(View view) {
    }

    // method called when post button is clicked
    public void composeTweet(android.view.View view) {
        // grabs body of tweet

            }
        }