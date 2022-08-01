package userRegestiration;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.UserRegisterationPage1;

public class UserLogin extends TestBase {

	HomePage homeObject;
	UserRegisterationPage1 registerObject;
	//LoginPage LoginObject;
	

	@Test
	public void UserCanLoginSuccessfully() {

		homeObject = new HomePage(driver);
		homeObject.openCreateNewAccount();

		registerObject = new UserRegisterationPage1(driver);
		registerObject.UserRegisterationPage("Ahmed", "mohamed", "yesevi8222@5k2u.com", "12345678");
	}


}
