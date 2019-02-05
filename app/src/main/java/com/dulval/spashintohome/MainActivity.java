package com.dulval.spashintohome;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    ImageView bgapp, clover;
    Animation bganim, clovernim, frombottom;

    LinearLayout textSpash, texthome, menus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bgapp = findViewById(R.id.bgapp);
        clover = findViewById(R.id.clover);
        textSpash = findViewById(R.id.textsplash);
        texthome = findViewById(R.id.texthome);
        menus = findViewById(R.id.menus);

        //bganim = AnimationUtils.loadAnimation(this, R.anim.bganim);
        frombottom = AnimationUtils.loadAnimation(this, R.anim.frombottom);
        //clovernim = AnimationUtils.loadAnimation(this, R.anim.clovenim);

        bgapp.animate().translationY(-2600).setDuration(800).setStartDelay(300);
        clover.animate().alpha(0).setDuration(800).setStartDelay(600);
        textSpash.animate().translationY(140).alpha(0).setDuration(800).setStartDelay(300);

        texthome.startAnimation(frombottom);
        menus.startAnimation(frombottom);
    }
}
