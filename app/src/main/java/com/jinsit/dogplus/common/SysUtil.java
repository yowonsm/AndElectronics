package com.jinsit.dogplus.common;

import java.text.DecimalFormat;

public class SysUtil {

	public static String NewLine = "\n";

	public String makeStringWithComma(String string, boolean ignoreZero) {
		if (string.length() == 0) {
			return "";
		}
		try {
			if (string.indexOf(".") >= 0) {
				return string;
			} else {
				long value = Long.parseLong(string);
				if (ignoreZero && value == 0) {
					return "";
				}
				DecimalFormat format = new DecimalFormat("###,###");
				return format.format(value);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return string;
	}
	

}
