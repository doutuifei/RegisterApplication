package com.muzi.registerapplication;

import android.app.Application;

import com.muzi.annotationapi.RegisterApplicationManager;

/**
 * Author: lipeng
 * Date: 2019/7/26
 * Email: lipeng@moyi365.com
 * Content:
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        RegisterApplicationManager.getInstance().register(this);
        RegisterApplicationManager.getInstance().onCreate(this);
    }
}
