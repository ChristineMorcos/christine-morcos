package com.facebook.Facebook;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChromeDemo {

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
		driver.findElement(By.id("email")).sendKeys("01285999310");
		driver.findElement(By.id("pass")).sendKeys("Christine27");
		driver.findElement(By.name("login")).click();

	}
}
