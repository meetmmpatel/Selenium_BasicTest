package com.selenium.coreSeleniumCommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.selenium.basicTestOne.partOne.Driver;

public class AlertDemoTest {

	Driver dr = new Driver();
	WebDriver chrome = dr.getChrom();

	private final String demoSite = "https://the-internet.herokuapp.com/";

	@Test
	public void testTheAlert() {

		chrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		chrome.get(demoSite);

		WebElement webElement = chrome.findElement(By.xpath("//*[@id=\"content\"]/ul/li[25]/a"));
		Actions actions = new Actions(chrome);
		actions.click(webElement).perform();

		WebElement button = chrome.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button"));
		actions.click(button).perform();

		Alert alert = chrome.switchTo().alert();
		alert.accept();
		
		

	}

}
