package com.example.sevens3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

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
    public void addToClicks()
    {
        this.timesClicked++;
    }


    public void goToBreakManual(View view)
    {

    }

    public void countUp(View view)
    {
        Button ClickUp = findViewById(R.id.CountsUp);
        TextView DisplayNumber = findViewById(R.id.NumberDisplay);
        addToClicks();
        int numberToDisplay = (displayedNum + 7*timesClicked);
        DisplayNumber.setText(numberToDisplay);

    }


}