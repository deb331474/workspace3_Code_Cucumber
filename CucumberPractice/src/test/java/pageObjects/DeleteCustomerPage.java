package pageObjects;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DeleteCustomerPage {

	public WebDriver driver;
	public WebDriverWait wait;
	public JavascriptExecutor js;

	public DeleteCustomerPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		this.js = (JavascriptExecutor) driver;
	}

	By settingBtn = By.cssSelector("div[class='titleEditButtonContainer'] div[class='editButton']");
	By actionBtn = By.cssSelector("div[class='editCustomerPanelHeader'] div[class='action']");
	By deleteBtn = By
			.xpath("//div[@class='taskManagement_customerPanel']//div[@class='title'][normalize-space()='Delete']");
	By deletePermBtn = By.cssSelector(".content_customerPanel .buttonIcon");
	By succMsg = By.cssSelector(".innerHtml");
	By allCustPage = By.cssSelector(".manageScopeLabel");

	public void clickonCustomerName(String username) {
		By custName = By.xpath("//div[normalize-space()='" + username + "']");
		wait.until(ExpectedConditions.elementToBeClickable(custName));
		js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(custName));
		driver.findElement(custName).click();

	}

	public void clickonSettingBtn() {
		wait.until(ExpectedConditions.elementToBeClickable(settingBtn));
		driver.findElement(settingBtn).click();
	}

	public void clickonActionBtn() {
		wait.until(ExpectedConditions.elementToBeClickable(actionBtn));
		driver.findElement(actionBtn).click();
	}

	public void clickonDeleteBtn() {
		wait.until(ExpectedConditions.elementToBeClickable(deleteBtn));
		driver.findElement(deleteBtn).click();
	}

	public void clickonDeletePermBTn() {
		wait.until(ExpectedConditions.elementToBeClickable(deletePermBtn));
		driver.findElement(deletePermBtn).click();
	}
//	public String getSuccMsg() {
//		wait.until(ExpectedConditions.elementToBeClickable(succMsg));
//		String msg=driver.findElement(succMsg).getText();
//		return msg;
//	}

	/*
	 * public List<Object> getSuccMsgList() {
	 * wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(succMsg));
	 * List<Object> messages =
	 * driver.findElements(succMsg).stream().map(WebElement::getText)
	 * .collect(Collectors.toList()); return messages; }
	 */
	public boolean verifyallCustomerPage() {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(succMsg));
			return driver.findElement(allCustPage).isDisplayed();
		} catch (Exception e) {
			return e.getMessage() != null;
		}
	}

}
