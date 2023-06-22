package com.example.temi2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.robotemi.sdk.Robot;

import java.net.Inet4Address;

public class Activity2 extends AppCompatActivity {

    Button btnBack,btnweb,btnsocket,btnB,btnC;
    TextView check;
    private Robot robot;
    private  String locationb = "b";
    private  String locationc = "c";

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        robot = Robot.getInstance();
        btnBack = findViewById(R.id.B_Back);
//        btnweb = findViewById(R.id.B_web);
//        btnsocket = findViewById(R.id.btn_socket);
        btnB = findViewById(R.id.B_gob);
        btnC = findViewById(R.id.B_goc);
//        check = findViewById(R.id.textView);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity();
            }
        });

        //openBrowser
        /*btnWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Uri uri = Uri.parse("https://www.google.com/");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);


               *//* Intent Webintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/"));
                startActivity(Webintent);*//*
                }catch (Exception e ){
                    check.setText(e.toString());
                    e.printStackTrace();
                }
            }
        });*/


        btnweb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               try {
                   opentest();

//                   finish();
//                   System.exit(0);
               }catch (Exception e ){
                   check.setText(e.toString());
                   e.printStackTrace();
               }
            }
        });

        btnsocket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    opentest_2();

//                    finish();
//                    System.exit(0);
                }catch (Exception e ){
                    check.setText(e.toString());
                    e.printStackTrace();
                }
            }
        });

        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (String location : robot.getLocations()) {
                    if (location.equals(locationb.trim())) {
                        robot.goTo(locationb.trim());
                    }
                }
                Intent intent4 = new Intent(getApplicationContext(),Activity2.class);
                startActivity(intent4);
            }
        });

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (String location : robot.getLocations()) {
                    if (location.equals(locationc.trim())) {
                        robot.goTo(locationc.trim());
                    }
                }
                Intent intent2 = new Intent(getApplicationContext(),Activity2.class);
                startActivity(intent2);
            }
        });

    }
    public void openMainActivity(){
        Intent intent5 = new Intent(this, MainActivity.class);
        startActivity(intent5);
    }

    public void opentest(){
        Intent intent = new Intent(this, test.class);
        startActivity(intent);
    }

    public void opentest_2(){
        Intent intent = new Intent(this, test_2.class);
        startActivity(intent);
    }


}