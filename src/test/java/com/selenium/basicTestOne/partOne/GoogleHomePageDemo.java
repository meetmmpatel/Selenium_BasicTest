package com.selenium.basicTestOne.partOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class GoogleHomePageDemo {

	Driver dr = new Driver();
	WebDriver chrom = dr.getChrom();
	WebDriver firefox = dr.getFirefox();

//	@Test
	public void getTheHomePage() {

		chrom.navigate().to("HTTP://google.com");
		chrom.findElement(By.name("q")).sendKeys("Selenium Testing");
		chrom.close();

	}

	// write the test to open the firefox browser
	// 1. open PNCbank home page
	// 2. find the user name and password windows
	// 3. enter the user name and password
	// 4. hit the submit button.

	@Test
	public void clickUserNameAndPassword() {
		firefox.navigate().to("HTTP://pncbank.com");
		firefox.findElement(By.name("userId")).sendKeys("Test");
		firefox.findElement(By.id("passwordInputField")).sendKeys("1234");
		firefox.findElement(By.id("olb-btn")).click();

	}

}
