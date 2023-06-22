package com.example.temi2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import com.robotemi.sdk.Robot;
import com.robotemi.sdk.TtsRequest;

import androidx.appcompat.app.AppCompatActivity;

import com.github.nkzawa.emitter.Emitter;

public class buttoninsdklo extends AppCompatActivity {
    /*Button btnA, btnHome;;
    private Robot robot;
    private  String Home = "home base";
    private  String locationa = "goa";
    final Handler handler = new Handler();

    @Override
     protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button);
        robot = Robot.getInstance();

        btnA = findViewById(R.id.buttonn);
        btnHome = findViewById(R.id.buttonn2);

        for (String location : robot.getLocations()) {
            if (location.equals(locationa.toLowerCase().trim())) {
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        robot.goTo(locationa.toLowerCase().trim());
                        Intent intent1 = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(intent1);
                    }
                }, 3000);
            }
        }

        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (String location : robot.getLocations()){
                    if (location.equals(Home.trim())){
                        robot.goTo(Home.trim());

                    }
                }

                Intent intent2 = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent2);
            }
        });

        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent3);
            }
        });
    } */
/*
    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        google = findViewById(R.id.button);

        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://projectbundesliga.000webhostapp.com/");
            }
        });

    }

    private void goLink(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
*/
    }

