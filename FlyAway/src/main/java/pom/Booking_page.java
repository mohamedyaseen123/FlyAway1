package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Booking_page {
	
	@FindBy(xpath="//a[@href='completepurchase']")
	public static WebElement bookaflight;

}
