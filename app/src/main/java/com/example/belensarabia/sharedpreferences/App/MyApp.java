package com.example.belensarabia.sharedpreferences.App;

import android.app.Application;
import android.os.SystemClock;

/**
 * Created by belensarabia on 3/6/18.
 */

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        SystemClock.sleep(3000);
    }
}
