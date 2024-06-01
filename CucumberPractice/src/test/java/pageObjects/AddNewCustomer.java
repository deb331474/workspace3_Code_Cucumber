package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddNewCustomer {
	
	public WebDriver driver;
	public WebDriverWait wait;

	public AddNewCustomer(WebDriver driver) {
		this.driver=driver;
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	}
	
	By tasksMenu=By.cssSelector(".content.tasks");
	By AddNewButton=By.xpath("//div[@class='addNewButton']//div[@class='downIcon']");
	
	By NewCustomer=By.cssSelector(".item.createNewCustomer");
	By CustomerName=By.cssSelector(".inputFieldWithPlaceholder.newNameField.inputNameField");
	By description=By.cssSelector("textarea[placeholder='Enter Customer Description']");
	By createCustomerBtn=By.xpath("//div[@class='components_button_label'][normalize-space()='Create Customer']");
	By successfulMsg=By.xpath("//div[@class='toastsContainer']");
	
	public void clickOnTaskMenu() {
		wait.until(ExpectedConditions.elementToBeClickable(tasksMenu));
		driver.findElement(tasksMenu).click(); 
	}
	
	public void clickOnAddNewbutton() {
		wait.until(ExpectedConditions.elementToBeClickable(AddNewButton));
		driver.findElement(AddNewButton).click();
		
	}
	
	public void clickOnNewCustomer() {
		
		wait.until(ExpectedConditions.elementToBeClickable(NewCustomer));
		driver.findElement(NewCustomer).click();
	}
	public void setCustomerName(String cName) {
		driver.findElement(CustomerName).sendKeys(cName);
	}
	public void setDescription(String desc) {
		driver.findElement(description).sendKeys(desc);
	}
	
	public void clickOnCreateCustomerBtn() {
		driver.findElement(createCustomerBtn).click();
	}
	
	public String getMessage() {
		return driver.findElement(successfulMsg).getText();
	}

}
