package com.example.a012_intent_share_data;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public String GOT(EditText ed){
        return  ed.getText().toString();
    }

    public void btnnext(View view) {
        EditText e1 = (EditText) findViewById(R.id.txt_fnm);
        EditText e2 = (EditText) findViewById(R.id.txt_mnm);
        EditText e3 = (EditText) findViewById(R.id.txt_lnm);
        Intent i = new Intent(MainActivity.this, NextActivity.class);
        i.putExtra("fnm",GOT(findViewById(R.id.txt_fnm)));
        i.putExtra("mnm",GOT(findViewById(R.id.txt_mnm)));
        i.putExtra("lnm",GOT(findViewById(R.id.txt_lnm)));
        startActivity(i);
    }
}