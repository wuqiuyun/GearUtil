package com.wqy;

import android.app.Application;
import android.content.Context;

/**
 * Created by wqy on 2019/1/5.
 */

public class MyApplication extends Application {
    /**
     * Application Context
     */
    private static Context sContext;

    @Override
    public void onCreate() {
        super.onCreate();
        init();
    }

    private void init() {
        sContext = this.getApplicationContext();
    }

    /**
     * 获取全局Context
     *
     * @return context
     */
    public static Context getContext() {
        return sContext;
    }
}
