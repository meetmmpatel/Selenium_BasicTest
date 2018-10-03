package com.selenium.demoSite.hrmliveTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.selenium.basicTestOne.partOne.Driver;

public class HomePageTest {

	Driver dr = new Driver();
	WebDriver chrome = dr.getChrom();
	WebDriver firefox = dr.getFirefox();
	private final String demoSite = "Https://Opensource-Demo.orangehrmlive.com/";

	@BeforeSuite
	public void setUp() {
		firefox.navigate().to(demoSite);
	}

	@Test
	public void findHomePage() {
		firefox.navigate().refresh();
		String actualTitle = firefox.getTitle();
		System.out.println(actualTitle);
		assertEquals(actualTitle, "OrangeHRM");

	}

	@Test
	public void enterUserandPassword() {
		firefox.findElement(By.id("txtUsername")).sendKeys("Admin");
		firefox.findElement(By.id("txtPassword")).sendKeys("admin123");
		firefox.findElement(By.id("btnLogin")).click();

	}
	
	@Test
	public void secoundPage() throws InterruptedException {
		firefox.findElement(By.cssSelector("#dashboard-quick-launch-panel-menu_holder > table > tbody > tr > td:nth-child(1) > div > a"));
		Thread.sleep(7000);
	}
	
	@AfterSuite
   public void closeTheTest() {
		firefox.close();
	   
   }

}
