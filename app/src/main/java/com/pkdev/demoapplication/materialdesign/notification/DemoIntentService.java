package com.pkdev.demoapplication.materialdesign.notification;

import android.app.IntentService;
import android.content.Intent;

/**
 * An {@link IntentService} subclass for handling asynchronous task requests in
 * a service on a separate handler thread.
 * <p/>
 * TODO: Customize class - update intent actions, extra parameters and static
 * helper methods.
 */
public class DemoIntentService extends IntentService {
    public DemoIntentService() {
        super("DemoIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        if (intent != null) {
            final String action = intent.getAction();
        }
    }
}
