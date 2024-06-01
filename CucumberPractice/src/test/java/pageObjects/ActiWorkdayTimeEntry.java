package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ActiWorkdayTimeEntry {
	
	public WebDriver driver;

	public ActiWorkdayTimeEntry(WebDriver driver) {
		this.driver = driver;
	}
	
	By calls=By.xpath("//input[@id='spent_135_1']");
	By capPlanning=By.xpath("//input[@id='spent_138_1']");
	By NasaNegotiations=By.xpath("//input[@id='spent_95_1']");
	By RegressionTesting=By.xpath("//input[@id='spent_141_1']");
	
	By saveChangesbtn=By.xpath("//input[@id='SubmitTTButton']");
	
	By successMsg=By.xpath("//span[@class='successmsg']");
	
	public void enterCallTime(Integer a) {
		driver.findElement(calls).clear();
		driver.findElement(calls).sendKeys(a.toString());
	}
	public void entercapPlanning(Integer b) {
		driver.findElement(capPlanning).clear();
		driver.findElement(capPlanning).sendKeys(b.toString());
	}
	public void enterNasaNegotiations(Integer c) {
		driver.findElement(NasaNegotiations).clear();
		driver.findElement(NasaNegotiations).sendKeys(c.toString());
	}
	public void enterRegresssion(Integer d) {
		driver.findElement(RegressionTesting).clear();
		driver.findElement(RegressionTesting).sendKeys(d.toString());
	}
	
	public void clickOnSaveChanges() {
		driver.findElement(saveChangesbtn).click();
	}
	public boolean getSuccessmsg() {
		try {
			return driver.findElement(successMsg).isDisplayed();
		}
		catch (Exception e) {
			return false;
		}
	}

}
