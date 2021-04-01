package com.example.sellerapp.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.sellerapp.R;

public class Splash extends AppCompatActivity {
    private static int SPLASH_SCREEN = 2500;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                if(android.os.Build.VERSION.SDK_INT>=android.os.Build.VERSION_CODES.LOLLIPOP)
                {

                            startActivity(new Intent(Splash.this, Newuser.class));
                            finish();

                }
            }
        },SPLASH_SCREEN);


    }
}