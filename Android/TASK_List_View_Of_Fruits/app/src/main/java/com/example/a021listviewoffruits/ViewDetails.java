package com.example.a021listviewoffruits;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class ViewDetails extends AppCompatActivity {
    private TextView tv;
    private ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_details);
        int sel = (int) getIntent().getIntExtra("sel", 1);
        tv = (TextView) findViewById(R.id.tv);
        iv = (ImageView) findViewById(R.id.img);
        if (sel == 0) {
           setAll(R.drawable.apple, "Apple");
        }else if (sel == 1) {
            setAll(R.drawable.cherry, "Cherry");
        }else if (sel == 2) {
            setAll(R.drawable.guava, "Guava");
        }else if (sel == 3) {
            setAll(R.drawable.melon, "Melon");
        }else if (sel == 4) {
            setAll(R.drawable.orange, "Orange");
        }else if (sel == 5) {
            setAll(R.drawable.pineapple, "Pineapple");
        }else if (sel == 6) {
            setAll(R.drawable.strawberry, "Strawberry");
        }else if (sel == 7) {
            setAll(R.drawable.watermelon, "Watermelon");
        }
    }

    public void setAll(int img, String nm) {
        tv.setText("This is " + nm);
        iv.setImageResource(img);
    }

    public void back(View view) {
        Intent i = new Intent(ViewDetails.this, MainActivity.class);
        startActivity(i);
    }
}