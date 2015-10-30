package com.ename.www.mould.utils;

import android.util.Log;

/**
 * Created by Yx on 2015/10/30.
 * Log工具箱
 */
public class L {

    /**
     * verbose
     * @param obj
     */
    public static void v(Object obj) {
            String tag = getClassName();
            String msg = obj != null ? obj.toString() : "obj == null";
            Log.v(tag, msg);
    }


    private static String getClassName() {
        String result = "";
        StackTraceElement thisMethodStack = (new Exception()).getStackTrace()[2];
        result = thisMethodStack.getClassName();
        return result;
    }


  }