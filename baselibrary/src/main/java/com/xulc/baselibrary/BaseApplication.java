package com.xulc.baselibrary;

import android.app.Application;
import android.util.Log;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Created by xulc on 2018/9/15.
 */
public class BaseApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        Log.i("xulc","xulc BaseApplication init");
        ARouter.openLog();  // Print log
        ARouter.openDebug();
        ARouter.init(this); // As early as possible, it is recommended to initialize in the Application
    }
}
