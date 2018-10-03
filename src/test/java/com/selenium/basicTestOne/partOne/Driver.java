package com.selenium.basicTestOne.partOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
	
	
	public WebDriver getChrom() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/milanpatel/Documents/core/software/chromedriver-2");
		
		WebDriver chrom = new ChromeDriver();
		
		return chrom;
	
	}
	

	public WebDriver getFirefox() {
		
		System.setProperty("webdriver.gecko.driver", "/Users/milanpatel/Documents/core/software/geckodriver");
		
		WebDriver firefox = new FirefoxDriver();
		
		return firefox;
	
	}
}
