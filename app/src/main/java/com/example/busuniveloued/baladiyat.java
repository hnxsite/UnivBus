package com.example.busuniveloued;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class baladiyat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baladiyat);
    }
    public void openbayadhaActivity(View view) {
        Intent intent = new Intent(this, bayadhasituation.class);
        startActivity(intent);
    }
    public void opendebillaActivity(View view) {
        Intent intent = new Intent(this, debillasituation.class);
        startActivity(intent);
    }
    public void opendjedidaActivity(View view) {
        Intent intent = new Intent(this, djedidasituation.class);
        startActivity(intent);
    }
    public void opengeumarActivity(View view) {
        Intent intent = new Intent(this, geumarsituation.class);
        startActivity(intent);
    }
    public void openghaamraActivity(View view) {
        Intent intent = new Intent(this, ghamrasituation.class);
        startActivity(intent);
    }
    public void openhassaniActivity(View view) {
        Intent intent = new Intent(this, hassanisituation.class);
        startActivity(intent);
    }
    public void openhassikhalifaActivity(View view) {
        Intent intent = new Intent(this, hassikhalifasituation.class);
        startActivity(intent);
    }
    public void openkouininActivity(View view) {
        Intent intent = new Intent(this, kouininsituation.class);
        startActivity(intent);
    }
    public void openmagrinActivity(View view) {
        Intent intent = new Intent(this, magrinsituation.class);
        startActivity(intent);
    }
    public void opennekhlaouglaActivity(View view) {
        Intent intent = new Intent(this, nekhlaouglasituation.class);
        startActivity(intent);
    }
    public void openouedaalandaActivity(View view) {
        Intent intent = new Intent(this, ouedaalandasituation.class);
        startActivity(intent);
    }
    public void openoumihouanssaActivity(View view) {
        Intent intent = new Intent(this, oumihouanssasituation.class);
        startActivity(intent);
    }
    public void openrabbahActivity(View view) {
        Intent intent = new Intent(this, rabbahsituation.class);
        startActivity(intent);
    }
    public void openregibaActivity(View view) {
        Intent intent = new Intent(this, regibasituation.class);
        startActivity(intent);
    }
    public void opensidiounActivity(View view) {
        Intent intent = new Intent(this, sidiounsituation.class);
        startActivity(intent);
    }
    public void openteghzoutActivity(View view) {
        Intent intent = new Intent(this, teghzoutsituation.class);
        startActivity(intent);
    }
    public void opentrifaouiActivity(View view) {
        Intent intent = new Intent(this, trifaouisituation.class);
        startActivity(intent);
    }
    public void openzogomActivity(View view) {
        Intent intent = new Intent(this, zogomsituation.class);
        startActivity(intent);
    }
    public void openouarmassActivity(View view) {
        Intent intent = new Intent(this, ouarmasssituation.class);
        startActivity(intent);
    }

}