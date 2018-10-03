package com.selenium.dayOne.demosite.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.selenium.basicTestOne.partOne.Driver;

public class TestNGSeleniumExampleOne {

	Driver dr = new Driver();
	WebDriver chrome = dr.getChrom();
	WebDriver firefox = dr.getFirefox();

	@BeforeClass
	public void printBrowserUsed() {
		System.out.println("WebDrivers are initialized");

	}
	
	@Test(dataProvider = "sert")
	public void searchGoogle() {
		
	}

}
