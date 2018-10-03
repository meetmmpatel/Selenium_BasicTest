package com.selenium.basicTestOne.partOne;

public class SeleniumBasicTest {
	
	static Driver d1 = new Driver();

	public static void main(String[] args) {
		
		d1.getChrom().close();
		d1.getChrom().get("Http://yahoo.com");
		
		

	}

}
