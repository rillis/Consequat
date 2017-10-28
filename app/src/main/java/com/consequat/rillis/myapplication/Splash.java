package com.consequat.rillis.myapplication;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Handler handle = new Handler();
        handle.postDelayed(new Runnable() {
            @Override
            public void run() {
                mostrar();
            }
        }, 1000);
    }

    private void mostrar() {
        Intent intent = new Intent(Splash.this,
                Principal.class);
        startActivity(intent);
        finish();
    }
}
