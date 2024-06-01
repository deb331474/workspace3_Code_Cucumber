package stepDefinitions;

import java.net.SocketException;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObjects.CopyCustomerPage;
import pageObjects.DeleteCustomerPage;
import utilities.TestContextSetup;

public class CopyCustomerStepDefinitions {

	public WebDriver driver;
	TestContextSetup testContextSetup;
	public CopyCustomerPage copyCustomerPage;
	String modifiedName;
	public DeleteCustomerPage deleteCustomerPage;

	public CopyCustomerStepDefinitions(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		this.copyCustomerPage = testContextSetup.pageObjectManager.getCopyCustomerPage();

	}

	@Then("I copy that particular user")
	public void i_copy_that_particular_user() {
		this.deleteCustomerPage = testContextSetup.pageObjectManager.getDeleteCustomerPage();
		deleteCustomerPage.clickonActionBtn();
		copyCustomerPage.clickonCopyBtn();
	}

	@And("^I add business unit (.*) with user (.*)$")
	public void i_add_business_unit_with_user(String bu, String name) {

		modifiedName = name.concat(bu);
		copyCustomerPage.modifyName(modifiedName);
	}

	/*
	 * @Then("^I get the Confirmation Message Customer (.*) has been created as a copy of customer (.*)$"
	 * ) public void
	 * i_get_the_confirmation_message_customer_has_been_created_as_a_copy_of_customer
	 * (String modifiedName, String name) throws SocketException {
	 * 
	 * copyCustomerPage.confirmCopyBtn(); String
	 * act_Msg=copyCustomerPage.getSuccessMsg(); System.out.println(act_Msg);
	 * Assert.assertTrue(act_Msg.contains("Customer '"
	 * +modifiedName+"'has been created as a copy of customer'"+name+"'"));
	 * 
	 * }
	 */

	/*
	 * @Then("^I get the Confirmation Message Customer (.*) has been created as a copy of customer (.*)$"
	 * ) public void
	 * i_get_the_confirmation_message_customer_has_been_created_as_a_copy_of_customer
	 * (String modifiedName, String name) { copyCustomerPage.confirmCopyBtn();
	 * String actualMessage = copyCustomerPage.getSuccessMsg();
	 * System.out.println("Actual Confirmation Message: " + actualMessage);
	 * 
	 * String expectedMessage = "Customer " + modifiedName +
	 * " has been created as a copy of customer " + name;
	 */
	// Assert.assertTrue("Confirmation message does not match. Actual: " +
	// actualMessage, actualMessage.contains(expectedMessage));

	@Then("^I get the Confirmation Message Customer (.*) has been created as a copy of customer (.*)$")
	public void i_get_the_confirmation_message_customer_has_been_created_as_a_copy_of_customer(String modifiedName,
			String name) {

		copyCustomerPage.confirmCopyBtn();

		String expectedMessage = "Customer '" + modifiedName + "has been created as a copy of customer " + name+"']";

		/*
		 * Assert.assertTrue("Confirmation message does not match. Actual: " +
		 * actualMessage, actualMessage.contains(expectedMessage));
		 */
		
		 List<String> actualMessages = copyCustomerPage.getSuccMsgList();
		 System.out.println("Actual Confirmation Message: " + actualMessages);
			Assert.assertTrue(actualMessages.contains(expectedMessage));
	}

}
