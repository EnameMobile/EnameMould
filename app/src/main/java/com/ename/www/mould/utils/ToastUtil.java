package com.ename.www.mould.utils;

import android.content.Context;
import android.widget.Toast;

public class ToastUtil {

	protected static Toast mToast = null;
	
	/** 显示Toast **/
	public static void showToast(String text, Context context) {
		if(null != mToast) {
			mToast.setText(text);
			mToast.setDuration(Toast.LENGTH_SHORT);
		}else {
			mToast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
		}
		mToast.show();
	}
	
	/** 显示Toast **/
	public static void showLongToast(String text, Context context) {
		if(null != mToast) {
			mToast.setText(text);
			mToast.setDuration(Toast.LENGTH_LONG);
		}else {
			mToast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
		}
		mToast.show();
	}
}
