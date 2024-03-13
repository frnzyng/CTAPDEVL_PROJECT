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

public class Personality_Questions1to8 extends AppCompatActivity {

    private Button nextbtn, musicbtn;
    private ImageView volume;
    private Drawable volumeOn, volumeOff;

    private RadioGroup q1choices, q2choices, q3choices, q4choices, q5choices, q6choices, q7choices, q8choices;

    private int q1a1count = 0, q1a2count = 0, q1a3count = 0, q2a1count = 0, q2a2count = 0, q2a3count = 0, q3a1count = 0, q3a2count = 0,
            q3a3count = 0, q4a1count = 0, q4a2count = 0, q4a3count = 0, q5a1count = 0, q5a2count = 0, q5a3count = 0, q6a1count = 0,
            q6a2count = 0, q6a3count = 0, q7a1count = 0, q7a2count = 0, q7a3count = 0, q8a1count = 0, q8a2count = 0, q8a3count = 0,
            q9a1count = 0, q9a2count = 0, q9a3count = 0, q10a1count = 0, q10a2count = 0, q10a3count = 0, q11a1count = 0, q11a2count = 0,
            q11a3count = 0, q12a1count = 0, q12a2count = 0, q12a3count = 0, q13a1count = 0, q13a2count = 0, q13a3count = 0, q14a1count = 0,
            q14a2count = 0, q14a3count = 0, q15a1count = 0, q15a2count = 0, q15a3count = 0, q16a1count = 0, q16a2count = 0, q16a3count = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personality_q1to8);

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


        q1choices = findViewById(R.id.q1choices);
        q2choices = findViewById(R.id.q2choices);
        q3choices = findViewById(R.id.q3choices);
        q4choices = findViewById(R.id.q4choices);
        q5choices = findViewById(R.id.q5choices);
        q6choices = findViewById(R.id.q6choices);
        q7choices = findViewById(R.id.q7choices);
        q8choices = findViewById(R.id.q8choices);


            // Restore checked state if previously saved
