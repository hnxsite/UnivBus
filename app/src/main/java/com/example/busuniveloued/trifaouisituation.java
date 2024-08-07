package com.example.busuniveloued;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class trifaouisituation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trifaouisituation);

    }
    public void openbackActivity(View view) {
        Intent intent = new Intent(this, baladiyat.class);
        startActivity(intent);
    }
    public void opengo01Activity(View view) {
        Intent intent = new Intent(this, trifaouigo01.class);
        startActivity(intent);
    }
    public void opengo02Activity(View view) {
        Intent intent = new Intent(this, trifaouigo02.class);
        startActivity(intent);
    }
    public void openback01Activity(View view) {
        Intent intent = new Intent(this, trifaouiback01.class);
        startActivity(intent);
    }
    public void openback02Activity(View view) {
        Intent intent = new Intent(this, trifaouiback02.class);
        startActivity(intent);
    }
    public void openback03Activity(View view) {
        Intent intent = new Intent(this, trifaouiback03.class);
        startActivity(intent);
    }
}