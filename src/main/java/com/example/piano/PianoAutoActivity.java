package com.example.piano;

import static android.graphics.Color.BLACK;
import static android.graphics.Color.WHITE;
import static android.graphics.Color.YELLOW;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class PianoAutoActivity extends AppCompatActivity{
    private Button deco;
    private Button back;
    private Button guidee;
    private Button morc1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piano_auto);
        startActivityForResult(new Intent(PianoAutoActivity.this,morc1.class),250);
        morc1 = findViewById(R.id.morc1);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        deco = findViewById(R.id.deco);
        back = findViewById(R.id.choix);
        guidee = findViewById(R.id.guide);

        deco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                builder.setMessage("Êtes vous sûr de Decconecter").setCancelable(false);
                builder.setPositiveButton("Oui" , new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int id) {
                        PianoAutoActivity.this.finish();
                        startActivity(new Intent(PianoAutoActivity.this,MainActivity.class));
                    }
                });
                builder.setNegativeButton("Non", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
                AlertDialog alert = builder.create();
                alert.show();

            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                builder.setMessage("Sure ? you want back !! ").setCancelable(false);
                builder.setPositiveButton("Oui"

                        , new DialogInterface.OnClickListener() {

                            public void onClick(DialogInterface dialog, int id) {
                                PianoAutoActivity.this.finish();
                                startActivity(new Intent(PianoAutoActivity.this,ChoixActivity.class));
                            }
                        });
                builder.setNegativeButton("Non", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
                AlertDialog alert = builder.create();
                alert.show();

            }
        });
        morc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                builder.setMessage("Sure ? you want back !! ").setCancelable(false);
                builder.setPositiveButton("Oui"

                        , new DialogInterface.OnClickListener() {

                            public void onClick(DialogInterface dialog, int id) {
                                PianoAutoActivity.this.finish();
                                startActivity(new Intent(PianoAutoActivity.this,morc1.class));
                            }
                        });
                builder.setNegativeButton("Non", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
                AlertDialog alert = builder.create();
                alert.show();

            }
        });


        guidee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                builder.setMessage(" you want to go to Piano Guider? !! ").setCancelable(false);
                builder.setPositiveButton("Oui"

                        , new DialogInterface.OnClickListener() {

                            public void onClick(DialogInterface dialog, int id) {
                                PianoAutoActivity.this.finish();
                                startActivity(new Intent(PianoAutoActivity.this,PianoGuideActivity.class));
                            }
                        });
                builder.setNegativeButton("Non", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
                AlertDialog alert = builder.create();
                alert.show();

            }
        });


    }
    AlertDialog.Builder builder = new AlertDialog.Builder(this);

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {

        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 250) {




            if (resultCode == RESULT_OK) {

                builder.setMessage("Êtes vous sûr de vouloir quitter?").setCancelable(false);
                builder.setPositiveButton("Oui", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int id) {

                            }
                        });
                builder.setNegativeButton("Non", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();

                    }
                });

                AlertDialog alert = builder.create();
                alert.show();

            }


        }

    }

   }