package com.dailyappslab.dfc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    Button btnGame;
    Button btnHighscores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        InitViews();

    }

   private void InitViews()
   {
      // btnGame = (Button) findViewById(R.id.btnGame);
       //btnHighscores = (Button) findViewById(R.id.btnHighscores);
   }

    public void StartGameActivity(View view)
    {
        Intent i = new Intent(MainActivity.this, GameActivity.class);
        startActivity(i);
    }

    public void StartHighscoresActivity(View view)
    {
        Intent i = new Intent(MainActivity.this, HighscoresActivity.class);
        startActivity(i);
    }

    public void StartSettingsActivity(View view)
    {
        Intent i = new Intent(MainActivity.this, SettingsActivity.class);
        startActivity(i);
    }
}
