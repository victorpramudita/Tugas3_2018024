package com.example.pertemuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class taxi extends AppCompatActivity {
    ImageView  gambarbus;
    ImageView gambarangkot;
    ImageView gambarbecak;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taxi);

        gambarbus = (ImageView) findViewById(R.id.idbus);
        gambarbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(taxi.this, MainActivity.class);
                startActivity(a);
            }
        });
        gambarbecak = (ImageView) findViewById(R.id.idbecak);
        gambarbecak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(taxi.this, becak.class);
                startActivity(a);
            }
        });
        gambarangkot = (ImageView) findViewById(R.id.idangkot);
        gambarangkot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(taxi.this, angkot.class);
                startActivity(a);
            }
        });

    }
}