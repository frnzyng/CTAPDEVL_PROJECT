package com.example.purryuhgames.PersonalityTest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.purryuhgames.GameSelectorPage;
import com.example.purryuhgames.R;

public class Personality_ResultsActivity extends AppCompatActivity {


    private Button backMenu, saveButton, retakebtn;
    private ImageView resultImageView;
    private TextView usernameTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personality_results);

        backMenu = (Button) findViewById(R.id.tomenu);
        backMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMenuActivity();
            }
        });

        retakebtn = (Button) findViewById(R.id.retakebtn);
        retakebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                retakeGame();
            }
        });

        // Retrieve the result choice and username from the intent
        Intent intent = getIntent();
        String resultChoice = intent.getStringExtra("result");
        String username = intent.getStringExtra("Username");

        // Determine which image to display based on the result choice
        int imageResource = 0;
        if (resultChoice.equals("Thrill Seeker")) {
            imageResource = R.drawable.personality_result_thrillseeker;
        } else if (resultChoice.equals("Nonchalant")) {
            imageResource = R.drawable.personality_result_nonchalant;
        } else if (resultChoice.equals("Happy Pill")) {
            imageResource = R.drawable.personality_result_happypill;
        } else if (resultChoice.equals("Chill Thrill")) {
            imageResource = R.drawable.personality_result_chillthrill;
        } else if (resultChoice.equals("Life of the Party")) {
            imageResource = R.drawable.personality_result_lotp;
        } else {
            imageResource = R.drawable.personality_result_introvertbff;
        }

        // Set the image in an ImageView
        resultImageView = findViewById(R.id.resultPic);
        resultImageView.setImageResource(imageResource);

        // Display the username and result choice in TextViews or wherever you want

        usernameTextView = findViewById(R.id.usernameResult);
        //TextView resultTextView = findViewById(R.id.resultTextView);
        usernameTextView.setText(username);
        //resultTextView.setText("Result: " + resultChoice);

    }

    @Override
    protected void onPause() {
        super.onPause();
        // Stop the music when activity is paused
        Personality_MusicManager.releaseMediaPlayer();
    }

    public void openMenuActivity() {
        Intent intent = new Intent(this, GameSelectorPage.class);
        startActivity(intent);
    }

    public void retakeGame(){
        Intent intent = new Intent(this, Personality_FirstPage.class);
        startActivity(intent);
    }
}