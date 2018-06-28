package Util;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Action_keyword.Locatersmap;

public class WebElementLocators {
	Locatersmap locatersMap;
	WebDriver driver;
	
	public WebElementLocators(WebDriver driver) throws IOException {
		locatersMap = new Locatersmap();
		this.driver = driver;
	}
	
	
	public WebElement getWebElement(String name) {	
		 String typeOfElement = locatersMap.getLocatorType(name);
		 String valueOfElement = locatersMap.getLocatorValue(name);
		 //System.out.println(typeOfElement);
		 //System.out.println(valueOfElement);
		 if(typeOfElement.equals("id") == true) {
			 return driver.findElement(By.id(valueOfElement)); 
		 }	  
		 else if(typeOfElement.equals("linkText") == true) {
			 return driver.findElement(By.linkText(valueOfElement));
		 }
		 else if(typeOfElement.equals("className") == true) {
			 return driver.findElement(By.className(valueOfElement));
		 }
		 else {
			 return driver.findElement(By.xpath(valueOfElement));
		 }
	}
}
