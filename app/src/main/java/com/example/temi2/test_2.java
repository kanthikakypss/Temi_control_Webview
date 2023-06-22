package com.example.temi2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class test_2 extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String packageName = "com.example.socket"; // replace with the package name of the app you want to launch
        Intent launchIntent = getPackageManager().getLaunchIntentForPackage(packageName);
        if (launchIntent != null) {
            startActivity(launchIntent);
        } else {
            // app not found
            Toast.makeText(this, "App not found", Toast.LENGTH_SHORT).show();
        }


    }
}
