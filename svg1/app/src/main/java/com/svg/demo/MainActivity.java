package com.svg.demo;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView xjbDrawImg = findViewById(R.id.img_xjbdraw);
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) xjbDrawImg.getDrawable();
        animatedVectorDrawable.start();
        // 加载SVG
//        anim1 = (AnimatedVectorDrawable) getResources().getDrawable(R.drawable.anim1);  anim1.start();
//        anim2 = (AnimatedVectorDrawable) getResources().getDrawable(R.drawable.anim2);  anim2.start();
//        anim3 = (AnimatedVectorDrawable) getResources().getDrawable(R.drawable.anim3);  anim3.start();

    }
}
