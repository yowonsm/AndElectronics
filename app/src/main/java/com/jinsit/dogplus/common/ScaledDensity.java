package com.jinsit.dogplus.common;

import android.content.Context;
import android.util.DisplayMetrics;

/**
 * @author  yowonsm
 */
public class ScaledDensity {

	
	  public static float pixelsToSp(Context context, Float px) {
	        float scaledDensity = context.getResources().getDisplayMetrics().scaledDensity;
	        return px/scaledDensity;
	    }
	    
	  public static float dpFromPx(Context context, float px)
	  {
	      return px /context.getResources().getDisplayMetrics().density;
	  }


	  public static float pxFromDp(Context context, float dp)
	  {
	      return dp * context.getResources().getDisplayMetrics().density;
	  }
	  
	  public static int PixelToDp(Context context, int pixel) {

			DisplayMetrics metrics = context.getResources().getDisplayMetrics();

			float dp = pixel / (metrics.densityDpi / 160f);

			return (int) dp;

		}
	  
}
