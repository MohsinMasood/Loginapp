package com.example.lab2.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private void doLogin(View view) {
        Toast.makeText(MainActivity.this,R.string.string.str_loginform, Toast.LENGTH_SHORT).show();
    }
}