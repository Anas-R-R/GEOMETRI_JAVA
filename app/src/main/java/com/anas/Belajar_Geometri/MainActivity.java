package com.anas.Belajar_Geometri;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

import com.anas.Belajar_Geometri.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void bangunDatar(View view){
        Intent intent = new Intent(getApplicationContext(), BangunDatar.class);
        startActivity(intent);
    }
    public void bangunRuang(View view){
        Intent intent = new Intent(getApplicationContext(), BangunRuang.class);
        startActivity(intent);
    }
    public void Jaring(View view){
        Intent intent = new Intent(getApplicationContext(), Jaring.class);
        startActivity(intent);
    }
    public void about(View view){
        Intent intent = new Intent(getApplicationContext(), About.class);
        startActivity(intent);
    }
}
