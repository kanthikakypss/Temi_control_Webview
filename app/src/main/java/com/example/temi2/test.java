package com.example.temi2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class test extends AppCompatActivity {
    WebView webview;
    Button google,Next;

    @SuppressLint("MissingInflatedId")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String packageName = "com.example.myapplication"; // replace with the package name of the app you want to launch
        Intent launchIntent = getPackageManager().getLaunchIntentForPackage(packageName);
        if (launchIntent != null) {
            startActivity(launchIntent);
        } else {
            // app not found
            Toast.makeText(this, "App not found", Toast.LENGTH_SHORT).show();
        }
    }
}
