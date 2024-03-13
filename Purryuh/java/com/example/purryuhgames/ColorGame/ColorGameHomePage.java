package com.example.purryuhgames.ColorGame;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.purryuhgames.GameSelectorPage;
import com.example.purryuhgames.R;
import com.example.purryuhgames.databinding.ColorGameHomePageBinding;


public class ColorGameHomePage extends AppCompatActivity {

    private ColorGameHomePageBinding binding22;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.color_game_home_page);
        binding22 = ColorGameHomePageBinding.inflate(getLayoutInflater());
        setContentView(binding22.getRoot());
        if(ColorGamePlay.mp2.isPlaying() == true){
            ColorGamePlay.mp2.pause();
        }

        binding22.startB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ColorGamePlay.class);
                startActivity(intent);

            }

        });

        binding22.colorgameHOME.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), GameSelectorPage.class);
                startActivity(intent);
            }
        });
    }




}