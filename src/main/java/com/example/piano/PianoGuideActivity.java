package com.example.piano;

import static android.graphics.Color.BLACK;
import static android.graphics.Color.WHITE;
import static android.graphics.Color.YELLOW;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class PianoGuideActivity extends AppCompatActivity implements View.OnClickListener {
    boolean check = false;
    Button doBtn;
    Button Btn1;
    Button reBtn;
    Button Btn2;
    Button miBtn;
    Button Btn3;
    Button faBtn;
    Button Btn4;
    Button solBtn;
    Button laBtn;
    Button Btn5;
    MediaPlayer mediaPlayerDo;
    MediaPlayer mediaPlayerRe;
    MediaPlayer mediaPlayerMi;
    MediaPlayer mediaPlayerFa;
    MediaPlayer mediaPlayerSol;
    MediaPlayer mediaPlayerLa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piano_guide);

        doBtn = (Button) findViewById(R.id.doo);
        reBtn = (Button) findViewById(R.id.re);
        miBtn = (Button) findViewById(R.id.mi);
        laBtn = (Button) findViewById(R.id.la);
        faBtn = (Button) findViewById(R.id.fa);
        solBtn = (Button) findViewById(R.id.sol);
        Btn1 = (Button) findViewById(R.id.Btn1);
        Btn2 = (Button) findViewById(R.id.Btn2);
        Btn3 = (Button) findViewById(R.id.Btn3);
        Btn4 = (Button) findViewById(R.id.Btn4);
        Btn5 = (Button) findViewById(R.id.Btn5);


        doBtn.setOnClickListener(this);
        reBtn.setOnClickListener(this);
        miBtn.setOnClickListener(this);
        faBtn.setOnClickListener(this);
        solBtn.setOnClickListener(this);
        laBtn.setOnClickListener(this);
        Btn1.setOnClickListener(this);
        Btn2.setOnClickListener(this);
        Btn3.setOnClickListener(this);
        Btn4.setOnClickListener(this);
        Btn5.setOnClickListener(this);

        mediaPlayerDo = MediaPlayer.create(this, R.raw.doo);
        mediaPlayerRe = MediaPlayer.create(this, R.raw.re);
        mediaPlayerMi = MediaPlayer.create(this, R.raw.mi);
        mediaPlayerFa = MediaPlayer.create(this, R.raw.fa);
        mediaPlayerSol = MediaPlayer.create(this, R.raw.sol);
        mediaPlayerLa = MediaPlayer.create(this, R.raw.la);


        doBtn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    doBtn.setBackgroundColor(WHITE);
                } else if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    doBtn.setBackgroundColor(YELLOW);
                }
                return false;
            }
        });

        reBtn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    reBtn.setBackgroundColor(WHITE);
                } else if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    reBtn.setBackgroundColor(YELLOW);
                }
                return false;
            }
        });
        miBtn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    miBtn.setBackgroundColor(WHITE);
                } else if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    miBtn.setBackgroundColor(YELLOW);
                }
                return false;
            }
        });
        faBtn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    faBtn.setBackgroundColor(WHITE);
                } else if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    faBtn.setBackgroundColor(YELLOW);
                }
                return false;
            }
        });


        solBtn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    solBtn.setBackgroundColor(WHITE);
                } else if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    solBtn.setBackgroundColor(YELLOW);
                }
                return false;
            }
        });

        laBtn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    laBtn.setBackgroundColor(WHITE);
                } else if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    laBtn.setBackgroundColor(YELLOW);
                }
                return false;
            }
        });

        Btn1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    Btn1.setBackgroundColor(BLACK);
                } else if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    Btn1.setBackgroundColor(YELLOW);
                }
                return false;
            }
        });

        Btn2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    Btn2.setBackgroundColor(BLACK);
                } else if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    Btn2.setBackgroundColor(YELLOW);
                }
                return false;
            }
        });

        Btn3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    Btn3.setBackgroundColor(BLACK);
                } else if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    Btn3.setBackgroundColor(YELLOW);
                }
                return false;
            }
        });

        Btn4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    Btn4.setBackgroundColor(BLACK);
                } else if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    Btn4.setBackgroundColor(YELLOW);
                }
                return false;
            }
        });
        Btn5.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    Btn5.setBackgroundColor(BLACK);
                } else if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    Btn5.setBackgroundColor(YELLOW);
                }

                return false;
            }
        });


    }



    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.doo:
                mediaPlayerDo = MediaPlayer.create(this,R.raw.doo);
                mediaPlayerDo.start();
                break;
                case R.id.re:
                mediaPlayerRe = MediaPlayer.create(this,R.raw.re);
                mediaPlayerRe.start();
                break;
            case R.id.mi:
                mediaPlayerMi = MediaPlayer.create(this,R.raw.mi);
                mediaPlayerMi.start();
                break;
            case R.id.fa:
                mediaPlayerFa = MediaPlayer.create(this,R.raw.fa);
                mediaPlayerFa.start();
                break;
            case R.id.sol:
                mediaPlayerSol = MediaPlayer.create(this,R.raw.sol);
                mediaPlayerSol.start();
                break;
            case R.id.la:
                mediaPlayerLa = MediaPlayer.create(this,R.raw.la);
                mediaPlayerLa.start();
                break;
            case R.id.Btn1:
                mediaPlayerDo.start();
                break;
            case R.id.Btn2:
                mediaPlayerRe.start();
                break;
            case R.id.Btn3:
                mediaPlayerMi.start();
                break;
            case R.id.Btn4:
                 mediaPlayerFa.start();
                break;
            case R.id.Btn5:
                mediaPlayerSol.start();
                break;



        }}


}