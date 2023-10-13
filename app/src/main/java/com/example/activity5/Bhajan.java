package com.example.activity5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Bhajan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bhajan);
    }
    public void back(View v){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
}