package com.example.android.taufan_fadhilah_iskandar_1202150017_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.LinkedList;

public class Menu extends AppCompatActivity {

    private final LinkedList<String> foods = new LinkedList<>();
    private final LinkedList<Integer> priceses = new LinkedList<>();
    private final LinkedList<Integer> photos = new LinkedList<>();
    private int mCount = 0;

    private RecyclerView mRecyclerView;
    private MenuAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        dummiesData();
        // Get a handle to the RecyclerView.
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        // Create an adapter and supply the data to be displayed.
        mAdapter = new MenuAdapter(this, foods, priceses, photos);
        // Connect the adapter with the RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        // Give the RecyclerView a default layout manager.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void dummiesData(){
        for (int i = 0;i < 3; i++){
            foods.add("Nasi Goreng");
            foods.add("Mie Goreng");
            foods.add("Kwetiaw Goreng");
            foods.add("Bihun Goreng");
            foods.add("Kentang Goreng");

            priceses.add(12000);
            priceses.add(11000);
            priceses.add(14000);
            priceses.add(15000);
            priceses.add(8000);

            photos.add(R.drawable.nasigoreng);
            photos.add(R.drawable.miegoreng);
            photos.add(R.drawable.kwetiawgoreng);
            photos.add(R.drawable.bihungoreng);
            photos.add(R.drawable.kentanggoreng);
        }
    }
}
