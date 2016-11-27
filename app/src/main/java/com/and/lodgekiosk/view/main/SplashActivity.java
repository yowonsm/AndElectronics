package com.and.lodgekiosk.view.main;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

import com.and.lodgekiosk.R;

/**
 * Created by Won on 2016-11-06.
 */
    public class SplashActivity extends Activity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_splash);

            Handler startHandler = new Handler() {
                @Override
                public void handleMessage(Message msg) {
                    finish();
                    startActivity(new Intent(SplashActivity.this, HomeActivity.class));
                };
            };
            startHandler.sendEmptyMessageDelayed(0, 1000); // 1초딜레이

        }
    }



