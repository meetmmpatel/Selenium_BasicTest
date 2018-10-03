package com.selenium.basicTestOne.partOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicTestNGdemo {
	
	Driver driver = new Driver();
	WebDriver firefox = driver.getFirefox();
	
	@BeforeTest
	public void initDriver() throws InterruptedException {
		System.out.println("We are testing in Firefox");
		Thread.sleep(5000);
		firefox.navigate().to("HTTP://google.com");
	}
	
	
	@Test
	public void searchTestNG() {
		final String key = "TestNG Testing Framework";
		
		WebElement element =firefox.findElement(By.name("q"));
		System.out.println("Please enter search key: " + key);
		element.sendKeys(key);
		System.out.println("Click submit ");
		element.submit();
		
		
	}
	
	@AfterTest
	public void closeTest() throws InterruptedException {
		Thread.sleep(5000);
		firefox.quit();
		
	}
	

}
