package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ActLoginPage;
import pageObjects.ActiWorkdayTimeEntry;
import utilities.TestContextSetup;

public class ActiWorkday {
	
	TestContextSetup testContextSetup;
	public WebDriver driver;
	public ActLoginPage actiTime;
	public ActiWorkdayTimeEntry actiWorkdayTimeEntry;
	
	public ActiWorkday(TestContextSetup testContextSetup) {
    	this.testContextSetup=testContextSetup;
		this.actiTime=testContextSetup.pageObjectManager.getActLoginPage();
		this.actiWorkdayTimeEntry=testContextSetup.pageObjectManager.getactiWorkdayTimeEntry();
		
	}
	
	
	@Given("I am on the time-track workday page")
	public void i_am_on_the_time_track_workday_page() {
		actiTime.enterUsername("admin");
		actiTime.enterPassword("manager");
		actiTime.clickOnLoginButton();
	    Assert.assertTrue(actiTime.isTextPresent());
	}

	@When("I enter the {int} in calls field")
	public void i_enter_the_in_calls_field(Integer a) {
	    actiWorkdayTimeEntry.enterCallTime(a);
		
	}

	@And("I enter the {int} in capacity planning field")
	public void i_enter_the_in_capacity_planning_field(Integer b) {
	    actiWorkdayTimeEntry.entercapPlanning(b);
	}

	@And("I enter the {int} in NASA negotiations field")
	public void i_enter_the_in_nasa_negotiations_field(Integer c) {
	    actiWorkdayTimeEntry.enterNasaNegotiations(c);
	}

	@And("I click on the save changes button")
	public void i_click_on_the_save_changes_button() throws InterruptedException {
	    actiWorkdayTimeEntry.clickOnSaveChanges();
	    Thread.sleep(3000);
	}

	@Then("i should see the success message")
	public void i_should_see_the_success_message() {
	    boolean msg=actiWorkdayTimeEntry.getSuccessmsg();
	    Assert.assertTrue("Not Found", msg);
	}


}
