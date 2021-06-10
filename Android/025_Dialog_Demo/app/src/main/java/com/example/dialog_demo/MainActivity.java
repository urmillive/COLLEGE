package com.example.dialog_demo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void closeme(View view) {
       AlertDialog.Builder ab = new AlertDialog.Builder(this);
       ab.setTitle("Alert!");
       ab.setIcon(R.drawable.ic_launcher_background);
       ab.setMessage("Do you wanna exit ?");
       ab.setPositiveButton("yes", new DialogInterface.OnClickListener() {
           @Override
           public void onClick(DialogInterface dialog, int which) {
               finish();
               Toast.makeText(getApplicationContext(),"you have select yes",Toast.LENGTH_SHORT);
           }
       });
        ab.setNegativeButton("no", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog  a = ab.create();
        a.show();
    }
}