package com.android.demoapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.android.demoapplication.adapter.CardViewAdapter;

import java.util.ArrayList;

/**
 * Created by ultimate on 8/1/2015.
 */
public class CardViewActivity extends AppCompatActivity {

    ArrayList<String> personalData;
    RecyclerView mRecyclerView;
    CardViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cardview_activity);

        mRecyclerView = (RecyclerView)findViewById(R.id.recyclercardview);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        mRecyclerView.setLayoutManager(linearLayoutManager);

        personalData = new ArrayList<>();
        personalData.add("test");
        personalData.add("test2");
        personalData.add("test3");
        personalData.add("test4");
        personalData.add("test5");
        personalData.add("test6");
        personalData.add("test7");
        personalData.add("test8");
        personalData.add("test9");
        personalData.add("test10");
        adapter = new CardViewAdapter(personalData);
        mRecyclerView.setAdapter(adapter);
        mRecyclerView.setHasFixedSize(true);
    }
}
