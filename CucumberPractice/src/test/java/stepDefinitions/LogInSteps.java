package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ActLoginPage;
import pageObjects.DemocartLoginPage;
import pageObjects.MyAccountPage;
import utilities.TestContextSetup;

public class LogInSteps {
	
	TestContextSetup testContextSetup;
	public WebDriver driver;
	public DemocartLoginPage democartLoginPage;
	public MyAccountPage myAccountPage;
	
	public LogInSteps(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		this.democartLoginPage = testContextSetup.pageObjectManager.getDemocartLoginPage();
		this.myAccountPage = testContextSetup.pageObjectManager.getaccountPage();
	}
	

@Given("User Launch browser")
public void user_launch_browser() {
    System.out.println("Browser is launched");
}
@Given("opens URL {string}")
public void opens_url(String string) {
	System.out.println("URL is launched");
}
@When("User navigate to MyAccount menu")
public void user_navigate_to_my_account_menu() {
    democartLoginPage.clickOnMyAccountLink();
}
@When("click on Login")
public void click_on_login() {
    democartLoginPage.clickonLoginLink();
}
@When("User enters Email as {string} and Password as {string}")
public void user_enters_email_as_and_password_as(String username, String password) {
    democartLoginPage.inputUsername(username);
    democartLoginPage.inputPassword(password);
}
@When("Click on Login button")
public void click_on_login_button() {
    democartLoginPage.clickLoginBtn();
}
@Then("User navigates to MyAccount Page")
public void user_navigates_to_my_account_page() {
   boolean text=myAccountPage.getTextHeading();
   Assert.assertTrue(text);
}

}
