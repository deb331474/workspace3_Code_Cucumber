package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ActLoginPage;
import pageObjects.CreateTimeBalanceReportsPage;
import pageObjects.DeleteCustomerPage;
import utilities.TestContextSetup;

public class CreateTimeBalanceReportsSteps {
	
	public WebDriver driver;
	TestContextSetup testContextSetup;
	public CreateTimeBalanceReportsPage createTimeBalanceReportsPage;
	
	
	
	public CreateTimeBalanceReportsSteps(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		this.createTimeBalanceReportsPage=testContextSetup.pageObjectManager.getcreateTimeBalanceReportsPage();
		
	}
	
	@Given("user is on the reports section")
	public void user_is_on_the_reports_section() {
		
		ActLoginPage actLoginPage=testContextSetup.pageObjectManager.getActLoginPage();
		actLoginPage.enterUsername("prusethdebasish@gmail.com");
		actLoginPage.enterPassword("debudon@211");
		actLoginPage.clickOnLoginButton();
		createTimeBalanceReportsPage.clickonReportTab();
		
	}

	@Given("user selects new time balance report")
	public void user_selects_new_time_balance_report() {
	   createTimeBalanceReportsPage.clickonTimeBalanceLink();
		
	}

	@When("user fills the details")
	public void user_fills_the_details(DataTable dataTable) {
		
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		    String dateRange = data.get(0).get("Date Range");
	        String dataGrouping = data.get(0).get("Data Grouping");
	        String dataGroupinglevel = data.get(0).get("Data GroupingLevel");
	        //String selectedStaff = data.get(0).get("Selected Staff");
	        String timeFormat = data.get(0).get("Time Format");
	        
	        createTimeBalanceReportsPage.selectdateRangeDropdown(dateRange);
	        createTimeBalanceReportsPage.selectdataGroupingUserDropdown(dataGrouping);
	        createTimeBalanceReportsPage.selectdataGroupingLevelDropdown(dataGroupinglevel);
	        //createTimeBalanceReportsPage.selectStaffDropdown(selectedStaff);
	        createTimeBalanceReportsPage.selecttimeFormatDropdown(timeFormat);
	        
	        createTimeBalanceReportsPage.selectReportColChkBox();
	        
	        
	      
	}

	@When("user selects Generate HTML Report")
	public void user_selects_generate_html_report() {
	   
		System.out.println("Click on the HTML Report");
	}

	@Then("user get the HTML report in tabular format")
	public void user_get_the_html_report_in_tabular_format() {
		
		System.out.println("User get the HTML Report");
	}

}
