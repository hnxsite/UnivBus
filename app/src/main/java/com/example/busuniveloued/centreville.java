package com.example.busuniveloued;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class centreville extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_centreville);

    }
    public void openbackActivity(View view) {
        Intent intent = new Intent(this, bustype.class);
        startActivity(intent);
    }
    public void openmallahActivity(View view) {
        Intent intent = new Intent(this, mallahactivity.class);
        startActivity(intent);
    }
    public void openckattsonActivity(View view) {
        Intent intent = new Intent(this, kattsonactivity.class);
        startActivity(intent);
    }
    public void opensahanActivity(View view) {
        Intent intent = new Intent(this, sahanactivity.class);
        startActivity(intent);
    }

}