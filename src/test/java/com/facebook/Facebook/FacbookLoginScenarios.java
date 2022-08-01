package com.facebook.Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FacbookLoginScenarios {

	ChromeDriver driver;

	@BeforeTest
	public void login() 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/christinemorcos/eclipse-workspace/Facebook/ChromeDriver/chromedriver");
		driver = new ChromeDriver();
		driver.navigate().to("https://web.facebook.com");

	}
	@Test
	public void FindElementById() {
		WebElement Username =  driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));
		WebElement login = driver.findElement(By.name("login"));
		Username.sendKeys("01285999310");
		password.sendKeys("Christine27");
		login.click();

	}
}
