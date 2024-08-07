package com.example.busuniveloued;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class hassikhalifago01 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hassikhalifago01);

    }
    public void opencbackActivity(View view) {
        Intent intent = new Intent(this, hassikhalifasituation.class);
        startActivity(intent);
    }
}