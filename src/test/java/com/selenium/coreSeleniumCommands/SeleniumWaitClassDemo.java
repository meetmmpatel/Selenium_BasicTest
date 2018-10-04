package com.selenium.coreSeleniumCommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.selenium.basicTestOne.partOne.Driver;

public class SeleniumWaitClassDemo {

	Driver dr = new Driver();
	WebDriver chrome = dr.getChrom();

	private final String demoSite = "https://the-internet.herokuapp.com/";

	@Test
	public void setTheImplicitWait() {
		chrome.get(demoSite);
		chrome.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebDriverWait wait = new WebDriverWait(chrome, 15);

		WebElement element = chrome.findElement(By.xpath("//*[@id=\"content\"]/ul/li[24]/a"));
		Actions actions = new Actions(chrome);
		actions.click(element).perform();

		// Where driver will wait till the element is available
		wait.until(ExpectedConditions.presenceOfElementLocated((By) element));

		// this is example of making sure the element is avaialble for click
		wait.until(ExpectedConditions.elementToBeClickable((By) element));

		wait.until(ExpectedConditions.invisibilityOf(element));

	}

}
