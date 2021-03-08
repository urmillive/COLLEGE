package com.example.tween_animation_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void ShowAnimation(View view) {
        ImageView img = (ImageView) findViewById(R.id.imgtween);
        Animation animo = null;
        if (view == findViewById(R.id.btnblink)) {
            animo = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
        } else if (view == findViewById(R.id.btnfade)) {
            animo = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
        } else if (view == findViewById(R.id.btnslide)) {
            animo = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide);
        }
        img.startAnimation(animo);
    }
}