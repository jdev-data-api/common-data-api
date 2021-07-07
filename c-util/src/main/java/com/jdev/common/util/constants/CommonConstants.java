package com.jdev.common.util.constants;

//Note: interface automatically makes fields as public static and final

//New Constant implementation: https://dzone.com/articles/constants-in-java-the-anti-pattern-1
public final class CommonConstants {
	// PRIVATE //
	  /**
	   The caller references the constants using <tt>Consts.EMPTY_STRING</tt>, 
	   and so on. Thus, the caller should be prevented from constructing objects of 
	   this class, by declaring this private constructor. 
	  */
	private CommonConstants() {
		//this prevents even the native class from calling this actor as well :
	    throw new AssertionError();
	}

	public static String EMPTY = "";
	public static String SPACE = "";
	public static String SEPERATOR = "-";

	public static String METHOD = "Method";
	
	public static String DASH = "---------------";
	
	public static String ENTER = "Enter";
	public static String EXIT = "Exit";
}
