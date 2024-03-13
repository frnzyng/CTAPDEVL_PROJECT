package com.example.purryuhgames.PersonalityTest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.purryuhgames.GameSelectorPage;
import com.example.purryuhgames.R;

public class Personality_FirstPage extends AppCompatActivity {

    private Button startbtn, backbtn, musicbtn;

    private ImageView volume;
    private Drawable volumeOn, volumeOff;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personality_firstpage);

        Personality_MusicManager.initializeMediaPlayer(this);

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

        startbtn = (Button) findViewById(R.id.startbutton);
        startbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQuestionsActivity();
            }
        });

        backbtn = (Button) findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMenuActivity();
            }
        });

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

    public void openMenuActivity(){
        Intent intent = new Intent(this, GameSelectorPage.class);
        startActivity(intent);
        finish();
    }
    public void openQuestionsActivity(){
        Intent intent = new Intent(this, Personality_Questions1to8.class);
        startActivity(intent);
    }

}