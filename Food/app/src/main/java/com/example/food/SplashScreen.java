package com.example.food;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.example.food.activity.LoginActivity;

public class SplashScreen extends Activity {

    private ImageView splashscreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        splashscreen = (ImageView)findViewById(R.id.splash_img);
        final Animation slide_animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_out_effect);
        splashscreen.startAnimation(slide_animation);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        },3000);

    }
}
