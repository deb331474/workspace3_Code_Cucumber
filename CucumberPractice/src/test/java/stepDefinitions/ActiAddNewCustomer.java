package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ActLoginPage;
import pageObjects.AddNewCustomer;
import utilities.TestContextSetup;

public class ActiAddNewCustomer {
	
	public WebDriver driver;
	TestContextSetup testContextSetup;
	public AddNewCustomer addNewCustomer;
	
	
	public ActiAddNewCustomer(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		this.addNewCustomer=testContextSetup.pageObjectManager.getAddNewCustomer();
		
	}


	@Given("user is logged in to the Acti time page")
	public void user_is_logged_in_to_the_acti_time_page() {
		ActLoginPage actLoginPage=testContextSetup.pageObjectManager.getActLoginPage();
		actLoginPage.enterUsername("prusethdebasish@gmail.com");
		actLoginPage.enterPassword("debudon@211");
		actLoginPage.clickOnLoginButton();
		
	}

	@And("user is on the Tasks details page")
	public void user_is_on_the_tasks_details_page() throws InterruptedException {
		addNewCustomer.clickOnTaskMenu();
	}

	@When("user clicks on new Add new button")
	public void user_clicks_on_new_add_new_button() {
		addNewCustomer.clickOnAddNewbutton();
	}

	@And("clicks on New Customer")
	public void clicks_on_new_customer() {
	   addNewCustomer.clickOnNewCustomer();
	}

	@Then("^user should be able to enter all details in the create new (.+) modal$")
	public void user_should_be_able_to_enter_all_details_in_the_create_new_customer_modal(String name) {
	   addNewCustomer.setCustomerName(name);
	   addNewCustomer.setDescription("adsfsdfsdfsdfsdfsdfsd");
	   addNewCustomer.clickOnCreateCustomerBtn();
	}


}
