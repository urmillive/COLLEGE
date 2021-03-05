package com.example.a023_fragment_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void setFrg(View v) {
        Fragment fg;
        if (v == findViewById(R.id.btn1)) {
            fg = new fragmentOne();
            Toast.makeText(getApplicationContext(),"BTN -1 Clicked",Toast.LENGTH_SHORT).show();
        } else {
            fg = new fragmentTwo();
            Toast.makeText(getApplicationContext(),"BTN -2 Clicked",Toast.LENGTH_SHORT).show();
        }

        android.app.FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.frm1,fg);
        ft.commit();
    }
}