package com.pkdev.demoapplication.materialdesign.fab;

import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.pkdev.demoapplication.R;


/**
 * Created by ultimate on 7/19/2015.
 */
public class FabActivity extends AppCompatActivity {

    FloatingActionButton fabBtn;
    CoordinatorLayout rootLayout;
    Toolbar toolbar;
    CollapsingToolbarLayout collapsingToolbarLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fap_activity);
        initUIInstance();
    }

    private void initUIInstance(){
        fabBtn = (FloatingActionButton) findViewById(R.id.fabBtn);
        rootLayout = (CoordinatorLayout) findViewById(R.id.rootLayout);
        toolbar = (Toolbar) findViewById(R.id.toolbar);

        setUpToolbar();
        setUpCollapse();
        fabBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(rootLayout, "SnackBar By ult3mate", Snackbar.LENGTH_INDEFINITE)
                        .setAction("Undo", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                            }
                        })
                        .show();
            }
        });
    }

    private void setUpToolbar(){
        setSupportActionBar(toolbar);
    }

    private void setUpCollapse(){
        collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsingToolbarLayout);
//        collapsingToolbarLayout.setTitle("Design Library");
    }
}
