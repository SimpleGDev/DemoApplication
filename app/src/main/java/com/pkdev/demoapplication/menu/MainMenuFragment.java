package com.pkdev.demoapplication.menu;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pkdev.demoapplication.R;
import com.pkdev.demoapplication.materialdesign.adapter.MenuAdapter;
import com.pkdev.demoapplication.materialdesign.utility.DividerItemDecoration;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by ultimate on 8/16/2015.
 */
public class MainMenuFragment extends Fragment implements MenuAdapter.MenuOnClick {

    View rootview;
    private ArrayList MenuList = new ArrayList();
    private RecyclerView recyclerView;
    private Toolbar mToolbar;
    private MenuAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    int mCurrentState;
    public static MainMenuFragment newInstance(){
        return new MainMenuFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if(rootview == null){
            rootview = inflater.inflate(R.layout.fragment_main,container,false);
            recyclerView = (RecyclerView)rootview.findViewById(R.id.menu_list);
            Collections.addAll(MenuList, getResources().getStringArray(R.array.main_menu));
        }
        return rootview;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if(savedInstanceState != null){
            mCurrentState = savedInstanceState.getInt("currentstate",0);
        }

        mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(getResources().getDrawable(R.drawable.abc_list_divider_mtrl_alpha)));

        if(mAdapter == null) {
            mAdapter = new MenuAdapter(MenuList);
        }else{
            mAdapter.notifyDataSetChanged();
        }
        mAdapter.setOnLongItemClickListener(this);

        recyclerView.setAdapter(mAdapter);
        recyclerView.setHasFixedSize(true);
    }

    @Override
    public void onItemClick(View view, int position) {
        mCurrentState = position;
        if(position == 0) {
            ((MainActivity)getActivity()).setFragment(MaterialDesignMenu.newInstance());
        }else if(position == 1) {
//            intent = new Intent(getActivity(), NavigationDrawerActivity.class);
        }
//        startActivity(intent);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("currentstate", mCurrentState);
    }
}