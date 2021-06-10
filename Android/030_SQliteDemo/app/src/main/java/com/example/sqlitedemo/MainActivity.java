 package com.example.sqlitedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView uname,upass;
    private RadioGroup r_gender;
    private Button boo;
    private Spinner standard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         uname = (TextView)findViewById(R.id.ed1);
         upass = (TextView)findViewById(R.id.ed2);
         r_gender = (RadioGroup) findViewById(R.id.r_gender);
         boo = (Button)findViewById(R.id.btndata);
         standard = (Spinner)findViewById(R.id.sp_standard);

        try {
            SQLiteDatabase con = openOrCreateDatabase("mybca.db",MODE_PRIVATE,null);
            con.execSQL("CREATE TABLE IF NOT EXISTS app_user(uname VARCHAR,pass VARCHAR,gender VARCHAR,course VARCHAR)");
           // con.execSQL("DROP TABLE app_user");


        }catch(Exception e){
            Log.e("data error",e.getMessage());
        }

    }

    public void addStudent(View view) {
        String u_name = uname.getText().toString().trim();
        String u_pass = upass.getText().toString().trim();
        String u_gender = ((RadioButton) findViewById(r_gender.getCheckedRadioButtonId())).getText().toString().trim();
        String u_standard = standard.getSelectedItem().toString().trim();

        try {

            SQLiteDatabase con = openOrCreateDatabase("mybca.db",MODE_PRIVATE,null);
            con.execSQL("INSERT INTO app_user(uname,pass,gender,course) values('"+u_name+"','"+u_pass+"','"+u_gender+"','"+u_standard+"')");
            Toast.makeText(this,"Saved!",Toast.LENGTH_SHORT).show();
            Cursor cr = con.rawQuery("SELECT * FROM app_user",null);
            int cnt = cr.getCount();
            Toast.makeText(this,"Added"+cnt,Toast.LENGTH_SHORT).show();
        }catch (Exception e){
            Log.e("data error",e.getMessage());
        }
    }

    public void showdata(View view) {
        Intent i = new Intent(MainActivity.this,showdata.class);
        startActivity(i);
    }
}