package com.example.wallpaperchanger;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.WallpaperManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    Button wall;
    Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        timer = new Timer();


        wall = (Button) findViewById(R.id.wall);
        final WallpaperManager wallpaperManager = WallpaperManager.getInstance(getApplicationContext());

        wall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                 timer.scheduleAtFixedRate(new TimerTask() {
                     @Override
                     public void run() {
                         runOnUiThread(new Runnable() {
                             @SuppressLint("ResourceType")
                             @Override
                             public void run() {
                                 Random r = new Random();
                                 int rand = r.nextInt(10);


                                 if(rand == 1){
                                     try {
                                         wallpaperManager.setResource(R.drawable.background);
                                     } catch (IOException e) {
                                         e.printStackTrace();
                                     }
                                 }
                                 else if(rand == 2){
                                     try {
                                         wallpaperManager.setResource(R.drawable.s1);
                                     } catch (IOException e) {
                                         e.printStackTrace();
                                     }
                                 }
                                 else if(rand == 3){
                                     try {
                                         wallpaperManager.setResource(R.drawable.s2);
                                     } catch (IOException e) {
                                         e.printStackTrace();
                                     }
                                 }
                                 else if(rand == 4){
                                     try {
                                         wallpaperManager.setResource(R.drawable.s3);
                                     } catch (IOException e) {
                                         e.printStackTrace();
                                     }
                                 }
                                 else if(rand == 5){
                                     try {
                                         wallpaperManager.setResource(R.drawable.s4);
                                     } catch (IOException e) {
                                         e.printStackTrace();
                                     }
                                 }
                                 else if(rand == 6){
                                     try {
                                         wallpaperManager.setResource(R.drawable.s5);
                                     } catch (IOException e) {
                                         e.printStackTrace();
                                     }
                                 }
                                 else if(rand == 7){
                                     try {
                                         wallpaperManager.setResource(R.drawable.s6);
                                     } catch (IOException e) {
                                         e.printStackTrace();
                                     }
                                 }
                                 else if(rand == 8){
                                     try {
                                         wallpaperManager.setResource(R.drawable.s7);
                                     } catch (IOException e) {
                                         e.printStackTrace();
                                     }
                                 }
                                 else if(rand == 9){
                                     try {
                                         wallpaperManager.setResource(R.drawable.infosys);
                                     } catch (IOException e) {
                                         e.printStackTrace();
                                     }
                                 }
                                 else{
                                     try {
                                         wallpaperManager.setResource(R.drawable.sofa);
                                     } catch (IOException e) {
                                         e.printStackTrace();
                                     }
                                 }
                             }
                         });


                     }
                 },1000,30000);

            }
        });
    }
}
