package com.angkorsuntrix.laundryapp.ui;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.angkorsuntrix.laundryapp.R;
import com.angkorsuntrix.laundryapp.intent.LoginIntent;
import com.angkorsuntrix.laundryapp.intent.MainIntent;
import com.angkorsuntrix.laundryapp.persistent.AppPre;

/**
 * Created by borrom on 2/22/16.
 */
public class SplashScreenActivity extends AppCompatActivity {

    private static final int SPLASH_TIME = 1000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        final AppPre appPre = new AppPre(this);

       new Handler().postDelayed(new Runnable() {
           @Override
           public void run() {
               if(appPre.isFirstStart()){
                    startActivity(new LoginIntent(SplashScreenActivity.this));
               }else {
                    startActivity(new MainIntent(SplashScreenActivity.this));
               }
           }
       },SPLASH_TIME);
    }

}
