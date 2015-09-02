package com.dailyappslab.dfc;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class LoadActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.load);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(LoadActivity.this, MainActivity.class);
                startActivity(i);

                //overridePendingTransition(R.anim.alpha_in, R.anim.alpha_out);
                finish();
            }
        }, 3000);
    }
}
