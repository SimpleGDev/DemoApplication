package com.pkdev.demoapplication.materialdesign.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pkdev.demoapplication.R;


/**
 * Created by ultimate on 7/26/2015.
 */
public class FragmentOne extends Fragment {

    public static FragmentOne newIntance(){
        FragmentOne fragment = new FragmentOne();
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_one,container,false);
        return v;
    }
}
