package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegisterationPage1 extends PageBase {

	public UserRegisterationPage1(WebDriver driver) {
		super(driver);

	}
	public void UserRegisterationPage(WebDriver driver) {

	}
	@FindBy(id="u_j_b_c5")
	WebElement FirstName;

	@FindBy(id="u_j_d_qO")
	WebElement Surname;

	@FindBy(id="u_j_g_W0")
	WebElement Email;

	@FindBy(id="password_step_input")
	WebElement password;

	@FindBy(id="u_j_s_Vz")
	WebElement SignUpButton;

	public void UserRegisterationPage(String firstname , String lastname , String email , String Password) {
		FirstName.sendKeys(firstname);
		Surname.sendKeys(lastname);
		Email.sendKeys(email);
		password.sendKeys(Password);
		SignUpButton.click();

	}
}
