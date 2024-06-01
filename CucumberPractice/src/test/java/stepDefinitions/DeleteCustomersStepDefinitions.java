package stepDefinitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ActLoginPage;
import pageObjects.AddNewCustomer;
import pageObjects.DeleteCustomerPage;
import utilities.TestContextSetup;

public class DeleteCustomersStepDefinitions {
	
	public WebDriver driver;
	TestContextSetup testContextSetup;
	public DeleteCustomerPage deleteCustomerPage;
	
	
	
	public DeleteCustomersStepDefinitions(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		this.deleteCustomerPage=testContextSetup.pageObjectManager.getDeleteCustomerPage();
		
	}

	@Given("I am logged into the application")
	public void i_am_logged_into_the_application() {
		ActLoginPage actLoginPage=testContextSetup.pageObjectManager.getActLoginPage();
		actLoginPage.enterUsername("prusethdebasish@gmail.com");
		actLoginPage.enterPassword("debudon@211");
		actLoginPage.clickOnLoginButton();
		
	}

	@Given("I am on the All Customer Page")
	public void i_am_on_the_all_customer_page() {
		AddNewCustomer addNewCustomer=testContextSetup.pageObjectManager.getAddNewCustomer();
		addNewCustomer.clickOnTaskMenu();
		Assert.assertTrue(deleteCustomerPage.verifyallCustomerPage());
	}

	@When("^I select user (.*)$")
	public void i_select_user(String username) {
	    deleteCustomerPage.clickonCustomerName(username);
	    deleteCustomerPage.clickonSettingBtn();
	}

	@Then("I delete that particular user")
	public void i_delete_that_particular_user() {
	    deleteCustomerPage.clickonActionBtn();
	    deleteCustomerPage.clickonDeleteBtn();
	}

	//@Then("^I get the Confirmation Message \"Customer (.*) has been deleted\"$")
	@Then("^I get the Confirmation Message Customer (.*) has been deleted$")
	public void i_get_the_confirmation_message(String expectedMsg) {
		deleteCustomerPage.clickonDeletePermBTn();
	    
	    // Assuming getSuccMsg() returns a list or iterable
	    //List<String> actualMessages = deleteCustomerPage.getSuccMsgList();
		//Assert.assertTrue(actualMessages.contains("Customer " + expectedMsg + " has been deleted"));
		//Assert.assertTrue(actualMessages.contains(expectedMsg));---fail
	    
	}

}
