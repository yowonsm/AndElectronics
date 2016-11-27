package com.jinsit.dogplus.common;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * @author  yowonsm
 */
public class NetworkStates {

	 boolean netStates = true;
	public NetworkStates(Context context) {
		ConnectivityManager cm = (ConnectivityManager) context
				.getSystemService(Context.CONNECTIVITY_SERVICE);
		NetworkInfo ni = cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
		boolean isWifiConn = ni.isConnected();
		ni = cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
		boolean isMobileConn = ni.isConnected();

		if (!isWifiConn && !isMobileConn) {

			netStates = false;
		}

	}

	public boolean NetworkStates() {
		// TODO Auto-generated method stub
		 return netStates;
	}

}
