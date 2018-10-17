package com.bc.CoreTestBase;

import static com.bc.Utilities.YamlReader.getYamlValue;

import java.net.MalformedURLException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Reporter;

import com.bc.Utilities.WebEventListener;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class WebDriverFactory
{
	public WebDriver webdriver;
	
	public WebDriver driver;
	
	/** The e driver. */
	private EventFiringWebDriver e_driver;
	
	/** The event listener. */
	private WebEventListener eventListener;
	
	private static DesiredCapabilities capabilities = new DesiredCapabilities();
	
	/** The Driver path */
	String driverpath = "./src/test/resources/seleniumdriver/"; 
	
    public WebDriver getChromeDriver() throws Throwable 
    {  
    	try
    	{
        	System.setProperty("webdriver.chrome.driver", driverpath + "chromedriver.exe");
    		capabilities.setJavascriptEnabled(true);
    		driver = new ChromeDriver();
    		webdriver = createEventFiringWebDriver(driver);
    		return webdriver;
    	}
    	
    	catch(Exception ex)
    	{
    		System.out.println("Chrome driver initialization failed: " +ex.getMessage()+ex.getStackTrace());
    		Reporter.log("Chrome driver initialization failed: " +ex.getMessage());
    		throw ex;
    	}
				
    }
    
    public WebDriver getFireFoxDriver() throws Throwable
    {  
    	try {
    		System.setProperty("webdriver.gecko.driver", driverpath + "geckodriver.exe");
    		System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE,"true");
    		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
    		capabilities.setJavascriptEnabled(true);
    		driver = new FirefoxDriver();
    		webdriver = createEventFiringWebDriver(driver);
    		return webdriver;	   		
    	}
    	
    	catch(Exception ex)
    	{
    		System.out.println("firefox driver initialization failed: " +ex.getMessage()+ex.getStackTrace());
    		Reporter.log("firefox driver initialization failed: " +ex.getMessage());
    		throw ex;
    	}
    				
    }
    
    
    public WebDriver getIEDriver() throws Throwable
    { 
    	try
    	{
        	System.setProperty("webdriver.ie.driver", driverpath+"IEDriverServer.exe");
        	driver = new InternetExplorerDriver();
        	webdriver = createEventFiringWebDriver(driver);
    		return webdriver;
    	}
    	
    	catch(Exception ex)
    	{
    		System.out.println("IE driver initialization failed: " +ex.getMessage()+ex.getStackTrace());
    		Reporter.log("IE driver initialization failed: " +ex.getMessage());
    		throw ex;
    	}
			
    }
    
    public WebDriver createEventFiringWebDriver(WebDriver driver)throws Throwable
    {
    	try
    	{
        	e_driver = new EventFiringWebDriver(driver);
    		eventListener = new WebEventListener();
    		e_driver.register(eventListener);
    		driver = e_driver;
    		System.getProperties().put("org.apache.commons.logging.simplelog.defaultlog","fatal");
    		return driver;
    	}
    	
    	catch(Exception ex)
    	{
    		System.out.println("createEventFiringWebDriver failed: " +ex.getMessage()+ex.getStackTrace());
    		Reporter.log("createEventFiringWebDriver failed: " +ex.getMessage());
    		throw ex;
    	}

    }

}
