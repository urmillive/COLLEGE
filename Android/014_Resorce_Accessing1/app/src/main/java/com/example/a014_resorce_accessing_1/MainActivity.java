package com.example.a014_resorce_accessing_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imgv = (ImageView) findViewById(R.id.imageView);
        imgv.setImageResource(R.drawable.ic_launcher_background);
    }
}