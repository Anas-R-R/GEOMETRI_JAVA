package com.anas.Belajar_Geometri;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.anas.Belajar_Geometri.R;

/**
 * Created by anas on 5/6/2023.
 */

public class MateriJaring extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi_jaring);

        Intent intent = getIntent();
        final String namaJaring = intent.getExtras().getString("namaJaring");
        final int whiteThumbJaring = intent.getExtras().getInt("whiteThumbJaring");
        final int rumusJaring = intent.getExtras().getInt("rumusJaring");

        TextView namaMateriJaring = (TextView)findViewById(R.id.namaMateriJaring);
        ImageView thumbMateriJaring = (ImageView)findViewById(R.id.imageMateriJaring);
        ImageView materiImageRumusJaring = (ImageView)findViewById(R.id.imageRumusJaring);

        namaMateriJaring.setText(namaJaring);
        thumbMateriJaring.setImageResource(whiteThumbJaring);
        materiImageRumusJaring.setImageResource(rumusJaring);


        FloatingActionButton fabback = findViewById(R.id.fabBack);
        fabback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Jaring.class);
                startActivity(intent);
            }
        });
    }
}


