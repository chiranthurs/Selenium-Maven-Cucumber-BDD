package com.bc.PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// TODO: Auto-generated Javadoc
/**
 * The Class CastorHomePageUI.
 */
public class ExecuteAutomationPageUI extends BasePage {
	/** The driver. */
	WebDriver driver;

	/**
	 * Instantiates a new ExecuteAutomation home page UI.
	 *
	 * @param driver
	 *            the driver
	 */
	public ExecuteAutomationPageUI(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/**
	 * Gets the user name text box.
	 *
	 * @return the user name text box
	 */
	public WebElement get_enterUsername() {
		return expWait.getWhenClickable(By.name("UserName"), 10);
	}

	/**
	 * Gets the user password text box.
	 *
	 * @return the user password text box.
	 */
	public WebElement get_enterPassword() {
		return expWait.getWhenClickable(By.name("Password"), 10);
	}

	/**
	 * Gets the login button.
	 *
	 * @return the login button
	 */
	public WebElement get_clickLogin(){
		return expWait.getWhenClickable(By.xpath("//input[@name='Login']"), 30);
	}

}
