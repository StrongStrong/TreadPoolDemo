package com.example.treadpooldemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.newCachedThreadPool).setOnClickListener(this);
        findViewById(R.id.newFixedThreadPool).setOnClickListener(this);
        findViewById(R.id.newScheduledThreadPool).setOnClickListener(this);
        findViewById(R.id.newSingleThreadExecutor).setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.newCachedThreadPool:
                ExecutorTools.newCachedThreadPool();
                break;
            case R.id.newFixedThreadPool:
                ExecutorTools.newFixedThreadPool();
                break;
            case R.id.newScheduledThreadPool:
                ExecutorTools.newScheduledThreadPool();
                break;
            case R.id.newSingleThreadExecutor:
                ExecutorTools.newSingleThreadExecutor();
                break;


        }
    }
}
