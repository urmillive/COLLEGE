package com.example.a006_value_swap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button boo = (Button) findViewById(R.id.btnswap);
        boo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText e1 = (EditText) findViewById(R.id.ed1);
                EditText e2 = (EditText) findViewById(R.id.ed2);
                TextView t1 = (TextView) findViewById(R.id.txtres);
//        t1.setText(Integer.parseInt(e1.getText().toString())+ Integer.parseInt(e2.getText().toString()));
                t1.setText("X: " + Integer.parseInt(e2.getText().toString()) + ", Y; " + Integer.parseInt(e1.getText().toString()));
            }
        });
    }

    public void btnclear(View view) {
        EditText e1 = (EditText) findViewById(R.id.ed1);
        EditText e2 = (EditText) findViewById(R.id.ed2);
        TextView t1 = (TextView) findViewById(R.id.txtres);
        e1.setText("");
        e2.setText("");
        t1.setText("");
    }
}