package com.example.framebyframeanimationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView img_add = (ImageView) findViewById(R.id.img_animate_add);
        AnimationDrawable ad1 = (AnimationDrawable) img_add.getBackground();

        ad1.start();

        ImageView img_remove = (ImageView) findViewById(R.id.img_animate_remove);
        AnimationDrawable ad2 = (AnimationDrawable) img_remove.getBackground();
        ad2.start();

        final ImageView img_select = (ImageView) findViewById(R.id.img_animate_select);
        img_select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img_select.setActivated(!img_select.isActivated());
            }
        });
    }
}