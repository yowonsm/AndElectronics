package com.jinsit.dogplus.common;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class ConvertUtil {
	public static long stringToLong(String value) {

		try {
			value = value.replace(",", "");
			return Long.valueOf(value);
		} catch (Exception ex) {
			return 0;
		}
	}

	public static int stringToInt(String value) {
		try {
			value = value.replace(",", "");
			return Integer.valueOf(value);
		} catch (Exception ex) {
			return 0;
		}
	}

	public static float stringToFloat(String value) {

		try {
			value = value.replace(",", "");
			return Float.parseFloat(value);
		} catch (Exception ex) {
			return 0;
		}
	}

	public static boolean stringToBoolean(String value) {
		try {
			return Boolean.valueOf(value);
		} catch (Exception ex) {
			return false;
		}
	}
	

	public static String ChangeDecimalFormat(float transNumber) {
		DecimalFormat df = new DecimalFormat("###,###,###,###");
		return df.format(transNumber);
	}

	public static String ChangeDecimalFormat(int transNumber) {
		DecimalFormat df = new DecimalFormat("###,###,###,###");
		return df.format(transNumber);
	}

	public static String ChangePriceFormat(float transNumber) {
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumFractionDigits(2);
		nf.setGroupingUsed(true);

		return nf.format(transNumber);
	}

	public static String ChangePriceFormat(int transNumber) {
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumFractionDigits(0);
		nf.setGroupingUsed(true);

		return nf.format(transNumber);
	}

	public static String ChangeQtyFormat(float transNumber) {
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumFractionDigits(0);
		nf.setGroupingUsed(false);

		return nf.format(transNumber);
	}

	public static String ChangeQtyFormat(int transNumber) {
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumFractionDigits(0);
		nf.setGroupingUsed(false);

		return nf.format(transNumber);
	}

	public static String ChangeQtyFormat(long transNumber) {
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumFractionDigits(0);
		nf.setGroupingUsed(false);

		return nf.format(transNumber);
	}

}
