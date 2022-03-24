package com.example.sevens3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class BreakActivityAuto extends AppCompatActivity {

    private int displayedNum;
    private int timesClicked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_break_auto);
    }

    public void BreakActivityAuto()
    {
        displayedNum = 0;
        timesClicked = 0;
    }

    // adds to the number of times the button has been clicked so that the number can be added in the future

    public void goToBreakManual(View view)
    {

    }

    public void goBack(View view)
    {
        ImageButton backButton = findViewById(R.id.backButton);

        try {
            Intent k = new Intent(BreakActivityAuto.this, ContentActivity.class);
            startActivity(k);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void countUp(View view)
    {
        Button ClickUp = findViewById(R.id.CountsUp);
        TextView DisplayNumber = findViewById(R.id.NumberDisplay);
        this.displayedNum += 7;
        DisplayNumber.setText("" + this.displayedNum);
    }

    public void resetCounter(View view)
    {
        ImageButton resetButton = findViewById(R.id.resetButton);
        TextView DisplayNumber = findViewById(R.id.NumberDisplay);
        this.displayedNum= 0;
        DisplayNumber.setText("0");
    }

}