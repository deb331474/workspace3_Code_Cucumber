package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ActLoginPage;
import pageObjects.MyAccountPage;
import utilities.TestContextSetup;

public class ActiTime {
	
	TestContextSetup testContextSetup;
	public WebDriver driver;
	public ActLoginPage actiTime;
   
	
    public ActiTime(TestContextSetup testContextSetup) {
    	this.testContextSetup=testContextSetup;
		this.actiTime=testContextSetup.pageObjectManager.getActLoginPage();
	}
    
    
	@Given("I am on the login page")
	public void i_am_on_the_login_page() {
		
	   System.out.println("on the login page");
	}

	@Given("I enter Username as {string} and Password as {string}")
	public void i_enter_username_as_and_password_as(String username, String password) throws InterruptedException {
	    actiTime.enterUsername(username);
	    actiTime.enterPassword(password);
	}

	@When("I click on Login button")
	public void i_click_on_login_button() throws InterruptedException {
		actiTime.clickOnLoginButton();
	    Thread.sleep(5000);
	}

	@Then("I should able to logged into the application")
	public void i_should_able_to_logged_into_the_application() {
		System.out.println("Clicked login link");
	}

	@Then("I should be able to see the text {string}")
	public void i_should_be_able_to_see_the_text(String string) {
	    boolean text=actiTime.isTextPresent();
	    Assert.assertTrue("Unsuccessful", text);
	}
}
