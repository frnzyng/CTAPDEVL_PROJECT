package com.example.purryuhgames;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.purryuhgames.PersonalityTest.Personality_MusicManager;
import com.example.purryuhgames.databinding.MenuGameSelectorPageBinding;

public class GameSelectorPage extends AppCompatActivity {

    MenuGameSelectorPageBinding binding;
    MediaPlayer mp1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = MenuGameSelectorPageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new GamesFragment());

        mp1 = MediaPlayer.create(this, R.raw.cutecircus);
        mp1.start();
        mp1.setLooping(true);

        binding.playbttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playmusic();
            }
        });

        binding.pausebttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pausemusic();
            }
        });

        binding.bottomNavigationView.setOnItemSelectedListener(item -> {
            if (item.getItemId() == R.id.bottom_games) {
                replaceFragment(new GamesFragment());
            } else if (item.getItemId() == R.id.bottom_about) {
                replaceFragment(new AboutFragment());
            } else if (item.getItemId() == R.id.bottom_credits) {
                replaceFragment(new CreditsFragment());
            }
            return true;
        });

    }

    private void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.gameselectorframe,fragment);
        fragmentTransaction.commit();
    }
    public void toggleMusic() {
        if (mp1 != null) {
            if (mp1.isPlaying()) {
                mp1.pause();
            } else {
                mp1.start();
            }
        }
    }

    public void playmusic(){
        if (mp1 == null){
            mp1 = MediaPlayer.create(this, R.raw.cutecircus);
        }
        mp1.start();
    }


    public void pausemusic(){
        if (mp1 != null){
            mp1.pause();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        // Stop the music when the activity is paused
        if (mp1 != null && mp1.isPlaying()) {
            mp1.pause();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Release the MediaPlayer when the activity is destroyed
        if (mp1 != null) {
            mp1.release();
            mp1 = null;
        }
    }

}
