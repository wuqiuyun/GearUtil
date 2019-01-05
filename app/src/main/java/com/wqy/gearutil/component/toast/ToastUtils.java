package com.wqy.gearutil.component.toast;

import android.widget.Toast;

import com.wqy.MyApplication;

/**
 * 公共Toast
 * Created by wqy on 2019/1/5.
 */

public class ToastUtils {
    public static void shortToast(String msg) {
        showToast(msg, Toast.LENGTH_SHORT);
    }

    public static void showToast(String msg, int duration) {
        Toast.makeText(MyApplication.getContext(), msg, duration).show();
    }
}
