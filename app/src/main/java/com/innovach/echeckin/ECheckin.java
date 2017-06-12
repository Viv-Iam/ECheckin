package com.innovach.echeckin;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by vivian on 11/06/17.
 */

public class ECheckin extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }

}
