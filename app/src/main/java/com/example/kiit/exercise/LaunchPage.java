package com.example.kiit.exercise;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class LaunchPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_launch_page);
    }

    public void enter(View button){
        Intent intent = new Intent(this, TopSessionsActivity.class);
        startActivity(intent);
    }
}
