package com.finreach.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

//import com.finreach.framework.libraries.LogUtils;

public class HomePage {

	WebDriver driver;
	//private static final LogUtils LOGGER = new LogUtils(HomePage.class);

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//p[@class='main-button']")
	private WebElement logoutButton;
	
	public boolean verifyUserIsInHomePage(){
		
		return logoutButton.isDisplayed();
	}
}
