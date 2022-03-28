package com.example.trafficlights;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;

import android.view.View;
import android.widget.LinearLayout;


public class MainActivity extends AppCompatActivity {
    LinearLayout LinearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout = findViewById(R.id.linearlayout);
    }

    public void onClickO(View view) {
        LinearLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.o));
    }

    public void onClickB(View view) {
        LinearLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.b));
    }

    public void onClickG(View view) {
        LinearLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.g));
    }
}
