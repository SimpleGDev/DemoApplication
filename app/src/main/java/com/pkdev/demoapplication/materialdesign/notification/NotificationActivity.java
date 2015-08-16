package com.pkdev.demoapplication.materialdesign.notification;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.pkdev.demoapplication.R;


/**
 * Created by ultimate on 8/1/2015.
 */
public class NotificationActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notification_layout);

        NewMessageNotification.notify(getApplicationContext(),"Test",2);

    }
}
