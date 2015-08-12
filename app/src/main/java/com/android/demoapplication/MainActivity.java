package com.android.demoapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.android.demoapplication.adapter.MenuAdapter;
import com.android.demoapplication.drawer.NavigationDrawerActivity;
import com.android.demoapplication.fab.FabActivity;
import com.android.demoapplication.notification.NotificationActivity;
import com.android.demoapplication.utility.DividerItemDecoration;
import com.android.demoapplication.viewpager.ViewPagerActivity;

import java.util.ArrayList;
import java.util.Collections;


public class MainActivity extends AppCompatActivity implements MenuAdapter.MenuOnClick {

    private ArrayList MenuList = new ArrayList();
    private RecyclerView recyclerView;
    private MenuAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
//    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView)findViewById(R.id.menu_list);
//        toolbar = (Toolbar) findViewById(R.id.toolbar_nav);
//        setSupportActionBar(toolbar);
        mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(getResources().getDrawable(R.drawable.abc_list_divider_mtrl_alpha)));
        Collections.addAll(MenuList, getResources().getStringArray(R.array.main_menu));

        mAdapter = new MenuAdapter(MenuList);
        mAdapter.setOnLongItemClickListener(this);

        recyclerView.setAdapter(mAdapter);
        recyclerView.setHasFixedSize(true);
    }

    @Override
    public void onItemClick(View view, int position) {
        Intent intent = null;
        if(position == 0) {
            intent = new Intent(getApplicationContext(), FabActivity.class);
        }else if(position == 1) {
            intent = new Intent(getApplicationContext(), NavigationDrawerActivity.class);
        }else if(position == 2) {
            intent = new Intent(getApplicationContext(), ViewPagerActivity.class);
        }else if(position == 3){
            intent = new Intent(getApplicationContext(), CardViewActivity.class);
        }else if(position == 4){
            intent = new Intent(getApplicationContext(), NotificationActivity.class);
        }
        startActivity(intent);
    }
}
