package com.example.pertemuan3;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.becak);
  }

    ImageView gambarangkot = (ImageView) findViewById(R.id.idangkot);
    ImageView gambarbecak = (ImageView) findViewById(R.id.idangkot);
    ImageView gambartaxi = (ImageView) findViewById(R.id.idangkot);
    gambarangkot.setOnClickListener(new View.OnClickListener() {
        public void onClick(View view) {
            Intent act2 = new Intent(view.getContext(), angkot.class);
            startActivity(act2);
        }
    });
      gambartaxi.setOnClickListener(new View.OnClickListener() {
        public void onClick(View view) {
            Intent act3 = new Intent(view.getContext(), taxi.class);
            startActivity(act3);
        }
    });
        gambarbecak.setOnClickListener(new View.OnClickListener() {
        public void onClick(View view) {
            Intent act4 = new Intent(view.getContext(), becak.class);
            startActivity(act4);
        }
    });




//public void angkot (View view){
//        Intent a = new Intent(MainActivity.this, angkot.class);
//        startActivity(a);
//}
//    public void taxi (View view){
//        Intent b = new Intent(MainActivity.this, taxi.class);
//        startActivity(b);
//    }
//    public void becak (View view){
//        Intent c = new Intent(MainActivity.this, becak.class);
//        startActivity(c);
//    }

}