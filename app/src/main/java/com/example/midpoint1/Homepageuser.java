package com.example.midpoint1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Homepageuser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepageuser);
    }

    public void btnmuser(View view) {
        Intent btnmuuser = new Intent(this, Menuuser.class);
        startActivity(btnmuuser);
    }

    public void btnouser(View view) {
        Intent btnouser = new Intent(this, Vieworderuser2.class);
        startActivity(btnouser);
    }

    public void btnlogout(View view) {
        Intent btnlogout = new Intent(this, MainActivity.class);
        startActivity(btnlogout);
    }
}