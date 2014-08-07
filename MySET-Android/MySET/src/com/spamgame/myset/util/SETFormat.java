package com.spamgame.myset.util;

import com.spamgame.myset.R;

public class SETFormat {

	public static String toString(double val) {
		
		String result = "";
		
		if (val > 0) {
			result = "+" + Double.toString(val);
		} else if (val < 0) {
			result = "-" + Double.toString(val);
		} else {
			result = Double.toString(val);
		}
		
		return result;
	}
	
	public static int getColor(double val) {
		
		int result = 0;
		
		if (val > 0) {
			result = R.color.color_change_green;
		} else if (val < 0) {
			result = R.color.color_change_red;
		} else {
			result = R.color.color_change_yellow;
		}
		
		return result;
	}
}
