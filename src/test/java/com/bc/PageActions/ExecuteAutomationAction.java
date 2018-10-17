package com.bc.PageActions;

import org.openqa.selenium.WebDriver;

import com.bc.PageObjects.ExecuteAutomationPageUI;

public class ExecuteAutomationAction 
{
	/** The ExecuteAutomation Page UI. */
	ExecuteAutomationPageUI ExecuteAutomationLoginPg;
	
	/** The driver. */
	WebDriver driver;
	
	
	public ExecuteAutomationAction(WebDriver driver)
	{
		ExecuteAutomationLoginPg = new ExecuteAutomationPageUI(driver);		
		this.driver = driver;
	}
	
	public void launchExecuteAutomationURL()
	{
		ExecuteAutomationLoginPg.launchApplication("executeautomation");
	}
	
	public void loginToExecuteAutomationWithUsernameAndPassword(String username, String password)
	{
    	ExecuteAutomationLoginPg.get_enterUsername().sendKeys(username);
    	ExecuteAutomationLoginPg.get_enterPassword().sendKeys(password);
    	ExecuteAutomationLoginPg.get_clickLogin().click();
    	ExecuteAutomationLoginPg.closeBrowser();
	}

}
