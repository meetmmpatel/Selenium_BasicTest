package com.selenium.coreSeleniumCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.selenium.basicTestOne.partOne.Driver;

public class MouseMovementTest {

	Driver dr = new Driver();
	WebDriver chrome = dr.getChrom();

	private final String demoSite = "HTTP://pncbank.com";
	

	@Test
	public void testMouseMovements() throws InterruptedException {

		chrome.get(demoSite);
		chrome.manage().window().maximize();

		Actions actions = new Actions(chrome);
		WebElement element = chrome.findElement(By
				.xpath("//*[@id=\"main-header\"]/div[1]/div/div[1]/div/div[1]/div/ul[1]/li[2]/a/span"));
		Thread.sleep(5000);
		actions.moveToElement(element).perform();
		Thread.sleep(6000);

		chrome.quit();

	}

}
