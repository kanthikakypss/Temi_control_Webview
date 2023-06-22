package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Back extends AppCompatActivity {
    @SuppressLint("MissingInflatedId")
    @Override

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String packageName = "com.example.temi"; // replace with the package name of the app you want to launch
        Intent launchIntent = getPackageManager().getLaunchIntentForPackage(packageName);
        if (launchIntent != null) {
            startActivity(launchIntent);
        } else {
            // app not found
            Toast.makeText(this, "App not found", Toast.LENGTH_SHORT).show();
        }


    }

}
