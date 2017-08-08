package com.example.saeed.educationalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HappyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_happy);
        TextView textview = (TextView) findViewById(R.id.text1);
        Bundle extras =getIntent().getExtras();
        String message="";
        message=extras.getString("message");
        textview.setText("your number is: "+message);
    }


    public void restart(View view){
        Intent intent=new Intent(HappyActivity.this,MainActivity.class);
        startActivity(intent);
    }
}
