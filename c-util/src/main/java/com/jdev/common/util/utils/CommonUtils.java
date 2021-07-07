package com.jdev.common.util.utils;

import com.jdev.common.util.constants.CommonConstants;

public final class CommonUtils {

	public static String entry(String input) {
		return CommonConstants.DASH.concat(CommonConstants.ENTER).concat(CommonConstants.SPACE).
				concat(input).concat(CommonConstants.SPACE).concat(CommonConstants.METHOD).concat(CommonConstants.DASH);
	}
	
	public static String exit(String input) {
		return CommonConstants.DASH.concat(CommonConstants.EXIT).concat(CommonConstants.SPACE).
				concat(input).concat(CommonConstants.SPACE).concat(CommonConstants.METHOD).concat(CommonConstants.DASH);
	}
	
}
