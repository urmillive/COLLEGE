package com.example.a007_value_swapper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button b1;
    Button b2;
    Button b3;
    Button b4;

    @Override
     protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.btn1);
        b2 = (Button) findViewById(R.id.btn2);
        b3 = (Button) findViewById(R.id.btn3);
        b4 = (Button) findViewById(R.id.btn4);

        View.OnClickListener o = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String swap = "";
                swap += b4.getText().toString();
                b4.setText(b3.getText().toString());
                b3.setText(b2.getText().toString());
                b2.setText(b1.getText().toString());
                b1.setText(swap);
            }
        };
        b1.setOnClickListener(o);
        b2.setOnClickListener(o);
        b3.setOnClickListener(o);
        b4.setOnClickListener(o);
    }

    public void make() {
        String swap = "";
        swap += b4.getText().toString();
        b4.setText(b3.getText().toString());
        b3.setText(b2.getText().toString());
        b2.setText(b1.getText().toString());
        b1.setText(swap);
    }
}