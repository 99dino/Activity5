package com.example.activity5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Context;

import androidx.appcompat.app.AppCompatActivity;

public class Suggestion extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.suggestion);
    }
    public void back(View v){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
    public void submit(View v){
        EditText username = findViewById(R.id.et);
        String user = username.getText().toString();
        if(user.equals("")){
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(getApplicationContext(), "No suggestion recorded.", duration);
            toast.show();
        }else{
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(getApplicationContext(), "Your suggestion is successfully recorded.", duration);
            toast.show();
        }
    }
}
