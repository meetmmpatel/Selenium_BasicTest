package com.selenium.basicTestOne.partOne;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BasicCommands {
	
	Driver dr = new Driver();
	

	@Test
	public void basicTestCommands() {
		WebDriver firefox = dr.getFirefox();
		
		//These commands for Opening URL
		firefox.get("HTTP://google.com");
		firefox.navigate().to("HTTP://google.com");
		
		//selecting an web elements/locators
		firefox.findElement(By.name("q"));
		WebElement element = firefox.findElement(By.name("q"));
		
		//Wrting in text box
	    element.sendKeys("Testing");
	    firefox.findElement(By.name("q")).sendKeys("Testing");
	    
	    //Clear the text
	    firefox.findElements(By.name("q")).clear();
	    
	    //Read or fatch the text
	    firefox.findElement(By.id("hplogo")).getText();
	    
	    
	    //for browser movements
	    firefox.navigate().back();
	    firefox.navigate().forward();
	    firefox.navigate().refresh();
	    firefox.findElement(By.id("q")).sendKeys(Keys.F5);
	    
	    //closing the browser
	    firefox.close(); 
	    firefox.quit();
	    
		

	}

}
