package PageObject;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class MonitorDetailsPage extends BasePage{

	public MonitorDetailsPage(WebDriver driver) {
		super(driver);
		
	}
	
	
	@FindBy(xpath="(//a[normalize-space()='Components'])[1]")
	 WebElement Comp;
	 
	@FindBy(xpath =("//a[normalize-space()='Monitors (2)']"))
	 WebElement moni;
	 
	@FindBy(xpath = "//div[@class='product-thumb']")
	List<WebElement> allMonProducts;
	
	Actions act= new Actions(driver);
	
	public void clickonMonitorDetsils() {
		act.moveToElement(Comp).moveToElement(moni).click().perform();
		
	}
	
	
	
  public List<String> allMonitorDetails() {
	  
	  List<String> allMonitorList=new ArrayList<String>();
	  for(WebElement ws:allMonProducts) {
		  String monitorDetailsText=ws.getText();
		  allMonitorList.add(monitorDetailsText);
		  
	  }
	  return allMonitorList;
	
}

}
