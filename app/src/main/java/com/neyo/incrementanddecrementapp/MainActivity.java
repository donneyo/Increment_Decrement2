package com.neyo.incrementanddecrementapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button inc, dec;
    TextView tV;
    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inc = findViewById(R.id.increment); dec = findViewById(R.id.decrement);
        tV = findViewById(R.id.textView);

        inc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                tV.setText(count +" Clicks!");
            }
        });

        dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count--;
                tV.setText(count +" Clicks!");
            }
        });


    }
}