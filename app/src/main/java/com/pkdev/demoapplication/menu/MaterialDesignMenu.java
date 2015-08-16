package com.pkdev.demoapplication.menu;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pkdev.demoapplication.R;
import com.pkdev.demoapplication.materialdesign.CardViewActivity;
import com.pkdev.demoapplication.materialdesign.adapter.MenuAdapter;
import com.pkdev.demoapplication.materialdesign.drawer.NavigationDrawerActivity;
import com.pkdev.demoapplication.materialdesign.fab.FabActivity;
import com.pkdev.demoapplication.materialdesign.notification.NotificationActivity;
import com.pkdev.demoapplication.materialdesign.utility.DividerItemDecoration;
import com.pkdev.demoapplication.materialdesign.viewpager.ViewPagerActivity;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by ultimate on 8/16/2015.
 */
public class MaterialDesignMenu extends Fragment implements MenuAdapter.MenuOnClick {

    private View rootview;
    private ArrayList MenuList = new ArrayList();
    private RecyclerView recyclerView;
    private MenuAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    //    private Toolbar toolbar;

    public static Fragment newInstance(){
        return new MaterialDesignMenu();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if(rootview == null) {
            rootview = inflater.inflate(R.layout.fragment_main,container,false);
            recyclerView = (RecyclerView)rootview.findViewById(R.id.menu_list);
        }
        return rootview;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(getResources().getDrawable(R.drawable.abc_list_divider_mtrl_alpha)));
        Collections.addAll(MenuList, getResources().getStringArray(R.array.basic_android_menu));

        mAdapter = new MenuAdapter(MenuList);
        mAdapter.setOnLongItemClickListener(MaterialDesignMenu.this);

        recyclerView.setAdapter(mAdapter);
        recyclerView.setHasFixedSize(true);
    }

    @Override
    public void onItemClick(View view, int position) {
        Intent intent = null;
        if(position == 0) {
            intent = new Intent(getActivity(), FabActivity.class);
        }else if(position == 1) {
            intent = new Intent(getActivity(), NavigationDrawerActivity.class);
        }else if(position == 2) {
            intent = new Intent(getActivity(), ViewPagerActivity.class);
        }else if(position == 3){
            intent = new Intent(getActivity(), CardViewActivity.class);
        }else if(position == 4){
            intent = new Intent(getActivity(), NotificationActivity.class);
        }
        startActivity(intent);
    }
}
