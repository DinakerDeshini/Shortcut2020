package com.ding.test;

import com.ding.util.Util;

public class ClientTest {

	public static void main(String[] args) {
		String companyName = Util.COMPANY_NAME;
		String location = Util.getLocation();
		System.out.println("Company Name :"+companyName);
		System.out.println("Location :"+location);
		System.out.println("It worked");
	}

}
