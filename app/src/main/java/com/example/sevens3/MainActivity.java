package com.example.sevens3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToActivityContent(View view)
    {
        ImageButton mainPageButton = findViewById(R.id.mainPageButton);

        try {
            Intent k = new Intent(MainActivity.this, ContentActivity.class);
            startActivity(k);
        } catch(Exception e) {
            e.printStackTrace();
        }

    }
}
