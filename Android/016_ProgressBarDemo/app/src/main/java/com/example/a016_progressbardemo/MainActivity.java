package com.example.a016_progressbardemo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    private int progressBarStatus = 0;
    private Handler progressBarHandler = new Handler();
    private long fileSize = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnPro(View view) {
        final ProgressDialog pb = new ProgressDialog(this);
        //pb.setCancelable(False);
        pb.setMessage("File Downloading...");
        pb.setProgressStyle(pb.STYLE_HORIZONTAL);
        pb.setProgress(0);
        pb.setMax(100);
        pb.show();
        progressBarStatus = 0;
        fileSize = 0;

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (progressBarStatus < 100) {
                    progressBarStatus +=10;
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //updating progressbar
                    progressBarHandler.post(new Runnable() {
                        @Override
                        public void run() {
                            pb.setProgress(progressBarStatus);
                        }
                    });
                }

                //performing operation if file is download
                if (progressBarStatus >= 100) {
                    //sleeping for 1 second after operation complete
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //close the progressbar dialog
                    pb.dismiss();
                }
            }
        }).start();
    }
    //end of click event
    //checking how much file downloaded & update

//    public int doOperation() {
//
//        while (fileSize <= 10000) {
//            fileSize++;
//            if(fileSize%1000==0){
//                return (int) (fileSize/100);
//            }
//        }
//        return 100;
//    }

}