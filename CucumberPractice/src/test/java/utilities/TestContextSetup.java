package utilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.ActLoginPage;
import pageObjects.PageObjectManager;

import utilities.TestBase;

public class TestContextSetup {
	
	public WebDriver driver;
	public TestBase testBase;
	public PageObjectManager pageObjectManager;
	
	public TestContextSetup() throws IOException
	{
		testBase = new TestBase();
		pageObjectManager = new PageObjectManager(testBase.WebDriverManager());
		
		

	}

}
