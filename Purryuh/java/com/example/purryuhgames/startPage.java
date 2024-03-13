package com.example.purryuhgames;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class startPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_startpage);

        Button buttonNext = findViewById(R.id.start);
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent to start NextActivity
                Intent intent = new Intent(startPage.this, GameSelectorPage.class);
                startActivity(intent);
            }
        });
    }
}