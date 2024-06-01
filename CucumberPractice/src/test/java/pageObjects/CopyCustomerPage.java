package pageObjects;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CopyCustomerPage {

	public WebDriver driver;
	public WebDriverWait wait;

	public JavascriptExecutor js;

	public CopyCustomerPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		this.js = (JavascriptExecutor) driver;
	}
	// JavascriptExecutor js= (JavascriptExecutor) driver;

	By copyBtn = By.xpath("//div[@class='title'][normalize-space()='Copy']");
	By modifyName = By.cssSelector("div[class='copyCustomerDialog moveToDialog actionEnabled'] input[type='text']");
	By succMsg = By.cssSelector(".innerHtml");
	// By succMsg=By.xpath("(//div[@class='toastsContainer'])[1]");
	// By succMsg=By.cssSelector(".toastsContainer");
	By enterTextbox = By.xpath(
			"//div[contains(@class,'copyCustomerDialog moveToDialog actionEnabled')]//input[contains(@type,'text')]");
	// By copyCnfrmBtn=By.xpath("(//div[@class='ok
	// button'][normalize-space()='Copy'])[1]");
	// By copyCnfrmBtn=By.xpath("((//div[@class='buttonsContainer'])[2]/div)[1]");

	public void clickonCopyBtn() {
		wait.until(ExpectedConditions.elementToBeClickable(copyBtn));
		driver.findElement(copyBtn).click();
	}

	public void modifyName(String modifiedNmae) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(modifyName));
		driver.findElement(modifyName).clear();
		driver.findElement(modifyName).sendKeys(modifiedNmae);
	}

	/*
	 * public List<String> getSuccMsgList() {
	 * wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(succMsg));
	 * List<String> messages = driver.findElements(succMsg) .stream()
	 * .map(WebElement::getText) .collect(Collectors.toList()); return messages; }
	 */

	public void confirmCopyBtn() {
		// wait.until(ExpectedConditions.visibilityOfElementLocated(copyCnfrmBtn));
		// js.executeScript("arguments[0].focus();", driver.findElement(copyCnfrmBtn));
//			Actions actions = new Actions(driver);
//	        actions.sendKeys(Keys.PAGE_DOWN).perform();
//	        driver.findElement(copyCnfrmBtn).click();
		// js.executeScript("arguments[0].scrollIntoView(true);",
		// driver.findElement(copyCnfrmBtn));

		// Wait for a short moment
//		    try {
//		        Thread.sleep(1000); // 1 second delay
//		    } catch (InterruptedException e) {
//		        e.printStackTrace();
//		    }
//		    
//		    driver.findElement(copyCnfrmBtn).click();
//		    
//		    
//		    wait.until(ExpectedConditions.visibilityOfElementLocated(copyCnfrmBtn));

		/*
		 * // Get the parent container of the copy button WebElement copyBtnContainer =
		 * driver.findElement(copyCnfrmBtn).findElement(By.xpath(".."));
		 * 
		 * // Scroll to the parent container
		 * js.executeScript("arguments[0].scrollIntoView(true);", copyBtnContainer);
		 * 
		 * // Click the element driver.findElement(copyCnfrmBtn).click()
		 */;

		WebElement copyCnfrmBtn = driver
				.findElement(By.xpath("(//div[@class='ok button'][normalize-space()='Copy'])[1]"));
		System.out.println("Is Copy Confirm Button Present? " + (copyCnfrmBtn != null));

		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		Actions actions = new Actions(driver);
		actions.moveToElement(copyCnfrmBtn);
		actions.perform();
		actions.click().perform();

		System.out.println("Is Copy Confirm Button Displayed? " + copyCnfrmBtn.isDisplayed());

	}

}
