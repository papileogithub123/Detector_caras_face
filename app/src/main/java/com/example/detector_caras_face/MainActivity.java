package com.example.detector_caras_face;



import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import android.widget.TextView;
import android.widget.Toast;

import java.util.List;


public class MainActivity extends AppCompatActivity {
    Button btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("log1", " esta es una prueba " +ss);

      //   btn1=(Button) findViewById(R.id.button);
     //   btn2=(Button) findViewById(R.id.button2);
      //  final TextView tx1;tx1=(TextView) findViewById(R.id.tex1);

        Toast.makeText(this,"fsdfdsf",Toast.LENGTH_LONG).show();
        

      //  List<String> androids = List.of("Kitkat", "Lollipop", "Marshmallow");
    }
    int ss=10;
 }
