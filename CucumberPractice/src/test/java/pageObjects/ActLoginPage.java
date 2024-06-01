package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActLoginPage{
	
	public WebDriver driver;
	

	public ActLoginPage(WebDriver driver) {
		this.driver = driver;
	}

	By username =By.xpath("//input[@id='username']");
	
	By password=By.xpath("//input[@placeholder='Password']");
	
	By logiButton=By.xpath("//div[normalize-space()='Login']");
	
	
	By validationText=By.xpath("//div[@class='logoSwitcherText']");
	
	
	
	public void enterUsername(String uname) {
		driver.findElement(username).sendKeys(uname);
	}
	public void enterPassword(String pswd) {
		driver.findElement(password).sendKeys(pswd);
	}
	
	public void clickOnLoginButton() {
		driver.findElement(logiButton).click();
	}
	
	public boolean isTextPresent() {
		try {
			return driver.findElement(validationText).isDisplayed();
		}
		catch (Exception e) {
			return false;
		}
	}
}
