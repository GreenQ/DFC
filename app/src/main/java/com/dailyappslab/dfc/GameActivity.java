package com.dailyappslab.dfc;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.AbsoluteLayout;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class GameActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game);

    }

    private void FormMap(int size)
    {
        RelativeLayout rlMapContainer = (RelativeLayout) findViewById(R.id.rlMapContainer);

        for(int i = 0; i < size; i++) {
            LinearLayout row = new LinearLayout(getBaseContext());
            row.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            int id = getResources().getIdentifier("w" + i, "string", this.getPackageName());

            for(int s = 0; s < size; s++)
            {
                final Button btnTemp = new Button(getBaseContext());
                btnTemp.setId(i + s + 20 + s);



            }
        }


    }
//    private void CreateGuessWordContainers(int lvl)
//    {
//        LinearLayout layout = (LinearLayout) findViewById(R.id.guessWordsLayout);
//        // View rootview = View.inflate(getBaseContext(), layout.getId(), false)
//        if(((LinearLayout) layout).getChildCount() > 0)
//            ((LinearLayout) layout).removeAllViews();
//        //wordHandler.BuildWordContainers(layout, this, GetCurrentLevel());
//
//        LinearLayout row = new LinearLayout(getBaseContext());
//        row.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
//
//        //int maxJ = (getResources().getString(R.string.w2)).split("(?!^)").length;
//        int id = getResources().getIdentifier("w" + lvl, "string", this.getPackageName());
//        // String word = getResources().getString(id);
//        word = (getResources().getString(id)).split("(?!^)");
//
//        int maxJ = word.length;
//        for (int j = 0; j < maxJ; j++) {
//            final Button btnTag = new Button(getBaseContext());
//            btnTag.setId(/*actualLettertId +*/ j);
//            btnTag.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//
//                    if (((Button) v).getText() != "") {
//                        int containerId = v.getId();
//
//                        int actualLetterIndex = getActualLettertArrayIndex(containerId);
//                        int id = getResources().getIdentifier("buttonLetter" + actualLetterIndex, "id", getPackageName());
//                        Button temp = (Button) findViewById(id);
//                        temp.setText(storedLetters[Integer.valueOf(actualLetterIndex)][0]);
//                        temp.setVisibility(View.VISIBLE);
//
//                        storedLetters[actualLetterIndex][0] = temp.getText().toString();
//                        storedLetters[actualLetterIndex][1] = "";
//                        btnTag.setText("");
//                        occupiedContainerCounter--;
//                    }
//                }
//            });
//
//            btnTag.setTextSize(TypedValue.COMPLEX_UNIT_FRACTION_PARENT, 12);
//
//            btnTag.setPadding(0,0,0,0);
//
//            btnTag.setLayoutParams(new LinearLayout.LayoutParams(AbsoluteLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
//            btnTag.setBackgroundColor(Color.BLACK);
//            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(btnTag.getLayoutParams());
//            params.width = getResources().getDimensionPixelSize(R.dimen.guess_letter_width);
//            params.height = getResources().getDimensionPixelSize(R.dimen.guess_letter_height);
//            params.setMargins(2,2,2,2);
//            row.setGravity(Gravity.CENTER);
//            row.addView(btnTag, params);
//
//
//        }
//        createEaraserButton(row);
//        layout.addView(row);
//    }
}
