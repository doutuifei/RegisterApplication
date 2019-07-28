package com.muzi.registerapplication;

import android.app.Application;

import com.muzi.annotationapi.AbsApplication;
import com.muzi.registerapplication.annotation.annotation.RegisterApplication;

/**
 * Author: lipeng
 * Date: 2019/7/26
 * Email: lipeng@moyi365.com
 * Content:
 */
@RegisterApplication
public class PushApp extends AbsApplication {

    private static PushApp instance;

    int a = 0;

    public static PushApp getInstance() {
        return instance;
    }

    @Override
    public void onCreate(Application application) {
        super.onCreate(application);
        instance = this;
        a = 1;
    }

}
