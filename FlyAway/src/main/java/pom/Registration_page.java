package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registration_page {

	@FindBy(xpath="//input[@type='email']")
	public static WebElement email;
	
	@FindBy(xpath="//input[@type='password']")
	public static WebElement password;
	
	@FindBy(xpath="//input[@name='pwd2']")
	public static WebElement cnfpassword;
	
	@FindBy(xpath="//input[@name='name']")
	public static WebElement name;
	
	@FindBy(xpath="//input[@name='address']")
	public static WebElement address;
	
	@FindBy(xpath="//input[@name='city']")
	public static WebElement city;
	
	@FindBy(xpath="//button['Signup']")
	public static WebElement signupbutton;
}
