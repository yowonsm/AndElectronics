package com.jinsit.dogplus.common;

import android.util.Log;

public class DebugLog {
	
	public static void setLog(String tag, String msg){
		Log.e(tag, msg);
	}
}
