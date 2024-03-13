package com.example.purryuhgames.PersonalityTest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.purryuhgames.R;


public class Personality_UserNameActivity extends AppCompatActivity {

    private MediaPlayer player;
    private Button doneName, musicbtn;

    private ImageView volume;
    private Drawable volumeOn, volumeOff;

    String username;
    private int q1a1count = 0, q1a2count = 0, q1a3count = 0, q2a1count = 0, q2a2count = 0, q2a3count = 0, q3a1count = 0, q3a2count = 0,
            q3a3count = 0, q4a1count = 0, q4a2count = 0, q4a3count = 0, q5a1count = 0, q5a2count = 0, q5a3count = 0, q6a1count = 0,
            q6a2count = 0, q6a3count = 0, q7a1count = 0, q7a2count = 0, q7a3count = 0, q8a1count = 0, q8a2count = 0, q8a3count = 0,
            q9a1count = 0, q9a2count = 0, q9a3count = 0, q10a1count = 0, q10a2count = 0, q10a3count = 0, q11a1count = 0, q11a2count = 0,
            q11a3count = 0, q12a1count = 0, q12a2count = 0, q12a3count = 0, q13a1count = 0, q13a2count = 0, q13a3count = 0, q14a1count = 0,
            q14a2count = 0, q14a3count = 0, q15a1count = 0, q15a2count = 0, q15a3count = 0, q16a1count = 0, q16a2count = 0, q16a3count = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personality_typename);

        doneName = findViewById(R.id.doneName);
        doneName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openResultsActivity();
            }
        });

        // Initialize the toggle button
        musicbtn = (Button) findViewById(R.id.musicbtn);
        volume = (ImageView) findViewById(R.id.volume);

        // Get the volume on and volume off drawables
        volumeOn = getResources().getDrawable(R.drawable.volume);
        volumeOff = getResources().getDrawable(R.drawable.novolume);

        // Set the initial image to volume on
        volume.setImageDrawable(volumeOn);

        musicbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)  {
                toggleMusic();
            }
        });
        updateVolumeIcon();


        // Retrieve counts from Intent extras
        Intent intent = getIntent();
        if (intent != null) {
            q1a1count = intent.getIntExtra("q1a1count", 0);
            q1a2count = intent.getIntExtra("q1a2count", 0);
            q1a3count = intent.getIntExtra("q1a3count", 0);

            q2a1count = intent.getIntExtra("q2a1count", 0);
            q2a2count = intent.getIntExtra("q2a2count", 0);
            q2a3count = intent.getIntExtra("q2a3count", 0);

            q3a1count = intent.getIntExtra("q3a1count", 0);
            q3a2count = intent.getIntExtra("q3a2count", 0);
            q3a3count = intent.getIntExtra("q3a3count", 0);

            q4a1count = intent.getIntExtra("q4a1count", 0);
            q4a2count = intent.getIntExtra("q4a2count", 0);
            q4a3count = intent.getIntExtra("q4a3count", 0);

            q5a1count = intent.getIntExtra("q5a1count", 0);
            q5a2count = intent.getIntExtra("q5a2count", 0);
            q5a3count = intent.getIntExtra("q5a3count", 0);

            q6a1count = intent.getIntExtra("q6a1count", 0);
            q6a2count = intent.getIntExtra("q6a2count", 0);
            q6a3count = intent.getIntExtra("q6a3count", 0);

            q7a1count = intent.getIntExtra("q7a1count", 0);
            q7a2count = intent.getIntExtra("q7a2count", 0);
            q7a3count = intent.getIntExtra("q7a3count", 0);

            q8a1count = intent.getIntExtra("q8a1count", 0);
            q8a2count = intent.getIntExtra("q8a2count", 0);
            q8a3count = intent.getIntExtra("q8a3count", 0);

            q9a1count = intent.getIntExtra("q9a1count", 0);
            q9a2count = intent.getIntExtra("q9a2count", 0);
            q9a3count = intent.getIntExtra("q9a3count", 0);

            q10a1count = intent.getIntExtra("q10a1count", 0);
            q10a2count = intent.getIntExtra("q10a2count", 0);
            q10a3count = intent.getIntExtra("q10a3count", 0);

            q11a1count = intent.getIntExtra("q11a1count", 0);
            q11a2count = intent.getIntExtra("q11a2count", 0);
            q11a3count = intent.getIntExtra("q11a3count", 0);

            q12a1count = intent.getIntExtra("q12a1count", 0);
            q12a2count = intent.getIntExtra("q12a2count", 0);
            q12a3count = intent.getIntExtra("q12a3count", 0);

            q13a1count = intent.getIntExtra("q13a1count", 0);
            q13a2count = intent.getIntExtra("q13a2count", 0);
            q13a3count = intent.getIntExtra("q13a3count", 0);

            q14a1count = intent.getIntExtra("q14a1count", 0);
            q14a2count = intent.getIntExtra("q14a2count", 0);
            q14a3count = intent.getIntExtra("q14a3count", 0);

            q15a1count = intent.getIntExtra("q15a1count", 0);
            q15a2count = intent.getIntExtra("q15a2count", 0);
            q15a3count = intent.getIntExtra("q15a3count", 0);

            q16a1count = intent.getIntExtra("q16a1count", 0);
            q16a2count = intent.getIntExtra("q16a2count", 0);
            q16a3count = intent.getIntExtra("q16a3count", 0);
        }

        {//Just to debug the counting system
        Log.d("Count", "q1a1 value = " + q1a1count);
        Log.d("Count", "q1a2 value = " + q1a2count);
        Log.d("Count", "q1a3 value = " + q1a3count);

        Log.d("Count", "q2a1 value = " + q2a1count);
        Log.d("Count", "q2a2 value = " + q2a2count);
        Log.d("Count", "q2a3 value = " + q2a3count);

        Log.d("Count", "q3a1 value = " + q3a1count);
        Log.d("Count", "q3a2 value = " + q3a2count);
        Log.d("Count", "q3a3 value = " + q3a3count);

        Log.d("Count", "q4a1 value = " + q4a1count);
        Log.d("Count", "q4a2 value = " + q4a2count);
        Log.d("Count", "q4a3 value = " + q4a3count);

        Log.d("Count", "q5a1 value = " + q5a1count);
        Log.d("Count", "q5a2 value = " + q5a2count);
        Log.d("Count", "q5a3 value = " + q5a3count);

        Log.d("Count", "q6a1 value = " + q6a1count);
        Log.d("Count", "q6a2 value = " + q6a2count);
        Log.d("Count", "q6a3 value = " + q6a3count);

        Log.d("Count", "q7a1 value = " + q7a1count);
        Log.d("Count", "q7a2 value = " + q7a2count);
        Log.d("Count", "q7a3 value = " + q7a3count);

        Log.d("Count", "q8a1 value = " + q8a1count);
        Log.d("Count", "q8a2 value = " + q8a2count);
        Log.d("Count", "q8a3 value = " + q8a3count);

        Log.d("Count", "q9a1 value = " + q9a1count);
        Log.d("Count", "q9a2 value = " + q9a2count);
        Log.d("Count", "q9a3 value = " + q9a3count);

        Log.d("Count", "q10a1 value = " + q10a1count);
        Log.d("Count", "q10a2 value = " + q10a2count);
        Log.d("Count", "q10a3 value = " + q10a3count);

        Log.d("Count", "q11a1 value = " + q11a1count);
        Log.d("Count", "q11a2 value = " + q11a2count);
        Log.d("Count", "q11a3 value = " + q11a3count);

        Log.d("Count", "q12a1 value = " + q12a1count);
        Log.d("Count", "q12a2 value = " + q12a2count);
        Log.d("Count", "q12a3 value = " + q12a3count);

        Log.d("Count", "q13a1 value = " + q13a1count);
        Log.d("Count", "q13a2 value = " + q13a2count);
        Log.d("Count", "q13a3 value = " + q13a3count);

        Log.d("Count", "q14a1 value = " + q14a1count);
        Log.d("Count", "q14a2 value = " + q14a2count);
        Log.d("Count", "q14a3 value = " + q14a3count);

        Log.d("Count", "q15a1 value = " + q15a1count);
        Log.d("Count", "q15a2 value = " + q15a2count);
        Log.d("Count", "q15a3 value = " + q15a3count);

        Log.d("Count", "q16a1 value = " + q16a1count);
        Log.d("Count", "q16a2 value = " + q16a2count);
        Log.d("Count", "q16a3 value = " + q16a3count);
        }


        findViewById(R.id.doneName).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Calculate the total counts for each choice
                int countA1 = q1a1count + q2a1count + q3a1count + q4a1count + q5a1count + q6a1count + q7a1count + q8a1count + q9a1count + q10a1count + q11a1count + q12a1count + q13a1count + q14a1count + q15a1count + q16a1count;
                int countA2 = q1a2count + q2a2count + q3a2count + q4a2count + q5a2count + q6a2count + q7a2count + q8a2count + q9a2count + q10a2count + q11a2count + q12a2count + q13a2count + q14a2count + q15a2count + q16a2count;
                int countA3 = q1a3count + q2a3count + q3a3count + q4a3count + q5a3count + q6a3count + q7a3count + q8a3count + q9a3count + q10a3count + q11a3count + q12a3count + q13a3count + q14a3count + q15a3count + q16a3count;
                username = ((EditText) findViewById(R.id.username)).getText().toString();
                Log.d("Username", "Username: " + username);
                username = capitalizeEachWord(username);

                Log.d("Count", "Total Count A1: " + countA1);
                Log.d("Count", "Total Count A2: " + countA2);
                Log.d("Count", "Total Count A3: " + countA3);

                String resultChoice;
                // Determine the result choice
                if (countA1 > countA2 && countA1 > countA3) {
                    resultChoice = "Thrill Seeker";
                } else if (countA2 > countA1 && countA2 > countA3) {
                    resultChoice = "Nonchalant";
                } else if (countA3 > countA1 && countA3 > countA2) {
                    resultChoice = "Happy Pill";
                } else if (countA1 == countA2) {
                    resultChoice = "Chill Thrill";
                } else if (countA1 == countA3) {
                    resultChoice = "Life of the Party";
                } else {
                    resultChoice = "Introverted BFF";
                }

                // Pass the result choice to the next activity
                Intent intent = new Intent(Personality_UserNameActivity.this, Personality_ResultsActivity.class);
                intent.putExtra("result", resultChoice);
                intent.putExtra("Username", username);
                startActivity(intent);
            }
        });


    }

    // Function to capitalize each word in the string
    private String capitalizeEachWord(String str) {
        String[] words = str.split("\\s");
        StringBuilder capitalizedString = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                String firstLetter = word.substring(0, 1).toUpperCase();
                String restOfWord = word.substring(1).toLowerCase();
                capitalizedString.append(firstLetter).append(restOfWord).append(" ");
            }
        }
        return capitalizedString.toString().trim();
    }
    private void toggleMusic() {
        Personality_MusicManager.toggleMute();
        updateVolumeIcon();
    }

    private void updateVolumeIcon() {
        if (Personality_MusicManager.isPlaying()) {
            volume.setImageDrawable(volumeOn);
        } else {
            volume.setImageDrawable(volumeOff);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Release the MediaPlayer when the activity is destroyed
        Personality_MusicManager.releaseMediaPlayer();
    }

    public void openResultsActivity(){
        Intent intent = new Intent(this, Personality_ResultsActivity.class);
        startActivity(intent);
    }
}
