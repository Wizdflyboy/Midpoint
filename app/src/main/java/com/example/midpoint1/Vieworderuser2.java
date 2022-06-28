package com.example.midpoint1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Vieworderuser2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vieworderuser2);
    }

    public void btnbackhome(View view) {
        Intent btnbackhome = new Intent(this, Homepageuser.class);
        startActivity(btnbackhome);
    }
}