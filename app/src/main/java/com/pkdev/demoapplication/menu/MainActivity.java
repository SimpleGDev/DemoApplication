package com.pkdev.demoapplication.menu;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.pkdev.demoapplication.R;


public class MainActivity extends AppCompatActivity{

    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);

        getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.abc_fade_in,R.anim.abc_fade_out)
                .replace(R.id.container,MainMenuFragment.newInstance()).addToBackStack(null).commit();

    }

    public void setTitleToolbar(String title){
        mToolbar.setTitle(title);
    }

    public void setFragment(Fragment fragment){
        getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.abc_fade_in,R.anim.abc_fade_out)
                .replace(R.id.container,fragment).addToBackStack(null).commit();

    }
}
