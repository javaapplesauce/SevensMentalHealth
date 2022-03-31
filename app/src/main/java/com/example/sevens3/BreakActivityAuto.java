package com.example.sevens3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.HapticFeedbackConstants;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.SimpleDateFormat;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public class BreakActivityAuto extends AppCompatActivity {

    private int displayedNum;
    private double interval;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_break_auto);

    }

    public void BreakActivityAuto()
    {
        this.displayedNum = 0;
        this.interval = 1.0;
    }

    public void goToBreakManual(View view)
    {
        ImageButton backButton = findViewById(R.id.SwitchType2);

        try {
            Intent k = new Intent(BreakActivityAuto.this, BreakActivityManual.class);
            startActivity(k);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    public void StartingStoppingTimer(View view)
    {
        ImageButton activateButton = findViewById(R.id.playButton);
        TextView displayedNum2 = findViewById(R.id.NumberDisplay2);
        // displayedNum2.setText(activateButton.getResources().getResourceEntryName(activateButton.getId()));

        Drawable drawable = activateButton.getDrawable();

        if (drawable.getConstantState().equals(getResources().getDrawable(R.drawable.play_button).getConstantState()))
        {
            activateButton.setImageResource(R.drawable.pause_button);
            CountingUp(displayedNum2);

            // have something that changes the button to the pause button
        }
        else
        {
            // stop CountingUp
            activateButton.setImageResource(R.drawable.play_button);
            displayedNum2.setText("this worked correctly");
            // have something that changes the button to the pause button
        }


        // have an if statement taht detects if the name of the button is pause or not

        // call counting up or pause depending on which one it is


    }

    public void CountingUp(View view)
    {
        TextView displayedNum2 = findViewById(R.id.NumberDisplay2);
        displayedNum2.setText("test");

        boolean i = true;
        int r = 1;

        while(i == true)
        {
            displayedNum2.setText("" + (r % 2));
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            r = r % 2;
            r++;
        }


    }
}