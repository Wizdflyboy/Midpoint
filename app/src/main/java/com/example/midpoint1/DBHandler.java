package com.example.midpoint1;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DBHandler extends SQLiteOpenHelper{


    // creating a constructor for our database handler.
    public DBHandler(Context context) {
        super(context, "midpoint.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // creating table and its field.
      db.execSQL("Create table usertb (username TEXT primary key not null, password TEXT not null, confirmpassword TEXT not null)");

    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // this method is called to check if the table exists already.
        db.execSQL("DROP TABLE IF EXISTS usertb");
        onCreate(db);
    }
    //creating written data from the form field to the table
    public boolean insertuser(String username, String password, String confirmpassword){
        SQLiteDatabase sqdb = this.getWritableDatabase();
        ContentValues content = new ContentValues();
        content.put("username",username);
        content.put("password",password);
        content.put("confirmpassword",confirmpassword);

        long in = sqdb.insert("usertb",null,content);
        if (in == -1)
            return false;
        else
            return  true;

    }
// to check if the data is visible or rady entered
    public boolean viewuser(String username){
        SQLiteDatabase sqdb = this.getWritableDatabase();
        Cursor out = sqdb.rawQuery("Select * from usertb where username = ?",new String[]{username});
        if (out.getCount() > 0)
            return true;
        else
            return false;


    }
    // to view table
    public Cursor viewtb(){
        SQLiteDatabase sqdb = this.getWritableDatabase();
        Cursor out = sqdb.rawQuery("Select * from usertb ",null);

            return out;
    }

    // update button
    public boolean updt(String username, String password, String confirmpassword){
        SQLiteDatabase sqdb = this.getWritableDatabase();
        ContentValues in = new ContentValues();
        in.put("password",password);
        in.put("confirmpassword",confirmpassword);
        Cursor out = sqdb.rawQuery("Select * from usertb where username = ?",new String[]{username});

        if (out.getCount()>0){
            long ingiza = sqdb.update("usertb",in,"username = ?",new String[]{username});

            if (ingiza == -1)
                return false;
            else
                return  true;
        }else
            return false;


    }

    // to delete

    public boolean dlt(String username){
        SQLiteDatabase sqdb = this.getWritableDatabase();
        Cursor out = sqdb.rawQuery("Select * from usertb where username = ?",new String[]{username});

        if (out.getCount()>0){
            long ingiza = sqdb.delete("usertb","username = ?",new String[]{username});

            if (ingiza == -1)
                return false;
            else
                return  true;
        }else
            return false;


    }

}
