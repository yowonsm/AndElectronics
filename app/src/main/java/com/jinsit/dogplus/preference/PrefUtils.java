package com.jinsit.dogplus.preference;


import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class PrefUtils {
	public static void setPref(Context context, String key, String value) {
		SharedPreferences pref = null;
		pref = PreferenceManager.getDefaultSharedPreferences(context);
		SharedPreferences.Editor prefEditor = pref.edit();
		prefEditor.putString(key, value);
		prefEditor.commit();
	}
	
	public static String getAppPreferences(Context context, String key) {
		String returnValue = null;
		SharedPreferences pref = null;
		pref = PreferenceManager.getDefaultSharedPreferences(context);
		returnValue = pref.getString(key, "");		
		return returnValue;
	}
	public static boolean getAppPreferencesboolean(Context context, String key) {
		boolean returnValue = false;
		SharedPreferences pref = null;
		pref = PreferenceManager.getDefaultSharedPreferences(context);
		returnValue = pref.getBoolean(key, false);		
		return returnValue;
	}

	public static void setPref(Context context, String key,
							   boolean value) {
		SharedPreferences pref = null;
		pref = PreferenceManager.getDefaultSharedPreferences(context);
		SharedPreferences.Editor prefEditor = pref.edit();
		prefEditor.putBoolean(key, value);
		prefEditor.commit();
		
	}
}

