package com.example.myquree;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

public class splac extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                /*Intent i = new Intent(MainActivity.this,HomeActivity.class);  startActivity(i); finish();*/
                Intent i =new Intent(splac.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        },9000);
    }
}






