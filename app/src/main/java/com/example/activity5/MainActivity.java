package com.example.activity5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void audio(View v){
        Intent i = new Intent(MainActivity.this,AudioPlay.class);
        startActivity(i);
    }
    public void bhajan(View v){
        Intent i = new Intent(MainActivity.this,Bhajan.class);
        startActivity(i);
    }
    public void suggestion(View v){
        Intent i = new Intent(MainActivity.this,Suggestion.class);
        startActivity(i);
    }
    public void signup(View v){
        Intent i = new Intent(MainActivity.this,SignUp.class);
        startActivity(i);
    }
    public void login(View v){
        Intent i = new Intent(MainActivity.this,LogIn.class);
        startActivity(i);
    }
}