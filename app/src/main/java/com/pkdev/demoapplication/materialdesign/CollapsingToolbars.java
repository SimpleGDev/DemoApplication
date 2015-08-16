package com.pkdev.demoapplication.materialdesign;

import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.pkdev.demoapplication.R;

/**
 * Created by ultimate on 7/12/2015.
 */
public class CollapsingToolbars extends AppCompatActivity {
    CollapsingToolbarLayout collapsingToolbarLayout;
    Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.collapsing_toolbar);

        mToolbar = (Toolbar)findViewById(R.id.toolbar_collapse);
        collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsingToolbarLayout);
        collapsingToolbarLayout.setTitle("Design Library");
        setSupportActionBar(mToolbar);


    }
}
