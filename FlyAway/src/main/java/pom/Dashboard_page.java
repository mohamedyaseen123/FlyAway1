package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dashboard_page {
	
	@FindBy(xpath="//a[@href='home']")
	public static WebElement Home;
	
}
