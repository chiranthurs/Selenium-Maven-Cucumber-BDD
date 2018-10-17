package com.bc.StepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;

import static com.bc.Utilities.YamlReader.getYamlValue;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import com.bc.CoreTestBase.WebDriverFactory;
import com.bc.PageActions.ExecuteAutomationAction;
import com.bc.PageObjects.BasePage;
import com.bc.Utilities.SeleniumWait;

@RunWith(Cucumber.class)
public class ExecuteAutomationSteps{
	
//	/** The driver. */
	WebDriver driver;
	
	/** The ExecuteAutomation page Action */
	ExecuteAutomationAction testEA;
		
	public ExecuteAutomationSteps(WebDriverFactory webdriverFactory) throws Throwable 
	{
		this.driver= webdriverFactory.getChromeDriver();
		testEA = new ExecuteAutomationAction(driver);
	}	

    @Given("^User is on execute automation login page$")
    public void user_is_on_execute_automation_login_page() throws Throwable 
    {
    	testEA.launchExecuteAutomationURL();
    	Reporter.log("Url launched logged in succcesfully");
    }

    @When("^User login to application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_to_application_with_username_something_and_password_something(String username, String password) throws Throwable {
    	
    	testEA.loginToExecuteAutomationWithUsernameAndPassword(username, password);
    	Reporter.log("User logged in succcesfully");
    }
    
}
