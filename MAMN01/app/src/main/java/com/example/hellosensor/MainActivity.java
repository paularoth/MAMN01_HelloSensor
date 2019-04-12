package com.example.hellosensor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.hellosensor.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void getAccelerometer(View view){
        Intent intent = new Intent(this, accelerometer.class);
        startActivity(intent);
    }

    public void getCompass(View view){
        Intent intent = new Intent(this, compass.class);
        startActivity(intent);
    }



}

