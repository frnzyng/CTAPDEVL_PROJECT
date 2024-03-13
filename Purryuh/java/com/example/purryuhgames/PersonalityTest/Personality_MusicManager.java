package com.example.purryuhgames.PersonalityTest;

import android.content.Context;
import android.media.MediaPlayer;

import com.example.purryuhgames.R;

public class Personality_MusicManager {
    private static MediaPlayer player;

    public static void initializeMediaPlayer(Context context) {
        if (player == null) {
            player = MediaPlayer.create(context, R.raw.bgmusic);
            player.setLooping(true); // Loop the music\
            player.start();
        }
    }

    public static void toggleMute() {
        if (player != null) {
            if (player.isPlaying()) {
                player.pause();
            } else {
                player.start();
            }
        }
    }

    public static void releaseMediaPlayer() {
        if (player != null) {
            player.release();
            player = null;
        }
    }

    public static boolean isPlaying() {
        return player != null && player.isPlaying();
    }
}

