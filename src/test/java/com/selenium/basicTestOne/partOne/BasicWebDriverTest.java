package com.selenium.basicTestOne.partOne;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicWebDriverTest {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "/Users/milanpatel/Documents/core/software/geckodriver");
		
		WebDriver fireFoxDriver = new FirefoxDriver();
		
		fireFoxDriver.get("HTTP://yahoo.com");
		fireFoxDriver.navigate().to("HTTP://amazon.com");
		fireFoxDriver.navigate().refresh();
		
		fireFoxDriver.quit();
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/milanpatel/Documents/core/software/chromedriver-2");
		WebDriver chromDriver = new ChromeDriver();
		chromDriver.get("HTTP://amazon.com");
		chromDriver.quit();
		
		
	}

}
