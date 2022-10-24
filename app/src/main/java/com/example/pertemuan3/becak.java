package com.example.pertemuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class becak extends AppCompatActivity {
    ImageView gambarbus;
    ImageView gambarangkot ;
    ImageView gambartaxi ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_becak);

        gambarbus=(ImageView)findViewById(R.id.idbus);
        gambarbus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent act2 = new Intent(becak.this, MainActivity.class);
                startActivity(act2);
            }
        });
        gambartaxi = (ImageView)findViewById(R.id.idtaxi) ;
        gambartaxi.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent act3 = new Intent(becak.this, taxi.class);
                startActivity(act3);
            }
        });
        gambarangkot=(ImageView)findViewById(R.id.idangkot);
        gambarangkot.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent act4 = new Intent(becak.this, angkot.class);
                startActivity(act4);
            }
        });
    }
    }
