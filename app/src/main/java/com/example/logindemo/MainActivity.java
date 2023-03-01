package com.example.logindemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void loginFunction(View view) {

        EditText usernameEditText = (EditText) findViewById(R.id.editTextName);

        EditText passwordEditText = (EditText) findViewById(R.id.editTextPassword);

        Log.i("Values", usernameEditText.getText().toString() + " " + passwordEditText.getText().toString());


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}