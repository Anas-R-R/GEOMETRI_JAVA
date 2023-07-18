package com.anas.Belajar_Geometri;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.anas.Belajar_Geometri.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by anas on 5/6/2023.
 */

public class Jaring extends AppCompatActivity {
    RecyclerView recyclerView;
    JaringAdapter JaringAdapter;
    List<JaringItem> JaringItemList;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jaring);

        JaringItemList = new ArrayList<>();

        recyclerView = (RecyclerView)findViewById(R.id.recyclerViewJaring);
        recyclerView.setNestedScrollingEnabled(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

        JaringItemList.add(new JaringItem(
                "Kubus",
                R.drawable.kubus2,
                R.drawable.white_kubus,
                R.drawable.kubus2
        ));
        JaringItemList.add(new JaringItem(
                "Balok",
                R.drawable.balok2,
                R.drawable.white_balok,
                R.drawable.balok2
        ));
        JaringItemList.add(new JaringItem(
                "Kerucut",
                R.drawable.kerucut2,
                R.drawable.white_kerucut,
                R.drawable.kerucut2
        ));
        JaringItemList.add(new JaringItem(
                "Limas Segiempat",
                R.drawable.limassegiempat2,
                R.drawable.white_limassegiempat,
                R.drawable.limassegiempat2
        ));
        JaringItemList.add(new JaringItem(
                "Limas Segitiga",
                R.drawable.limassegitiga2,
                R.drawable.white_limassegitiga,
                R.drawable.limassegitiga2
        ));
        JaringItemList.add(new JaringItem(
                "Bola",
                R.drawable.bola2,
                R.drawable.white_bola,
                R.drawable.bola2
        ));
        JaringItemList.add(new JaringItem(
                "Prisma Segitiga",
                R.drawable.prisma2,
                R.drawable.white_prisma,
                R.drawable.prisma2
        ));
        JaringItemList.add(new JaringItem(
                "Tabung",
                R.drawable.tabung2,
                R.drawable.white_tabung,
                R.drawable.tabung2
        ));

        JaringAdapter = new JaringAdapter(this, JaringItemList);
        recyclerView.setAdapter(JaringAdapter);

        FloatingActionButton fab = findViewById(R.id.fabBack);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent2);
            }
        });
    }
}
