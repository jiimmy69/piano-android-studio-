package com.example.piano;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b1;
    EditText btn1,btn2;
    TextView txt1,txt2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 =(Button) findViewById(R.id.login);
        btn1 = (EditText) findViewById(R.id.username);
        btn2 = (EditText) findViewById(R.id.pass);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btn1.getText().toString().equals("login")&&
                        btn2.getText().toString().equals("login")){
                    MainActivity.this.finish();
                    Intent i=new Intent(MainActivity.this,ChoixActivity.class);
                    startActivity(i);

                }else if(btn1.getText().toString().isEmpty()&&btn2.getText().toString().isEmpty()){


                    builder.setMessage("put your Username and password").setCancelable(false);
                    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                    }});
                    AlertDialog alert = builder.create();
                    alert.show();

                } else{
                    builder.setMessage(" Username or password is Wrong").setCancelable(false);
                    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                        }});
                    AlertDialog alert = builder.create();
                    alert.show();
                }
            }}
        );

    }

}