package com.bc.StepDefinitions;

import java.net.MalformedURLException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.bc.CoreTestBase.TestSessionInitiator;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class Hooks 
{
	/** The test. */
	TestSessionInitiator test;
	
	String dataFile = "ExecuteAutomation.yml";
	
	@Before
    public void _setupEnvironment() throws MalformedURLException
    {
    	System.out.println("Calling the TestInitiatorClass");
    	test = new TestSessionInitiator(System.getProperty("datafile", dataFile));
    	Reporter.log("TestInitiatorClass called successfully");
    }
    
    @After
    public void embedScreenshot(Scenario scenario) {
        
//        if(scenario.isFailed()) {
//        try {
//        	 scenario.write("Current Page URL is " + driver.getCurrentUrl());
////            byte[] screenshot = getScreenshotAs(OutputType.BYTES);
//            byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
//            scenario.embed(screenshot, "image/png");
//        } catch (WebDriverException somePlatformsDontSupportScreenshots) {
//            System.err.println(somePlatformsDontSupportScreenshots.getMessage());
//        }
//        
//        }
//        driver.quit();
        
    }
    
}
