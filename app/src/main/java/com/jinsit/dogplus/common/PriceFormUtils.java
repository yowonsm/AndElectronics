package com.jinsit.dogplus.common;

import java.text.NumberFormat;

public class PriceFormUtils {

	
	public static String getPriceFormat(String price){
		String formPrice="";
		NumberFormat nf = NumberFormat.getInstance();
		
		//nf.setMaximumFractionDigits(value);
		formPrice = nf.format(Integer.valueOf(price));
		
		return formPrice;
		
	}
}
