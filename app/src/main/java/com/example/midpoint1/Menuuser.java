package com.example.midpoint1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Menuuser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuuser);
    }

    public void btnbackmenu(View view) {
        Intent btnbackmenu = new Intent(this, Homepageuser.class);
        startActivity(btnbackmenu);
    }
}