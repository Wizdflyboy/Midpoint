package com.example.midpoint1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;



public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        StrictMode.enableDefaults();
    }

    public void taphere(View view) {
        Intent intent = new Intent(this, Userreg2.class);
        startActivity(intent);
    }

    public void Adminlog(View view) {
        Intent admin = new Intent(this, Aminlog.class);
        startActivity(admin);
    }

    public void Supplog(View view) {
        Intent sup = new Intent(this, Supplog.class);
        startActivity(sup);
    }
}