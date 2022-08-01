package userRegestiration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestBase {
	public static WebDriver driver;


	@BeforeSuite
	public void startDriver() {
		System.setProperty("webdriver.chrome.driver", "/Users/christinemorcos/eclipse-workspace/Facebook/ChromeDriver/chromedriver");
		driver = new ChromeDriver();
		driver.navigate().to("https://web.facebook.com");
	}

	@Test
	public void signIn(String email, String Password) {
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(Password);
		driver.findElement(By.id("u_0_5_tb")).click();


	}
}
