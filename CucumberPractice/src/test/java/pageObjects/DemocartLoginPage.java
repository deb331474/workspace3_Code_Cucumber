package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemocartLoginPage {
	
	public WebDriver driver;

	public DemocartLoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By myAccountLink=By.xpath("//span[normalize-space()='My Account']");
	By loginLink=By.xpath("//a[@class='dropdown-item'][normalize-space()='Login']");
	By username=By.xpath("//input[@id='input-email']");
	By password=By.xpath("//input[@id='input-password']");
	By btnLogin=By.xpath("//button[normalize-space()='Login']");
	
	
	public void clickOnMyAccountLink() {
		driver.findElement(myAccountLink).click();
	}
	public void clickonLoginLink() {
		driver.findElement(loginLink).click();
	}
	public void inputUsername(String uname) {
		driver.findElement(username).sendKeys(uname);
	}
	public void inputPassword(String pswd) {
		driver.findElement(password).sendKeys(pswd);
	}
	public void clickLoginBtn() {
		driver.findElement(btnLogin).click();
	}

}
