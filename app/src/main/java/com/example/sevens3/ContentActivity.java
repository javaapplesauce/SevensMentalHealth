package com.example.sevens3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ContentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);
    }

    public void goToBreakActivity(View view)
    {
        Button breakButton = findViewById(R.id.BreakButton);

        try {
            Intent k = new Intent(ContentActivity.this, BreakActivityManual.class);
            startActivity(k);
        } catch(Exception e) {
            e.printStackTrace();
        }

    }
}