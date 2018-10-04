package com.selenium.coreSeleniumCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.selenium.basicTestOne.partOne.Driver;

public class DragAndDropDemo {

	Driver dr = new Driver();
	WebDriver chrome = dr.getChrom();

	private final String demoSite = "https://the-internet.herokuapp.com/";

	@Test
	public void dragAndDrop() throws InterruptedException {

		chrome.navigate().to(demoSite);
		chrome.getCurrentUrl();

		WebElement element = chrome.findElement(By.xpath("//*[@id=\"content\"]/ul/li[8]/a"));
		Actions actions = new Actions(chrome);
		actions.click(element).perform();

		WebElement colA = chrome.findElement(By.id("column-a"));
		WebElement colB = chrome.findElement(By.id("column-b"));
		Thread.sleep(6000);
		Action dragAndDrop = actions.clickAndHold(colA).moveToElement(colB).release(colB).build();
		Thread.sleep(6000);
		dragAndDrop.perform();
		Thread.sleep(6000);

		chrome.quit();

	}

}
