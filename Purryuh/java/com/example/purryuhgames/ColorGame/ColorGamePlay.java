package com.example.purryuhgames.ColorGame;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import androidx.appcompat.app.AppCompatActivity;

import com.example.purryuhgames.GameSelectorPage;
import com.example.purryuhgames.R;
import com.example.purryuhgames.databinding.ColorGamePlayBinding;

import java.util.Random;

public class ColorGamePlay extends AppCompatActivity {
    private ColorGamePlayBinding binding;

    boolean RCW1;
    boolean RCW2;
    boolean RCW3;
    boolean RCW4;
    boolean RCW5;
    boolean RCW6;
    boolean RCW7;
    boolean RCW8;
    boolean RCW9;

    boolean Die1RedWinner;
    boolean Die2blueWinner;
    boolean Die3greenWinner;
    boolean Die4yellowWinner;
    boolean Die5orangeWinner;
    boolean Die6pinkWinner;
    boolean Die7violetWinner;
    boolean Die8whiteWinner;
    boolean Die9blackWinner;


    MediaPlayer mp1 = new MediaPlayer();
    static MediaPlayer mp2 = new MediaPlayer();
    MediaPlayer mp3 = new MediaPlayer();
    MediaPlayer mp4 = new MediaPlayer();

    boolean PickedColor = false;
    boolean PickedColor2 = false;
    boolean PickedColor3 = false;
    boolean PickedColor4 = false;
    boolean PickedColor5 = false;
    boolean PickedColor6 = false;
    boolean PickedColor7 = false;
    boolean PickedColor8 = false;
    boolean PickedColor9 = false;
    boolean PlayerPickedColorChecker = false;

