package com.example.activity5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class LogIn extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
    }
    public void back(View v){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
    public void login(View v){
        EditText username = findViewById(R.id.et1);
        EditText password = findViewById(R.id.et2);
        String user = username.getText().toString();
        String pswd = password.getText().toString();
        int duration = Toast.LENGTH_SHORT;

        if(user.equals("")||pswd.equals("")){
            Toast toast = Toast.makeText(getApplicationContext(),"One or more field is missing." , duration);
            toast.show();
        }
        else{
            Toast toast = Toast.makeText(getApplicationContext(),"Successfully Logged In." , duration);
            toast.show();
            Intent i = new Intent(this,MainActivity.class);
            startActivity(i);
        }
    }
}
