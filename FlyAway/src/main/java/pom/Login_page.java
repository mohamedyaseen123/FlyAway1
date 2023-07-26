package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_page {
	
	
	@FindBy(xpath="//input[@type='email']")
	public static WebElement Loginemail;
	
	@FindBy(xpath="//input[@type='password']")
	public static WebElement Loginpassword;
	
	@FindBy(xpath="//button['Login']")
	public static WebElement Loginbutton;
	
	@FindBy(xpath="//a[@href='signup']")
	public static WebElement signup;

}
