package com.amigoapps.vidyantrik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getWindow().setNavigationBarColor(getColor(R.color.splashPrimary));
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent launch =new Intent(Splash.this,MainActivity.class);
                startActivity(launch);
                finish();
            }
        },1000);
    }
}