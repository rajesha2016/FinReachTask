package com.finreach.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.finreach.framework.libraries.FileReaderLibrary;
import com.finreach.framework.libraries.LogUtils;
import com.finreach.framework.libraries.Utilities;

public class LoginPage {

	WebDriver driver;
	private static final LogUtils LOGGER = new LogUtils(LoginPage.class);

	public LoginPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Username*')]//../input")
	private WebElement username;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Password*')]//../input")
	private WebElement password;

	@FindBy(how = How.XPATH, using = "//button[@class='main-button']")
	private WebElement loginButton;
	
	@FindBy(how = How.XPATH, using = "//form[@id='login-form']//legend//..//p")
	private WebElement errorMessage;
	

	public void openURL() {

		driver.get(FileReaderLibrary.getInstance().getConfigReader().getApplicationUrl());
		LOGGER.info("********** Website opened ***********");
	}

	public void setUserName(String uName) {

		username.sendKeys(uName);
	}

	public void setPassword(String pWord) {

		password.sendKeys(pWord);
	}

	public void clickLoginButton() {

		loginButton.click();
	}
	
	public void setWrongUserName(String uName) {

		username.sendKeys(uName);
	}

	public void setWrongPassword(String pWord) {

		password.sendKeys(pWord);
	}

	public String getErrorMessage(){
		
		Utilities.waitForVisibilityofElement(driver, errorMessage);
		
		return errorMessage.getText().trim();
	}
}
