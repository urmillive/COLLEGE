package com.example.a004_edittextdemo2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void fullName(View v){
        ((EditText) findViewById(R.id.ed4)).setText(((EditText) findViewById(R.id.ed1)).getText().toString() + " " + ((EditText) findViewById(R.id.ed2)).getText().toString() + " " + ((EditText) findViewById(R.id.ed3)).getText().toString());
    }
    public void editClear(View v){
        ((EditText) findViewById(R.id.ed4)).setText("");
        ((EditText) findViewById(R.id.ed3)).setText("");
        ((EditText) findViewById(R.id.ed2)).setText("");
        ((EditText) findViewById(R.id.ed1)).setText("");
    }
}