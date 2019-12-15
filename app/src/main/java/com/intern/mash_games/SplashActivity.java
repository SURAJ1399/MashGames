package com.intern.mash_games;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.skydoves.medal.MedalAnimation;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        MedalAnimation medalAnimation = new MedalAnimation.Builder()
                .setDirection(MedalAnimation.LEFT)
                .setDegreeX(360)
                .setDegreeZ(360)
                .setSpeed(3000)
                .setTurn(1)
                .setLoop(1)
                .build();
        imageView = (ImageView)findViewById(R.id.imageview);
        imageView.startAnimation(medalAnimation);

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent=new Intent(SplashActivity.this,Welcome.class);

                startActivity(intent);
                finish();
            }
        }, 5000);


    }
}