    boolean muteActivate;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.color_game_play);
        binding = ColorGamePlayBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        mp1 = MediaPlayer.create(this, R.raw.dicerollsound);
        mp2 = MediaPlayer.create(this, R.raw.bgmusiccolorgame);
        mp3 = MediaPlayer.create(this, R.raw.winsound);
        mp4 = MediaPlayer.create(this, R.raw.losesound);

        mp2.setLooping(true);
        mp2.start();


        binding.homee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), GameSelectorPage.class);
                startActivity(intent);
            }
        });



        binding.muteB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mp2.isPlaying()) {
                    muteActivate = true;
                    mp2.pause();
                    binding.muteB.setImageResource(android.R.drawable.ic_lock_silent_mode_off);
                }else if (muteActivate=true){
                    muteActivate = false;
                    mp2.start();
                    binding.muteB.setImageResource(android.R.drawable.ic_lock_silent_mode);
                }
            }
        });


        binding.MainDie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.MainDie.playAnimation();
                mp1.start();

            }


        });

        binding.Die1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PlayerPickedColorChecker = true;
                PickedColor = true;
                binding.Die2.setVisibility(View.INVISIBLE);
                binding.Die3.setVisibility(View.INVISIBLE);
                binding.Die4.setVisibility(View.INVISIBLE);
                binding.Die5.setVisibility(View.INVISIBLE);
                binding.Die6.setVisibility(View.INVISIBLE);
                binding.Die7.setVisibility(View.INVISIBLE);
                binding.Die8.setVisibility(View.INVISIBLE);
                binding.Die9.setVisibility(View.INVISIBLE);
            }
        });

        binding.Die2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickedColor2 = true;
                PlayerPickedColorChecker = true;
                binding.Die1.setVisibility(View.INVISIBLE);
                binding.Die3.setVisibility(View.INVISIBLE);
                binding.Die4.setVisibility(View.INVISIBLE);
                binding.Die5.setVisibility(View.INVISIBLE);
                binding.Die6.setVisibility(View.INVISIBLE);
                binding.Die7.setVisibility(View.INVISIBLE);
                binding.Die8.setVisibility(View.INVISIBLE);
                binding.Die9.setVisibility(View.INVISIBLE);

            }
        });

        binding.Die3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PlayerPickedColorChecker = true;
                PickedColor3 = true;
                binding.Die2.setVisibility(View.INVISIBLE);
                binding.Die1.setVisibility(View.INVISIBLE);
                binding.Die4.setVisibility(View.INVISIBLE);
                binding.Die5.setVisibility(View.INVISIBLE);
                binding.Die6.setVisibility(View.INVISIBLE);
                binding.Die7.setVisibility(View.INVISIBLE);
                binding.Die8.setVisibility(View.INVISIBLE);
                binding.Die9.setVisibility(View.INVISIBLE);
            }
        });

        binding.Die4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PlayerPickedColorChecker = true;
                PickedColor4 = true;
                binding.Die2.setVisibility(View.INVISIBLE);
                binding.Die3.setVisibility(View.INVISIBLE);
                binding.Die1.setVisibility(View.INVISIBLE);
                binding.Die5.setVisibility(View.INVISIBLE);
                binding.Die6.setVisibility(View.INVISIBLE);
                binding.Die7.setVisibility(View.INVISIBLE);
                binding.Die8.setVisibility(View.INVISIBLE);
                binding.Die9.setVisibility(View.INVISIBLE);
            }
        });

        binding.Die5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PlayerPickedColorChecker = true;
                PickedColor5 = true;
                binding.Die2.setVisibility(View.INVISIBLE);
                binding.Die3.setVisibility(View.INVISIBLE);
                binding.Die4.setVisibility(View.INVISIBLE);
                binding.Die1.setVisibility(View.INVISIBLE);
                binding.Die6.setVisibility(View.INVISIBLE);
                binding.Die7.setVisibility(View.INVISIBLE);
                binding.Die8.setVisibility(View.INVISIBLE);
                binding.Die9.setVisibility(View.INVISIBLE);
            }
        });

        binding.Die6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PlayerPickedColorChecker = true;
                PickedColor6 = true;
                binding.Die2.setVisibility(View.INVISIBLE);
                binding.Die3.setVisibility(View.INVISIBLE);
                binding.Die4.setVisibility(View.INVISIBLE);
                binding.Die5.setVisibility(View.INVISIBLE);
                binding.Die1.setVisibility(View.INVISIBLE);
                binding.Die7.setVisibility(View.INVISIBLE);
                binding.Die8.setVisibility(View.INVISIBLE);
                binding.Die9.setVisibility(View.INVISIBLE);
            }
        });




        binding.Die7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PlayerPickedColorChecker = true;
                PickedColor7 = true;
                binding.Die2.setVisibility(View.INVISIBLE);
                binding.Die3.setVisibility(View.INVISIBLE);
                binding.Die4.setVisibility(View.INVISIBLE);
                binding.Die5.setVisibility(View.INVISIBLE);
                binding.Die6.setVisibility(View.INVISIBLE);
                binding.Die1.setVisibility(View.INVISIBLE);
                binding.Die8.setVisibility(View.INVISIBLE);
                binding.Die9.setVisibility(View.INVISIBLE);
            }
        });


        binding.Die8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickedColor8 = true;
                PlayerPickedColorChecker = true;
                binding.Die2.setVisibility(View.INVISIBLE);
                binding.Die3.setVisibility(View.INVISIBLE);
                binding.Die4.setVisibility(View.INVISIBLE);
                binding.Die5.setVisibility(View.INVISIBLE);
                binding.Die6.setVisibility(View.INVISIBLE);
                binding.Die7.setVisibility(View.INVISIBLE);
                binding.Die1.setVisibility(View.INVISIBLE);
                binding.Die9.setVisibility(View.INVISIBLE);
            }
        });


        binding.Die9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PlayerPickedColorChecker = true;
                PickedColor9 = true;
                binding.Die2.setVisibility(View.INVISIBLE);
                binding.Die3.setVisibility(View.INVISIBLE);
                binding.Die4.setVisibility(View.INVISIBLE);
                binding.Die5.setVisibility(View.INVISIBLE);
                binding.Die6.setVisibility(View.INVISIBLE);
                binding.Die7.setVisibility(View.INVISIBLE);
                binding.Die8.setVisibility(View.INVISIBLE);
                binding.Die1.setVisibility(View.INVISIBLE);
            }
        });

        binding.RollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(PlayerPickedColorChecker == true) {

                    binding.MainDie.playAnimation();
                    binding.RollButton.setVisibility(View.INVISIBLE);
                    DiceRandomMizer();


                    int delayMillis = 3900;
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            binding.ResetButton.setVisibility(View.VISIBLE);
                        }
                    }, delayMillis);
                } else{
                    binding.WarningCP.setVisibility(View.VISIBLE);
                    int delayMillis = 1500;
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            binding.WarningCP.setVisibility(View.INVISIBLE);
                        }
                    }, delayMillis);

                }

            }

            private void DiceRandomMizer() {
                Random rnd = new Random();
                int RandomNumber = rnd.nextInt(9)+1;
                Animation anim = AnimationUtils.loadAnimation(ColorGamePlay.this, R.anim.rotate);



                int delayMillis = 2400;
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        switch(RandomNumber){
                            case 1:
                                binding.ColorWinner.setImageResource(R.drawable.red1);
                                binding.ColorWinner.setVisibility(View.VISIBLE);
                                binding.ColorWinner.startAnimation(anim);
                                mp1.start();
                                RCW1 = true;
                                RCW2 = false;
                                RCW3 = false;
                                RCW4 = false;
                                RCW5 = false;
                                RCW6 = false;
                                RCW7 = false;
                                RCW8 = false;
                                RCW9 = false;
                                break;

                            case 2:
                                binding.ColorWinner.setImageResource(R.drawable.blue2);
                                binding.ColorWinner.setVisibility(View.VISIBLE);
                                binding.ColorWinner.startAnimation(anim);
                                mp1.start();
                                RCW1 = false;
                                RCW2 = true;
                                RCW3 = false;
                                RCW4 = false;
                                RCW5 = false;
                                RCW6 = false;
                                RCW7 = false;
                                RCW8 = false;
                                RCW9 = false;
                                break;

                            case 3:
                                binding.ColorWinner.setImageResource(R.drawable.green3);
                                binding.ColorWinner.setVisibility(View.VISIBLE);
                                binding.ColorWinner.startAnimation(anim);
                                mp1.start();
                                RCW1 = false;
                                RCW2 = false;
                                RCW3 = true;
                                RCW4 = false;
                                RCW5 = false;
                                RCW6 = false;
                                RCW7 = false;
                                RCW8 = false;
                                RCW9 = false;
                                break;

                            case 4:
                                binding.ColorWinner.setImageResource(R.drawable.yellow4);
                                binding.ColorWinner.setVisibility(View.VISIBLE);
                                binding.ColorWinner.startAnimation(anim);
                                mp1.start();
                                RCW1 = false;
                                RCW2 = false;
                                RCW3 = false;
                                RCW4 = true;
                                RCW5 = false;
                                RCW6 = false;
                                RCW7 = false;
                                RCW8 = false;
                                RCW9 = false;
                                break;

                            case 5:
                                binding.ColorWinner.setImageResource(R.drawable.orange5);
                                binding.ColorWinner.setVisibility(View.VISIBLE);
                                binding.ColorWinner.startAnimation(anim);
                                mp1.start();
                                RCW1 = false;
                                RCW2 = false;
                                RCW3 = false;
                                RCW4 = false;
                                RCW5 = true;
                                RCW6 = false;
                                RCW7 = false;
                                RCW8 = false;
                                RCW9 = false;
                                break;

                            case 6:
                                binding.ColorWinner.setImageResource(R.drawable.pink6);
                                binding.ColorWinner.setVisibility(View.VISIBLE);
                                binding.ColorWinner.startAnimation(anim);
                                mp1.start();
                                RCW1 = false;
                                RCW2 = false;
                                RCW3 = false;
                                RCW4 = false;
                                RCW5 = false;
                                RCW6 = true;
                                RCW7 = false;
                                RCW8 = false;
                                RCW9 = false;
                                break;

                            case 7:
                                binding.ColorWinner.setImageResource(R.drawable.violet7);
                                binding.ColorWinner.setVisibility(View.VISIBLE);
                                binding.ColorWinner.startAnimation(anim);
                                mp1.start();
                                RCW1 = false;
                                RCW2 = false;
                                RCW3 = false;
                                RCW4 = false;
                                RCW5 = false;
                                RCW6 = false;
                                RCW7 = true;
                                RCW8 = false;
                                RCW9 = false;
                                break;

                            case 8:
                                binding.ColorWinner.setImageResource(R.drawable.white8);
                                binding.ColorWinner.setVisibility(View.VISIBLE);
                                binding.ColorWinner.startAnimation(anim);
                                mp1.start();
                                RCW1 = false;
                                RCW2 = false;
                                RCW3 = false;
                                RCW4 = false;
                                RCW5 = false;
                                RCW6 = false;
                                RCW7 = false;
                                RCW8 = true;
                                RCW9 = false;
                                break;

                            case 9:
                                binding.ColorWinner.setImageResource(R.drawable.black9);
                                binding.ColorWinner.setVisibility(View.VISIBLE);
                                binding.ColorWinner.startAnimation(anim);
                                mp1.start();
                                RCW1 = false;
                                RCW2 = false;
                                RCW3 = false;
                                RCW4 = false;
                                RCW5 = false;
                                RCW6 = false;
                                RCW7 = false;
                                RCW8 = false;
                                RCW9 = true;
                                break;
                        }

                        WinLogic();


                    }



                    private void WinLogic() {
                        int delayMillis = 1500;
                        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                if(RCW1 == true && PickedColor == true){

                                    binding.winnerView.setVisibility(View.VISIBLE);
                                    binding.confetti.setVisibility(View.VISIBLE);
                                    mp3.start();
                                    mp2.pause();


                                } else if(RCW2 == true && PickedColor2 == true){

                                    binding.winnerView.setVisibility(View.VISIBLE);
                                    binding.confetti.setVisibility(View.VISIBLE);
                                    binding.loseview.setVisibility(View.INVISIBLE);
                                    mp3.start();
                                    mp2.pause();
                                }
                                else if(RCW3 == true && PickedColor3 == true){



                                    binding.winnerView.setVisibility(View.VISIBLE);
                                    binding.confetti.setVisibility(View.VISIBLE);
                                    binding.loseview.setVisibility(View.INVISIBLE);
                                    mp3.start();
                                    mp2.pause();

                                } else if(RCW4 == true && PickedColor4 == true){



                                    binding.winnerView.setVisibility(View.VISIBLE);
                                    binding.confetti.setVisibility(View.VISIBLE);
                                    binding.loseview.setVisibility(View.INVISIBLE);
                                    mp3.start();
                                    mp2.pause();

                                } else if(RCW5 == true && PickedColor5 == true){



                                    binding.winnerView.setVisibility(View.VISIBLE);
                                    binding.confetti.setVisibility(View.VISIBLE);
                                    binding.loseview.setVisibility(View.INVISIBLE);
                                    mp3.start();
                                    mp2.pause();

                                }else if(RCW6 == true && PickedColor6 == true){



                                    binding.winnerView.setVisibility(View.VISIBLE);
                                    binding.confetti.setVisibility(View.VISIBLE);
                                    binding.loseview.setVisibility(View.INVISIBLE);
                                    mp3.start();
                                    mp2.pause();

                                } else if(RCW7 == true && PickedColor7 == true){



                                    binding.winnerView.setVisibility(View.VISIBLE);
                                    binding.confetti.setVisibility(View.VISIBLE);
                                    binding.loseview.setVisibility(View.INVISIBLE);
                                    mp3.start();
                                    mp2.pause();

                                } else if(RCW8 == true && PickedColor8 == true){



                                    binding.winnerView.setVisibility(View.VISIBLE);
                                    binding.confetti.setVisibility(View.VISIBLE);
                                    binding.loseview.setVisibility(View.INVISIBLE);
                                    mp3.start();
                                    mp2.pause();

                                } else if(RCW9 == true && PickedColor9 == true){


                                    binding.winnerView.setVisibility(View.VISIBLE);
                                    binding.confetti.setVisibility(View.VISIBLE);
                                    binding.loseview.setVisibility(View.INVISIBLE);
                                    mp3.start();
                                    mp2.pause();

                                } else {


                                    binding.loseview.setVisibility(View.VISIBLE);
                                    binding.sadlose.setVisibility(View.VISIBLE);
                                    binding.sadlose.playAnimation();
                                    mp4.start();
                                    mp2.pause();
                                }

                            }
                        }, delayMillis);
                    }

                    private void loseee() {

                        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                binding.loseview.setVisibility(View.VISIBLE);
                                mp4.start();
                                mp2.pause();
                            }
                        }, delayMillis);
                    }
                }, delayMillis);

            }


        });

        binding.ResetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickedColor = false;
                PickedColor2 = false;
                PickedColor3 = false;
                PickedColor4 = false;
                PickedColor5 = false;
                PickedColor6 = false;
                PickedColor7 = false;
                PickedColor8 = false;
                PickedColor9 = false;
                binding.ColorWinner.setVisibility(View.INVISIBLE);
                binding.RollButton.setVisibility(View.VISIBLE);
                binding.ResetButton.setVisibility(View.INVISIBLE);
                binding.winnerView.setVisibility(View.INVISIBLE);
                RCW1 = false;
                RCW2 = false;
                RCW3 = false;
                RCW4 = false;
                RCW5 = false;
                RCW6 = false;
                RCW7 = false;
                RCW8 = false;
                RCW9 = false;

                binding.Die2.setVisibility(View.VISIBLE);
                binding.Die3.setVisibility(View.VISIBLE);
                binding.Die4.setVisibility(View.VISIBLE);
                binding.Die5.setVisibility(View.VISIBLE);
                binding.Die6.setVisibility(View.VISIBLE);
                binding.Die7.setVisibility(View.VISIBLE);
                binding.Die8.setVisibility(View.VISIBLE);
                binding.Die9.setVisibility(View.VISIBLE);
                binding.Die1.setVisibility(View.VISIBLE);
                PlayerPickedColorChecker = false;
                binding.confetti.setVisibility(View.INVISIBLE);
                binding.loseview.setVisibility(View.INVISIBLE);
                binding.sadlose.setVisibility(View.INVISIBLE);
                if((mp2.isPlaying() == false && muteActivate) == false){
                    mp2.start();}

            }
        });



    }

    @Override
    protected void onPause() {
        super.onPause();
        // Stop the background music when activity is paused
        if (mp2 != null && mp2.isPlaying()) {
            mp2.pause();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Release the MediaPlayer instance when activity is destroyed
        if (mp2 != null) {
            mp2.release();
            mp2 = null;
        }
    }

}
