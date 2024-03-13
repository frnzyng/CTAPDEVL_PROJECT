package com.example.purryuhgames.PersonalityTest;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.purryuhgames.R;

public class Personality_Questions9to16 extends AppCompatActivity {
    private Button backbtn, doneBtn, musicbtn;
    private ImageView volume;
    private Drawable volumeOn, volumeOff;;

    private RadioGroup q9choices, q10choices, q11choices, q12choices, q13choices, q14choices, q15choices, q16choices;

    // Variables to store the counts
    private int q1a1count = 0, q1a2count = 0, q1a3count = 0, q2a1count = 0, q2a2count = 0, q2a3count = 0, q3a1count = 0, q3a2count = 0,
            q3a3count = 0, q4a1count = 0, q4a2count = 0, q4a3count = 0, q5a1count = 0, q5a2count = 0, q5a3count = 0, q6a1count = 0,
            q6a2count = 0, q6a3count = 0, q7a1count = 0, q7a2count = 0, q7a3count = 0, q8a1count = 0, q8a2count = 0, q8a3count = 0,
            q9a1count = 0, q9a2count = 0, q9a3count = 0, q10a1count = 0, q10a2count = 0, q10a3count = 0, q11a1count = 0, q11a2count = 0,
            q11a3count = 0, q12a1count = 0, q12a2count = 0, q12a3count = 0, q13a1count = 0, q13a2count = 0, q13a3count = 0, q14a1count = 0,
            q14a2count = 0, q14a3count = 0, q15a1count = 0, q15a2count = 0, q15a3count = 0, q16a1count = 0, q16a2count = 0, q16a3count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personality_q9to16);

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

        q9choices = findViewById(R.id.q9choices);
        q10choices = findViewById(R.id.q10choices);
        q11choices = findViewById(R.id.q11choices);
        q12choices = findViewById(R.id.q12choices);
        q13choices = findViewById(R.id.q13choices);
        q14choices = findViewById(R.id.q14choices);
        q15choices = findViewById(R.id.q15choices);
        q16choices = findViewById(R.id.q16choices);


        q9choices.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.q9a1) {
                    q9a1count = 1;
                    q9a2count = 0;
                    q9a3count = 0;
                } else if (checkedId == R.id.q9a2) {
                    q9a1count = 0;
                    q9a2count = 1;
                    q9a3count = 0;
                } else if (checkedId == R.id.q9a3) {
                    q9a1count = 0;
                    q9a2count = 0;
                    q9a3count = 1;
                }

                Log.d("Count", "q9a1count = " + q9a1count);
                Log.d("Count", "q9a2count = " + q9a2count);
                Log.d("Count", "q9a3count = " + q9a3count);

            }
        });

        q10choices.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.q10a1) {
                    q10a1count = 1;
                    q10a2count = 0;
                    q10a3count = 0;
                } else if (checkedId == R.id.q10a2) {
                    q10a1count = 0;
                    q10a2count = 1;
                    q10a3count = 0;
                } else if (checkedId == R.id.q10a3) {
                    q10a1count = 0;
                    q10a2count = 0;
                    q10a3count = 1;
                }

                Log.d("Count", "q10a1count = " + q10a1count);
                Log.d("Count", "q10a2count = " + q10a2count);
                Log.d("Count", "q10a3count = " + q10a3count);
            }
        });

        q11choices.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.q11a1) {
                    q11a1count = 1;
                    q11a2count = 0;
                    q11a3count = 0;
                } else if (checkedId == R.id.q11a2) {
                    q11a1count = 0;
                    q11a2count = 1;
                    q11a3count = 0;
                } else if (checkedId == R.id.q11a3) {
                    q11a1count = 0;
                    q11a2count = 0;
                    q11a3count = 1;
                }

                Log.d("Count", "q11a1count = " + q11a1count);
                Log.d("Count", "q11a2count = " + q11a2count);
                Log.d("Count", "q11a3count = " + q11a3count);
            }
        });

        q12choices.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.q12a1) {
                    q12a1count = 1;
                    q12a2count = 0;
                    q12a3count = 0;
                } else if (checkedId == R.id.q12a2) {
                    q12a1count = 0;
                    q12a2count = 1;
                    q12a3count = 0;
                } else if (checkedId == R.id.q12a3) {
                    q12a1count = 0;
                    q12a2count = 0;
                    q12a3count = 1;
                }

                Log.d("Count", "q12a1count = " + q12a1count);
                Log.d("Count", "q12a2count = " + q12a2count);
                Log.d("Count", "q12a3count = " + q12a3count);
            }
        });


        q13choices.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.q13a1) {
                    q13a1count = 1;
                    q13a2count = 0;
                    q13a3count = 0;
                } else if (checkedId == R.id.q13a2) {
                    q13a1count = 0;
                    q13a2count = 1;
                    q13a3count = 0;
                } else if (checkedId == R.id.q13a3) {
                    q13a1count = 0;
                    q13a2count = 0;
                    q13a3count = 1;
                }

                Log.d("Count", "q13a1count = " + q13a1count);
                Log.d("Count", "q13a2count = " + q13a2count);
                Log.d("Count", "q13a3count = " + q13a3count);
            }
        });

        q14choices.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.q14a1) {
                    q14a1count = 1;
                    q14a2count = 0;
                    q14a3count = 0;
                } else if (checkedId == R.id.q14a2) {
                    q14a1count = 0;
                    q14a2count = 1;
                    q14a3count = 0;
                } else if (checkedId == R.id.q14a3) {
                    q14a1count = 0;
                    q14a2count = 0;
                    q14a3count = 1;
                }

                Log.d("Count", "q14a1count = " + q14a1count);
                Log.d("Count", "q14a2count = " + q14a2count);
                Log.d("Count", "q14a3count = " + q14a3count);
            }
        });

        q15choices.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.q15a1) {
                    q15a1count = 1;
                    q15a2count = 0;
                    q15a3count = 0;
                } else if (checkedId == R.id.q15a2) {
                    q15a1count = 0;
                    q15a2count = 1;
                    q15a3count = 0;
                } else if (checkedId == R.id.q15a3) {
                    q15a1count = 0;
                    q15a2count = 0;
                    q15a3count = 1;
                }

                Log.d("Count", "q15a1count = " + q15a1count);
                Log.d("Count", "q15a2count = " + q15a2count);
                Log.d("Count", "q15a3count = " + q15a3count);
            }
        });

        q16choices.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.q16a1) {
                    q16a1count = 1;
                    q16a2count = 0;
                    q16a3count = 0;
                } else if (checkedId == R.id.q16a2) {
                    q16a1count = 0;
                    q16a2count = 1;
                    q16a3count = 0;
                } else if (checkedId == R.id.q16a3) {
                    q16a1count = 0;
                    q16a2count = 0;
                    q16a3count = 1;
                }

                Log.d("Count", "q16a1count = " + q16a1count);
                Log.d("Count", "q16a2count = " + q16a2count);
                Log.d("Count", "q16a3count = " + q16a3count);
            }
        });

        backbtn = (Button) findViewById(R.id.Qbackbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backPage();
            }
        });

        doneBtn = (Button) findViewById(R.id.doneBtn);
        doneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doneButton();
            }
        });

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

    @Override
    protected void onResume() {
        super.onResume();
        // Update the checked state of RadioButtons
        setCheckedRadioButtons();
    }


    private void setCheckedRadioButtons() {
        // Question 9
        setCheckedRadioButton(q9choices, q9a1count, R.id.q9a1);
        setCheckedRadioButton(q9choices, q9a2count, R.id.q9a2);
        setCheckedRadioButton(q9choices, q9a3count, R.id.q9a3);

        // Question 10
        setCheckedRadioButton(q10choices, q10a1count, R.id.q10a1);
        setCheckedRadioButton(q10choices, q10a2count, R.id.q10a2);
        setCheckedRadioButton(q10choices, q10a3count, R.id.q10a3);

        // Question 11
        setCheckedRadioButton(q11choices, q11a1count, R.id.q11a1);
        setCheckedRadioButton(q11choices, q11a2count, R.id.q11a2);
        setCheckedRadioButton(q11choices, q11a3count, R.id.q11a3);

        // Question 12
        setCheckedRadioButton(q12choices, q12a1count, R.id.q12a1);
        setCheckedRadioButton(q12choices, q12a2count, R.id.q12a2);
        setCheckedRadioButton(q12choices, q12a3count, R.id.q12a3);

        // Question 13
        setCheckedRadioButton(q13choices, q13a1count, R.id.q13a1);
        setCheckedRadioButton(q13choices, q13a2count, R.id.q13a2);
        setCheckedRadioButton(q13choices, q13a3count, R.id.q13a3);

        // Question 14
        setCheckedRadioButton(q14choices, q14a1count, R.id.q14a1);
        setCheckedRadioButton(q14choices, q14a2count, R.id.q14a2);
        setCheckedRadioButton(q14choices, q14a3count, R.id.q14a3);

        // Question 15
        setCheckedRadioButton(q15choices, q15a1count, R.id.q15a1);
        setCheckedRadioButton(q15choices, q15a2count, R.id.q15a2);
        setCheckedRadioButton(q15choices, q15a3count, R.id.q15a3);

        // Question 16
        setCheckedRadioButton(q16choices, q16a1count, R.id.q16a1);
        setCheckedRadioButton(q16choices, q16a2count, R.id.q16a2);
        setCheckedRadioButton(q16choices, q16a3count, R.id.q16a3);
    }

    private void setCheckedRadioButton(RadioGroup radioGroup, int count, int radioButtonId) {
        RadioButton radioButton = findViewById(radioButtonId);
        if (count > 0) {
            radioButton.setChecked(true);
        } else {
            radioButton.setChecked(false);
        }
    }
    public void backPage(){
        Intent intent = new Intent(this, Personality_Questions1to8.class);

        // Pass counts for questions 1 to 9
        intent.putExtra("q1a1count", q1a1count);
        intent.putExtra("q1a2count", q1a2count);
        intent.putExtra("q1a3count", q1a3count);

        intent.putExtra("q2a1count", q2a1count);
        intent.putExtra("q2a2count", q2a2count);
        intent.putExtra("q2a3count", q2a3count);

        intent.putExtra("q3a1count", q3a1count);
        intent.putExtra("q3a2count", q3a2count);
        intent.putExtra("q3a3count", q3a3count);

        intent.putExtra("q4a1count", q4a1count);
        intent.putExtra("q4a2count", q4a2count);
        intent.putExtra("q4a3count", q4a3count);

        intent.putExtra("q5a1count", q5a1count);
        intent.putExtra("q5a2count", q5a2count);
        intent.putExtra("q5a3count", q5a3count);

        intent.putExtra("q6a1count", q6a1count);
        intent.putExtra("q6a2count", q6a2count);
        intent.putExtra("q6a3count", q6a3count);

        intent.putExtra("q7a1count", q7a1count);
        intent.putExtra("q7a2count", q7a2count);
        intent.putExtra("q7a3count", q7a3count);

        intent.putExtra("q8a1count", q8a1count);
        intent.putExtra("q8a2count", q8a2count);
        intent.putExtra("q8a3count", q8a3count);


        // Pass counts for questions 9 to 16
        intent.putExtra("q9a1count", q9a1count);
        intent.putExtra("q9a2count", q9a2count);
        intent.putExtra("q9a3count", q9a3count);

        intent.putExtra("q10a1count", q10a1count);
        intent.putExtra("q10a2count", q10a2count);
        intent.putExtra("q10a3count", q10a3count);

        intent.putExtra("q11a1count", q11a1count);
        intent.putExtra("q11a2count", q11a2count);
        intent.putExtra("q11a3count", q11a3count);

        intent.putExtra("q12a1count", q12a1count);
        intent.putExtra("q12a2count", q12a2count);
        intent.putExtra("q12a3count", q12a3count);

        intent.putExtra("q13a1count", q13a1count);
        intent.putExtra("q13a2count", q13a2count);
        intent.putExtra("q13a3count", q13a3count);

        intent.putExtra("q14a1count", q14a1count);
        intent.putExtra("q14a2count", q14a2count);
        intent.putExtra("q14a3count", q14a3count);

        intent.putExtra("q15a1count", q15a1count);
        intent.putExtra("q15a2count", q15a2count);
        intent.putExtra("q15a3count", q15a3count);

        intent.putExtra("q16a1count", q16a1count);
        intent.putExtra("q16a2count", q16a2count);
        intent.putExtra("q16a3count", q16a3count);

        startActivity(intent);
    }

    public void doneButton(){

        // Check if any of the RadioGroups have no selection
        if (q9choices.getCheckedRadioButtonId() == -1 ||
                q10choices.getCheckedRadioButtonId() == -1 ||
                q11choices.getCheckedRadioButtonId() == -1 ||
                q12choices.getCheckedRadioButtonId() == -1 ||
                q13choices.getCheckedRadioButtonId() == -1 ||
                q14choices.getCheckedRadioButtonId() == -1 ||
                q15choices.getCheckedRadioButtonId() == -1 ||
                q16choices.getCheckedRadioButtonId() == -1) {
            // If any question is unanswered, show a message to the user
            Toast.makeText(this, "Please answer all questions", Toast.LENGTH_SHORT).show();
            return; // Exit the method without proceeding
        }

        Intent intent = new Intent(this, Personality_UserNameActivity.class);

        // Pass counts for questions 1 to 9
        intent.putExtra("q1a1count", q1a1count);
        intent.putExtra("q1a2count", q1a2count);
        intent.putExtra("q1a3count", q1a3count);

        intent.putExtra("q2a1count", q2a1count);
        intent.putExtra("q2a2count", q2a2count);
        intent.putExtra("q2a3count", q2a3count);

        intent.putExtra("q3a1count", q3a1count);
        intent.putExtra("q3a2count", q3a2count);
        intent.putExtra("q3a3count", q3a3count);

        intent.putExtra("q4a1count", q4a1count);
        intent.putExtra("q4a2count", q4a2count);
        intent.putExtra("q4a3count", q4a3count);

        intent.putExtra("q5a1count", q5a1count);
        intent.putExtra("q5a2count", q5a2count);
        intent.putExtra("q5a3count", q5a3count);

        intent.putExtra("q6a1count", q6a1count);
        intent.putExtra("q6a2count", q6a2count);
        intent.putExtra("q6a3count", q6a3count);

        intent.putExtra("q7a1count", q7a1count);
        intent.putExtra("q7a2count", q7a2count);
        intent.putExtra("q7a3count", q7a3count);

        intent.putExtra("q8a1count", q8a1count);
        intent.putExtra("q8a2count", q8a2count);
        intent.putExtra("q8a3count", q8a3count);


        // Pass counts for questions 9 to 16
        intent.putExtra("q9a1count", q9a1count);
        intent.putExtra("q9a2count", q9a2count);
        intent.putExtra("q9a3count", q9a3count);

        intent.putExtra("q10a1count", q10a1count);
        intent.putExtra("q10a2count", q10a2count);
        intent.putExtra("q10a3count", q10a3count);

        intent.putExtra("q11a1count", q11a1count);
        intent.putExtra("q11a2count", q11a2count);
        intent.putExtra("q11a3count", q11a3count);

        intent.putExtra("q12a1count", q12a1count);
        intent.putExtra("q12a2count", q12a2count);
        intent.putExtra("q12a3count", q12a3count);

        intent.putExtra("q13a1count", q13a1count);
        intent.putExtra("q13a2count", q13a2count);
        intent.putExtra("q13a3count", q13a3count);

        intent.putExtra("q14a1count", q14a1count);
        intent.putExtra("q14a2count", q14a2count);
        intent.putExtra("q14a3count", q14a3count);

        intent.putExtra("q15a1count", q15a1count);
        intent.putExtra("q15a2count", q15a2count);
        intent.putExtra("q15a3count", q15a3count);

        intent.putExtra("q16a1count", q16a1count);
        intent.putExtra("q16a2count", q16a2count);
        intent.putExtra("q16a3count", q16a3count);

        startActivity(intent);

    }

}
