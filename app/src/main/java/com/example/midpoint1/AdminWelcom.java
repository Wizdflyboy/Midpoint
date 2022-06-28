package com.example.midpoint1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AdminWelcom extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_welcom);
    }

    public void btnmenu(View view) {
        Intent btnmenu = new Intent(this, FoodMenuAdmin.class);
        startActivity(btnmenu);
    }

    public void btnnoti(View view) {
        Intent btnnoti = new Intent(this, NotificationAdmin.class);
        startActivity(btnnoti);
    }

    public void btnorder(View view) {
        Intent btnorder = new Intent(this, Adminvieworder.class);
        startActivity(btnorder);
    }

    public void btnfeed(View view) {
        Intent btnfeed = new Intent(this, FeedbackAdmin.class);
        startActivity(btnfeed);
    }

    public void btnlist(View view) {
        Intent btnlist = new Intent(this, FoodListMenu.class);
        startActivity(btnlist);
    }

    public void btnsupplier(View view) {
        Intent btnsupplier = new Intent(this, AddSupplier.class);
        startActivity(btnsupplier);
    }

    public void btnout(View view) {
        Intent btnout = new Intent(this, MainActivity.class);
        startActivity(btnout);
    }
}