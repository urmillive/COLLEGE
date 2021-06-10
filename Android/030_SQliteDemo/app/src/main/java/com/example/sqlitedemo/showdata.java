package com.example.sqlitedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class showdata extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showdata);
        tv = (TextView)findViewById(R.id.textView);
        SQLiteDatabase con = openOrCreateDatabase("mybca.db",MODE_PRIVATE,null);
        Cursor cr = con.rawQuery("SELECT * FROM app_user",null);
        String result = "";
        if(cr.moveToFirst()){
            do{
                result += "USERNAME   :   "+cr.getString(0).toString().trim() + "\n";
                result += "PASSWORD   :   "+cr.getString(1).toString().trim() + "\n";
                result += "GENDER:"+cr.getString(2).toString().trim() + "\n";
                result += "COURSE:"+cr.getString(3).toString().trim() + "\n";
            }while (cr.moveToNext());
            tv.setText(result);
        }

    }

}