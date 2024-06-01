package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage {
	
	public WebDriver driver;

	public MyAccountPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By myAccountHeading=By.cssSelector("body main h2:nth-child(1)");
	
	public boolean getTextHeading() {
		try {
		return driver.findElement(myAccountHeading).isDisplayed();
	}
		catch (Exception e) {
			return false;
		}
	}

}
