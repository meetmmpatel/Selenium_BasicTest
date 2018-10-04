package com.selenium.coreSeleniumCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.selenium.basicTestOne.partOne.Driver;

public class RightClick {

	Driver dr = new Driver();
	WebDriver firefox = dr.getChrom();

	private final String demoSite = "Https://Opensource-Demo.orangehrmlive.com/";

	@Test
	public void rightClikcDemo() throws InterruptedException {
		firefox.get(demoSite);

		Actions action = new Actions(firefox);
		WebElement element = firefox.findElement(By.id("txtUsername"));

		action.contextClick(element).perform();

		Thread.sleep(2000);

		firefox.close();

	}

	@Test
	public void doubleClick() throws InterruptedException {

		
		firefox.get(demoSite);

		firefox.manage().window().maximize();
		firefox.manage().window().fullscreen();

		Actions actions = new Actions(firefox);
		WebElement element = firefox.findElement(By.id("btnLogin"));
		actions.doubleClick(element).perform();

		Thread.sleep(8000);
		firefox.quit();

	}

}
