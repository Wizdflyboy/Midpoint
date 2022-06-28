package com.example.midpoint1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Userreg extends AppCompatActivity {

    // creating variables for our edittext, button and dbhandler
    private EditText username, userpass, confpass;
    private Button bconf;
    DBHandler dbHandler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userreg);

        // initializing all our variables.
         username= findViewById(R.id.edtxtuser);
        userpass = findViewById(R.id.edtxtpass);
        confpass = findViewById(R.id.edtxtconf);
        bconf = findViewById(R.id.btnconf);

        // creating a new dbhandler class
        // and passing our context to it.
        dbHandler = new DBHandler(Userreg.this);

        // below line is to add on click listener for our add course button.
        bconf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // below line is to get data from all edit text fields.
                String userName = username.getText().toString();
                String password = userpass.getText().toString();
                String confirmpassword = confpass.getText().toString();

                // validating if the text fields are empty or not.
                if (userName.isEmpty() && password.isEmpty() && confirmpassword.isEmpty()) {
                    Toast.makeText(Userreg.this, "Please enter all the data..", Toast.LENGTH_SHORT).show();
                }else{
                    boolean go = dbHandler.viewuser(userName);
                    if (go == false){
                        boolean po = dbHandler.insertuser(userName,password,confirmpassword);
                        if (po == true){
                            Toast.makeText(Userreg.this, "Data Saved..", Toast.LENGTH_SHORT).show();
                            username.setText("");
                            userpass.setText("");
                            confpass.setText("");
                            Intent log = new Intent(getApplicationContext(),Userreg2.class);
                            startActivity(log) ;
                        }else
                            Toast.makeText(Userreg.this, "Data Unsaved..", Toast.LENGTH_SHORT).show();
                    }else
                        Toast.makeText(Userreg.this, "Data existed..", Toast.LENGTH_SHORT).show();
                }


                // after adding the data we are displaying a toast message.


            }
        });

    }

    public void back(View view) {
       // Intent back = new Intent(this, Userreg2.class);
       // startActivity(back);
        //to view table
//        Cursor go = dbHandler.viewtb();
//        if (go.getCount() ==0){
//                Toast.makeText(Userreg.this, "No Data exist..", Toast.LENGTH_SHORT).show();
//            }
//        StringBuffer display = new StringBuffer();
//        while (go.moveToNext()){
//            display.append("Customer Username: " +go.getString(0)+"\n");
//            display.append("Customer's Password: " +go.getString(1)+"\n\n");
//        }
//        AlertDialog.Builder bld=new AlertDialog.Builder(this);
//        bld.setTitle("Customers login information");
//        bld.setMessage(display.toString());
//        bld.show();

        // to update
//       String userName = username.getText().toString();
//        String password = userpass.getText().toString();
//        String confirmpassword = confpass.getText().toString();
//
//                boolean po = dbHandler.updt(userName,password,confirmpassword);
//                if (po == true){
//                    Toast.makeText(Userreg.this, "Data Updated..", Toast.LENGTH_SHORT).show();
//                    username.setText("");
//                    userpass.setText("");
//                    confpass.setText("");
//
//                }else
//                    Toast.makeText(Userreg.this, "Data not Updated..", Toast.LENGTH_SHORT).show();


// to delete
        String userName = username.getText().toString();
        boolean po = dbHandler.dlt(userName);
                if (po == true){
                    Toast.makeText(Userreg.this, "Data Deleted..", Toast.LENGTH_SHORT).show();
                    username.setText("");
                    userpass.setText("");
                    confpass.setText("");

                }else
                    Toast.makeText(Userreg.this, "Data not deleted..", Toast.LENGTH_SHORT).show();

    }
}