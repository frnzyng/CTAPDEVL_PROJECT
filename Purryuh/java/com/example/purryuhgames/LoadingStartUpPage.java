package com.example.purryuhgames;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.os.Handler;
import android.content.Intent;
import com.airbnb.lottie.LottieAnimationView;

public class LoadingStartUpPage extends AppCompatActivity {

    ImageView peryuhtxt, peryabg;
    LottieAnimationView lottieAnimationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_loading_startup);

        peryuhtxt = findViewById(R.id.peryatext);
        peryabg = findViewById(R.id.bg);
        lottieAnimationView = findViewById(R.id.cute);

        peryabg.animate().translationY(-4000).setDuration(1000).setStartDelay(3000);
        peryuhtxt.animate().translationY(3000).setDuration(1080).setStartDelay(3000);
        lottieAnimationView.animate().translationY(3000).setDuration(1080).setStartDelay(3000);

        // Delayed navigation to MainActivity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Create Intent to navigate to MainActivity
                Intent intent = new Intent(LoadingStartUpPage.this, startPage.class);
                // Start the MainActivity
                startActivity(intent);
                // Finish the current activity if needed
                finish();
            }
        }, 4000);
    }
}
