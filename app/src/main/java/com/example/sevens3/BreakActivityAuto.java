package com.example.sevens3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.HapticFeedbackConstants;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class BreakActivityAuto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_break_auto);
    }

    public void goToBreakManual(View view)
    {
        ImageButton backButton = findViewById(R.id.SwitchType2);

        try {
            Intent k = new Intent(BreakActivityAuto.this, BreakActivityAuto.class);
            startActivity(k);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void goBack(View view)
    {
        ImageButton backButton = findViewById(R.id.backButton2);

        try {
            Intent k = new Intent(BreakActivityAuto.this, ContentActivity.class);
            startActivity(k);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

}