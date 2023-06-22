package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    WebView webview;
    private Handler handler;
    private Runnable runnable;
    private int delayDuration = 5000;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webview = findViewById(R.id.B_web);
        WebSettings webSettings = webview.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webview.setWebViewClient(new Callback());
        webview.loadUrl("https://temi-food-web-app.vercel.app/");

        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {
                webview.reload();
            }
        };

        handler.postDelayed(runnable, delayDuration);
    }



    private class Callback extends WebViewClient {
        @Override
        public boolean shouldOverrideKeyEvent(WebView view, KeyEvent event) {
            return false;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // หยุดรันตัวจับเวลาเมื่อ Activity ถูกทำลาย
        handler.removeCallbacks(runnable);
    }

}


