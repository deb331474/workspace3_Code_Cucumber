package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

	public ActLoginPage actLoginPage;
	public WebDriver driver;
	public DemocartLoginPage democartLoginPage;
	public MyAccountPage myAccountPage;
	public ActiWorkdayTimeEntry actiWorkdayTimeEntry;
	public AddNewCustomer addNewCustomer;
	public DeleteCustomerPage deleteCustomerPage;
	public CopyCustomerPage copyCustomerPage;
	public CreateTimeBalanceReportsPage createTimeBalanceReportsPage;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public ActLoginPage getActLoginPage() {
		actLoginPage=new ActLoginPage(driver);
		return actLoginPage;
		
	}
	
	public DemocartLoginPage getDemocartLoginPage() {
		democartLoginPage=new DemocartLoginPage(driver);
		return democartLoginPage;
		
	}
	
	public MyAccountPage getaccountPage() {
		myAccountPage=new MyAccountPage(driver);
		return myAccountPage;
	}
	public ActiWorkdayTimeEntry getactiWorkdayTimeEntry() {
		actiWorkdayTimeEntry=new ActiWorkdayTimeEntry(driver);
		return actiWorkdayTimeEntry;
	}
	
	public AddNewCustomer getAddNewCustomer() {
		addNewCustomer=new AddNewCustomer(driver);
		return addNewCustomer;
	}
	public DeleteCustomerPage getDeleteCustomerPage() {
		deleteCustomerPage=new DeleteCustomerPage(driver);
		return deleteCustomerPage;
	}
	
	public CopyCustomerPage getCopyCustomerPage() {
		copyCustomerPage = new CopyCustomerPage(driver);
		return copyCustomerPage;
	}
	public CreateTimeBalanceReportsPage getcreateTimeBalanceReportsPage() {
		createTimeBalanceReportsPage=new CreateTimeBalanceReportsPage(driver);
		return createTimeBalanceReportsPage;
	}
}
