package com.example.saeed.educationalapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {
    int number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //messi metod
    }


    public void messi(View view) {
        number += 1;
    }

    public void ronaldo(View view) {
        number -= 1;
    }
    //bufoon metod

    public void buffon(View view) {
        number += 1;
    }

    public void casillas(View view) {
        number -= 1;
    }
    //cavani metod

    public void cavani(View view) {
        number += 1;
    }

    public void iniesta(View view) {
        number -= 1;
    }
    //ibrahimovic metod

    public void ibrahimovic(View view) {
        number += 1;
    }

    public void levandowski(View view) {
        number -= 1;
    }
    //iniesta metod

    public void iniesta1(View view) {
        number += 1;
    }

    public void pique(View view) {
        number -= 1;
    }
    //levandowski metod

    public void levandowski1(View view) {
        number += 1;
    }

    public void ronaldo1(View view) {
        number -= 1;
    }
    //neymar metod

    public void neymar(View view) {
        number += 1;
    }

    public void iniesta2(View view) {
        number -= 1;
    }
    //pique metod

    public void pique1(View view) {
        number += 1;
    }

    public void messi1(View view) {
        number -= 1;
    }
    //ronaldo metod

    public void messi2(View view) {
        number -= 1;
    }

    public void ronaldo2(View view) {
        number += 1;
    }
    //casillas metod

    public void casillas2(View view) {
        number += 1;
       if(number>5){
           String message=""+number;
           Toast.makeText(this, "your number is:"+number, Toast.LENGTH_LONG).show();
           Intent intent = new Intent(MainActivity.this,HappyActivity.class);
           intent.putExtra("message", message);
           startActivity(intent);
       }
        if(number<=5){
            String message=number+"";
            Toast.makeText(this, "your number is:"+number, Toast.LENGTH_LONG).show();
            Intent intent = new Intent(MainActivity.this,UnhappyActivity.class);
            intent.putExtra("message", message);
            startActivity(intent);
        }
    }

    public void buffon2(View view) {
        number -= 1;
        if(number>5){
            String message=number+"";
            Toast.makeText(this, "your number is:"+number, Toast.LENGTH_LONG).show();
            Intent intent = new Intent(MainActivity.this,HappyActivity.class);
            intent.putExtra("message", message);
            startActivity(intent);
        }
        if(number<=5){
            String message=number+"";
            Toast.makeText(this, "your number is:"+number, Toast.LENGTH_LONG).show();
            Intent intent = new Intent(MainActivity.this,UnhappyActivity.class);
            intent.putExtra("message", message);
            startActivity(intent);
        }

    }


}













