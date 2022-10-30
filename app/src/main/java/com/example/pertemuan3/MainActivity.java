package com.example.pertemuan3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.Navigation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    ImageView gambarangkot;
    ImageView gambarbecak ;
    ImageView gambartaxi ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer);
        gambarangkot=(ImageView)findViewById(R.id.idangkot);
        gambarangkot.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent act2 = new Intent(MainActivity.this, angkot.class);
                startActivity(act2);
            }
        });
        gambartaxi = (ImageView)findViewById(R.id.idtaxi) ;
        gambartaxi.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent act3 = new Intent(MainActivity.this, taxi.class);
                startActivity(act3);
            }
        });
        gambarbecak=(ImageView)findViewById(R.id.idbus);
        gambarbecak.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent act4 = new Intent(MainActivity.this, becak.class);
                startActivity(act4);
            }
        });
  }







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