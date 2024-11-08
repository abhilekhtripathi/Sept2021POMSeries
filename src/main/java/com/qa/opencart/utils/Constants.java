package com.qa.opencart.utils;

import java.util.ArrayList;
import java.util.List;

public class Constants {
	
	public static final String LOGIN_PAGE_TITLE = "Account Login";
	public static final String ACCOUNTS_PAGE_TITLE = "My Account";
	
	public static final String ACCOUNTS_PAGE_HEADER = "Your Store";
	public static final String  LOGIN_PAGE_URL_FRACTION = "route=account/login";
	public static final int DEFAULT_TIME_OUT = 10;
	
	
	public static List<String> getExpectedAccSecList() {
		
		List<String> exeSecList = new ArrayList<String>();
		exeSecList.add("My Account");
		exeSecList.add("My Orders");
		exeSecList.add("My Affiliate Account");
		exeSecList.add("Newsletter");
		return exeSecList;
	}

}