//        if (savedInstanceState != null) {
//            int q1checkedId = savedInstanceState.getInt("q1choicesCheckedId");
//            if (q1checkedId != -1) {
//                q1choices.check(q1checkedId);
//            }
//            int q2checkedId = savedInstanceState.getInt("q2choicesCheckedId");
//            if (q2checkedId != -1) {
//                q2choices.check(q2checkedId);
//            }
//            int q3checkedId = savedInstanceState.getInt("q3choicesCheckedId");
//            if (q3checkedId != -1) {
//                q3choices.check(q3checkedId);
//            }
//            int q4checkedId = savedInstanceState.getInt("q4choicesCheckedId");
//            if (q4checkedId != -1) {
//                q4choices.check(q4checkedId);
//            }
//            int q5checkedId = savedInstanceState.getInt("q5choicesCheckedId");
//            if (q5checkedId != -1) {
//                q5choices.check(q5checkedId);
//            }
//            int q6checkedId = savedInstanceState.getInt("q6choicesCheckedId");
//            if (q6checkedId != -1) {
//                q6choices.check(q6checkedId);
//            }
//            int q7checkedId = savedInstanceState.getInt("q7choicesCheckedId");
//            if (q7checkedId != -1) {
//                q7choices.check(q7checkedId);
//            }
//            int q8checkedId = savedInstanceState.getInt("q8choicesCheckedId");
//            if (q8checkedId != -1) {
//                q8choices.check(q8checkedId);
//            }
//        }

        q1choices.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.q1a1) {
                    q1a1count = 1;
                    q1a2count = 0;
                    q1a3count = 0;
                } else if (checkedId == R.id.q1a2) {
                    q1a1count = 0;
                    q1a2count = 1;
                    q1a3count = 0;
                } else if (checkedId == R.id.q1a3) {
                    q1a1count = 0;
                    q1a2count = 0;
                    q1a3count = 1;
                }

                Log.d("Count", "q1a1count = " + q1a1count);
                Log.d("Count", "q1a2count = " + q1a2count);
                Log.d("Count", "q1a3count = " + q1a3count);

            }
        });

        q2choices.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.q2a1) {
                    q2a1count = 1;
                    q2a2count = 0;
                    q2a3count = 0;
                } else if (checkedId == R.id.q2a2) {
                    q2a1count = 0;
                    q2a2count = 1;
                    q2a3count = 0;
                } else if (checkedId == R.id.q2a3) {
                    q2a1count = 0;
                    q2a2count = 0;
                    q2a3count = 1;
                }

                Log.d("Count", "q2a1count = " + q2a1count);
                Log.d("Count", "q2a2count = " + q2a2count);
                Log.d("Count", "q2a3count = " + q2a3count);
            }
        });

        q3choices.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.q3a1) {
                    q3a1count = 1;
                    q3a2count = 0;
                    q3a3count = 0;
                } else if (checkedId == R.id.q3a2) {
                    q3a1count = 0;
                    q3a2count = 1;
                    q3a3count = 0;
                } else if (checkedId == R.id.q3a3) {
                    q3a1count = 0;
                    q3a2count = 0;
                    q3a3count = 1;
                }

                Log.d("Count", "q3a1count = " + q3a1count);
                Log.d("Count", "q3a2count = " + q3a2count);
                Log.d("Count", "q3a3count = " + q3a3count);
            }
        });

        q4choices.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.q4a1) {
                    q4a1count = 1;
                    q4a2count = 0;
                    q4a3count = 0;
                } else if (checkedId == R.id.q4a2) {
                    q4a1count = 0;
                    q4a2count = 1;
                    q4a3count = 0;
                } else if (checkedId == R.id.q4a3) {
                    q4a1count = 0;
                    q4a2count = 0;
                    q4a3count = 1;
                }

                Log.d("Count", "q4a1count = " + q4a1count);
                Log.d("Count", "q4a2count = " + q4a2count);
                Log.d("Count", "q4a3count = " + q4a3count);
            }
        });

        q5choices.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.q5a1) {
                    q5a1count = 1;
                    q5a2count = 0;
                    q5a3count = 0;
                } else if (checkedId == R.id.q5a2) {
                    q5a1count = 0;
                    q5a2count = 1;
                    q5a3count = 0;
                } else if (checkedId == R.id.q5a3) {
                    q5a1count = 0;
                    q5a2count = 0;
                    q5a3count = 1;
                }

                Log.d("Count", "q5a1count = " + q5a1count);
                Log.d("Count", "q5a2count = " + q5a2count);
                Log.d("Count", "q5a3count = " + q5a3count);
            }
        });

        q6choices.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.q6a1) {
                    q6a1count = 1;
                    q6a2count = 0;
                    q6a3count = 0;
                } else if (checkedId == R.id.q6a2) {
                    q6a1count = 0;
                    q6a2count = 1;
                    q6a3count = 0;
                } else if (checkedId == R.id.q6a3) {
                    q6a1count = 0;
                    q6a2count = 0;
                    q6a3count = 1;
                }

                Log.d("Count", "q6a1count = " + q6a1count);
                Log.d("Count", "q6a2count = " + q6a2count);
                Log.d("Count", "q6a3count = " + q6a3count);
            }
        });

        q7choices.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.q7a1) {
                    q7a1count = 1;
                    q7a2count = 0;
                    q7a3count = 0;
                } else if (checkedId == R.id.q7a2) {
                    q7a1count = 0;
                    q7a2count = 1;
                    q7a3count = 0;
                } else if (checkedId == R.id.q7a3) {
                    q7a1count = 0;
                    q7a2count = 0;
                    q7a3count = 1;
                }

                Log.d("Count", "q7a1count = " + q7a1count);
                Log.d("Count", "q7a2count = " + q7a2count);
                Log.d("Count", "q7a3count = " + q7a3count);

            }
        });

        q8choices.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.q8a1) {
                    q8a1count = 1;
                    q8a2count = 0;
                    q8a3count = 0;
                } else if (checkedId == R.id.q8a2) {
                    q8a1count = 0;
                    q8a2count = 1;
                    q8a3count = 0;
                } else if (checkedId == R.id.q8a3) {
                    q8a1count = 0;
                    q8a2count = 0;
                    q8a3count = 1;
                }

                Log.d("Count", "q8a1count = " + q8a1count);
                Log.d("Count", "q8a2count = " + q8a2count);
                Log.d("Count", "q8a3count = " + q8a3count);
            }
        });


        nextbtn = (Button) findViewById(R.id.Qnextbtn);
        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextPage();
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

        // Set checked state of RadioButtons based on counts
        setCheckedRadioButtons();
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


    // Method to set checked state of RadioButtons based on counts
    private void setCheckedRadioButtons() {
        setCheckedRadioButton(q1choices, q1a1count, R.id.q1a1);
        setCheckedRadioButton(q1choices, q1a2count, R.id.q1a2);
        setCheckedRadioButton(q1choices, q1a3count, R.id.q1a3);

        setCheckedRadioButton(q2choices, q2a1count, R.id.q2a1);
        setCheckedRadioButton(q2choices, q2a2count, R.id.q2a2);
        setCheckedRadioButton(q2choices, q2a3count, R.id.q2a3);

        setCheckedRadioButton(q3choices, q3a1count, R.id.q3a1);
        setCheckedRadioButton(q3choices, q3a2count, R.id.q3a2);
        setCheckedRadioButton(q3choices, q3a3count, R.id.q3a3);

        setCheckedRadioButton(q4choices, q4a1count, R.id.q4a1);
        setCheckedRadioButton(q4choices, q4a2count, R.id.q4a2);
        setCheckedRadioButton(q4choices, q4a3count, R.id.q4a3);

        setCheckedRadioButton(q5choices, q5a1count, R.id.q5a1);
        setCheckedRadioButton(q5choices, q5a2count, R.id.q5a2);
        setCheckedRadioButton(q5choices, q5a3count, R.id.q5a3);

        setCheckedRadioButton(q6choices, q6a1count, R.id.q6a1);
        setCheckedRadioButton(q6choices, q6a2count, R.id.q6a2);
        setCheckedRadioButton(q6choices, q6a3count, R.id.q6a3);

        setCheckedRadioButton(q7choices, q7a1count, R.id.q7a1);
        setCheckedRadioButton(q7choices, q7a2count, R.id.q7a2);
        setCheckedRadioButton(q7choices, q7a3count, R.id.q7a3);

        setCheckedRadioButton(q8choices, q8a1count, R.id.q8a1);
        setCheckedRadioButton(q8choices, q8a2count, R.id.q8a2);
        setCheckedRadioButton(q8choices, q8a3count, R.id.q8a3);
    }


    // Method to set checked state of a RadioButton
    private void setCheckedRadioButton(RadioGroup radioGroup, int count, int radioButtonId) {
        RadioButton radioButton = findViewById(radioButtonId);
        if (count > 0) {
            radioButton.setChecked(true);
        } else {
            radioButton.setChecked(false);
        }
    }


    // Method to go to the next page
    private void nextPage() {

        // Check if any of the RadioGroups have no selection
        if (q1choices.getCheckedRadioButtonId() == -1 ||
                q2choices.getCheckedRadioButtonId() == -1 ||
                q3choices.getCheckedRadioButtonId() == -1 ||
                q4choices.getCheckedRadioButtonId() == -1 ||
                q5choices.getCheckedRadioButtonId() == -1 ||
                q6choices.getCheckedRadioButtonId() == -1 ||
                q7choices.getCheckedRadioButtonId() == -1 ||
                q8choices.getCheckedRadioButtonId() == -1) {
            // If any question is unanswered, show a message to the user
            Toast.makeText(this, "Please answer all questions", Toast.LENGTH_SHORT).show();
            return; // Exit the method without proceeding
        }

        Intent intent = new Intent(Personality_Questions1to8.this, Personality_Questions9to16.class);

        // Pass counts to the next activity
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

        // Pass counts for question 9 to 16 with default value 0
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


//    @Override
//    protected void onSaveInstanceState(Bundle outState) {
//        super.onSaveInstanceState(outState);
//        // Save checked state of RadioButtons
//        outState.putInt("q1choicesCheckedId", q1choices.getCheckedRadioButtonId());
//        outState.putInt("q2choicesCheckedId", q2choices.getCheckedRadioButtonId());
//        outState.putInt("q3choicesCheckedId", q3choices.getCheckedRadioButtonId());
//        outState.putInt("q4choicesCheckedId", q4choices.getCheckedRadioButtonId());
//        outState.putInt("q5choicesCheckedId", q5choices.getCheckedRadioButtonId());
//        outState.putInt("q6choicesCheckedId", q6choices.getCheckedRadioButtonId());
//        outState.putInt("q7choicesCheckedId", q7choices.getCheckedRadioButtonId());
//        outState.putInt("q8choicesCheckedId", q8choices.getCheckedRadioButtonId());
//    }
}
