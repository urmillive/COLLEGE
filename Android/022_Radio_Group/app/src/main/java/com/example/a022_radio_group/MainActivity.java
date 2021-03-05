package com.example.a022_radio_group;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup cast,gender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cast = (RadioGroup) findViewById(R.id.cast);
        gender = (RadioGroup) findViewById(R.id.gender);

        RadioGroup.OnCheckedChangeListener lis = new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton rb = (RadioButton) findViewById(checkedId);
                Toast.makeText(getApplicationContext(),"Selected item : " + rb.getText().toString(),Toast.LENGTH_LONG);
            }
        };
        cast.setOnCheckedChangeListener(lis);
        gender.setOnCheckedChangeListener(lis);

    }

    public void Show(View view) {
        Toast.makeText(getApplicationContext(),getRBtxt(gender.getCheckedRadioButtonId()) + " " + getRBtxt(cast.getCheckedRadioButtonId()),Toast.LENGTH_LONG).show();
    }
    public String getRBtxt(int id){
        if(id>0){
            return ((RadioButton) findViewById(id)).getText().toString();
        }
        else{
            return "";
        }
    }
}