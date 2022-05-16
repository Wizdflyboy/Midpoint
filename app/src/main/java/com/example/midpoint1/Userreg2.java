package com.example.midpoint1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Userreg2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userreg2);
    }

    public void signup(View view) {
        Intent sign = new Intent(this, Userreg.class);
        startActivity(sign);
    }

    public void back2(View view) {
        Intent back2 = new Intent(this, MainActivity.class);
        startActivity(back2);
    }

}