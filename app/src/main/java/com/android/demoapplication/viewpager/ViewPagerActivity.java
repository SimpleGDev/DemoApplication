package com.android.demoapplication.viewpager;

import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.android.demoapplication.R;

/**
 * Created by ultimate on 7/26/2015.
 */
public class ViewPagerActivity extends AppCompatActivity {

    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewpager;
    TabViewPager adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewpager_activity);

        tabLayout = (TabLayout)findViewById(R.id.tabLayout);
        viewpager = (ViewPager)findViewById(R.id.viewpager);
        toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        adapter = new TabViewPager(getSupportFragmentManager());

        initTab();
    }

    private void initTab(){
//        tabLayout.addTab(tabLayout.newTab().setText("Tab beta"));
//        tabLayout.addTab(tabLayout.newTab().setText("Tab alpha"));
//        tabLayout.addTab(tabLayout.newTab().setText("Tab sigma"));
        viewpager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewpager);
        viewpager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
            }
        }, 5000);

    }
}
