package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class splash_screen extends AppCompatActivity {
    private static int SPLASH_SCREEN =2000;
    ImageView i1;
    TextView t1;
    Animation rotate_anim;
    Animation anim_2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);
        rotate_anim = (Animation) AnimationUtils.loadAnimation(this,R.anim.rotate_anim);
        anim_2 = (Animation) AnimationUtils.loadAnimation(this,R.anim.anim_2);
        i1=(ImageView)findViewById(R.id.imageView);
        t1=(TextView)findViewById(R.id.textView);
        i1.setAnimation(rotate_anim);
        t1.setAnimation(anim_2);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(splash_screen.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN);


    }
}