package com.HomeDepot.FirstProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class homePage {
	public static WebDriver driver;
	

	public static void main(String[] args) {
		System.out.println("Hello world");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\singh\\Documents\\MS_Family\\Browsers\\chromedriver86.exe");	
	driver= new ChromeDriver();	
	driver.manage().window().maximize();	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
	driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);	
		
	driver.get("https://www.homedepot.com/");	
		
	WebElement alldept= driver.findElement(By.xpath("//ul[@class='ShoppingLinks']//a[contains (text(), 'All Departments')]"));	
	alldept.click();	
		
driver.close();
	}

}
