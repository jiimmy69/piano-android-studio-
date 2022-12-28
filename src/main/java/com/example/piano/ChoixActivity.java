package com.example.piano;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ChoixActivity extends AppCompatActivity {
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choix);

        btn1=findViewById(R.id.BtnGuide);
        btn2=findViewById(R.id.BtnAutonome);
        btn3=findViewById(R.id.BtnSalut);
        btn4=findViewById(R.id.deconnection);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ChoixActivity.this, PianoGuideActivity.class));
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ChoixActivity.this, PianoAutoActivity.class));
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                builder.setMessage("Êtes vous sûr de Decconecter").setCancelable(false);
                builder.setPositiveButton("Oui" , new DialogInterface.OnClickListener() {

                            public void onClick(DialogInterface dialog, int id) {
                                ChoixActivity.this.finish();
                                startActivity(new Intent(ChoixActivity.this,MainActivity.class ));
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
}