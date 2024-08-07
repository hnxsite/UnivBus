package com.example.busuniveloued;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class debillaback03 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_debillaback03);

    }
    public void opencbackActivity(View view) {
        Intent intent = new Intent(this, debillasituation.class);
        startActivity(intent);
    }
}