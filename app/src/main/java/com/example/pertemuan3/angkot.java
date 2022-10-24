package com.example.pertemuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class angkot extends AppCompatActivity {
    ImageView gambarbus;
    ImageView gambarbecak ;
    ImageView gambartaxi ;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angkot);
        gambarbus=(ImageView)findViewById(R.id.idangko1);
        gambarbus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent act2 = new Intent(angkot.this, MainActivity.class);
                startActivity(act2);
            }
        });
        gambartaxi = (ImageView)findViewById(R.id.idtaxi) ;
        gambartaxi.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent act3 = new Intent(angkot.this, taxi.class);
                startActivity(act3);
            }
        });
        gambarbecak=(ImageView)findViewById(R.id.idbus);
        gambarbecak.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent act4 = new Intent(angkot.this, becak.class);
                startActivity(act4);
            }
        });
    }
}