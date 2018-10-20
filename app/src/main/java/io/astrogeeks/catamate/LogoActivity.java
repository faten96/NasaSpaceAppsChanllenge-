
/*
 * Copyright (c) 2018. Tous les droits sont réservés.
 */

package io.astrogeeks.catamate;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LogoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo);

        int splashTime = 2000;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                
//                Intent mainIntent = new Intent(LogoActivity.this, MainActivity.class);
//                startActivity(mainIntent);
//                finish();
            }
        }, splashTime);
    }
}
