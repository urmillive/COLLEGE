package com.example.file_read_write_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnsave(View view) {
        EditText ed1;
        String data;
        String file = "mydata.txt";
        ed1 = (EditText) findViewById(R.id.ed1);
        data = ed1.getText().toString();
        try{
            FileOutputStream foat = openFileOutput(file,MODE_PRIVATE);
            OutputStreamWriter outputwriter = new OutputStreamWriter(foat);

            outputwriter.write(ed1.getText().toString());
            outputwriter.close();
            Toast.makeText(getBaseContext(),ed1.getText().toString() + "File saved",Toast.LENGTH_SHORT).show();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void btnload(View view) {
        TextView tv;
        String data;
        String file = "mydata.txt";
        try {
            tv = (TextView)findViewById(R.id.tv1);
            FileInputStream fin = openFileInput(file);
            int c;
            boolean cc;
            String temp = "";
            while (cc = fin.read()!=-1){
                //temp = temp + Character.toString(Char)c);
            }
            tv.setText(temp);
            Toast.makeText(getBaseContext(),"file read",Toast.LENGTH_SHORT).show();

        }catch (Exception e){

        }
    }
}