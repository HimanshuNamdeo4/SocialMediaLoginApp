package com.sparkfoundation.socialmedialoginapp.app;

import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;

public class Application extends android.app.Application {
    @Override
    public void onCreate() {
        super.onCreate();
        FacebookSdk.fullyInitialize();
        AppEventsLogger.activateApp(this);
    }
}
