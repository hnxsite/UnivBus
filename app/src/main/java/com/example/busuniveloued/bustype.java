package com.example.busuniveloued;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class bustype extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bustype);

    }

    public void openbaladyatActivity(View view) {
        Intent intent = new Intent(this, baladiyat.class);
        startActivity(intent);
    }
    public void opencentrevilleActivity(View view) {
        Intent intent = new Intent(this, centreville.class);
        startActivity(intent);
    }
}



