package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateTimeBalanceReportsPage {
	
	public WebDriver driver;
	public WebDriverWait wait;

	public CreateTimeBalanceReportsPage(WebDriver driver) {
		this.driver = driver;
		this.wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	}
	
	By reportLink=By.cssSelector(".content.reports");
	By timeBlnLink=By.xpath("//span[contains(text(),'Time Balance')]");
	By dateRangeDropdown=By.cssSelector(".middle-left-cell.contents.customRightPart");
	By dataGropuingUsersdropDwn=By.cssSelector("#ext-gen40");
	By dataGroupingGroupingLevel=By.cssSelector("#ext-gen49");
	By selectedStaffdrpDwn=By.cssSelector("#ext-gen59");
	By reportColumnChkBox=By.cssSelector(".checkbox.checkboxInput");
	By timeFormatdrpDwn=By.cssSelector("#ext-comp-1027");
	By tooltipText=By.cssSelector("#timeFormatInfo");
	
	
	public void clickonReportTab() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(reportLink));
		driver.findElement(reportLink).click();
	}
	
	public void clickonTimeBalanceLink() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(timeBlnLink));
		driver.findElement(timeBlnLink).click();
	}
	
	public void selectdateRangeDropdown(String currentMonthOpt) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(dateRangeDropdown));
		driver.findElement(dateRangeDropdown).click();
		By currentMonth=By.xpath("//div[@class='rangeItemTitle'][normalize-space()='"+currentMonthOpt+"']");
		driver.findElement(currentMonth).click();
	}
	
	public void selectdataGroupingUserDropdown(String userOpt) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(dataGropuingUsersdropDwn));
		driver.findElement(dataGropuingUsersdropDwn).click();
		By groupingUser=By.xpath("(//button[normalize-space()='"+userOpt+"'])[1]");
		driver.findElement(groupingUser).click();
	}
	
	public void selectdataGroupingLevelDropdown(String firstOpt) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(dataGroupingGroupingLevel));
		driver.findElement(dataGroupingGroupingLevel).click();
		By dataGrouping=By.xpath("(//a[normalize-space()='"+firstOpt+"'])[1]");
		driver.findElement(dataGrouping).click();
	}
	
	
	public void selectStaffDropdown(String staffOpt) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(selectedStaffdrpDwn));
		driver.findElement(selectedStaffdrpDwn).click();
		By staff=By.xpath("//label[normalize-space()='"+staffOpt+"']");
		//driver.findElement(staff).click();
		By closeBtn=By.cssSelector("#ext-gen59");
		driver.findElement(closeBtn).click();
	}
	
	
	public void selectReportColChkBox() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(reportColumnChkBox));
		driver.findElement(reportColumnChkBox).click();
	}
	
	
	public void selecttimeFormatDropdown(String selTime) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(timeFormatdrpDwn));
		driver.findElement(timeFormatdrpDwn).click();
		By timeHH=By.xpath("//a[@id='ext-comp-1028'][text()='"+selTime+"']");
		driver.findElement(timeHH).click();
	}

	public String getTooltipText() {
		 String tooltipTe = driver.findElement(tooltipText).getText();
		 return tooltipTe;
	}
}
