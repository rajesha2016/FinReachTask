package com.finreach.framework.libraries;

import org.openqa.selenium.WebDriver;

import com.finreach.pageobjects.CRUDPage;
import com.finreach.pageobjects.HomePage;
import com.finreach.pageobjects.LoginPage;

/**
 * @author r.moharana This class helps to create every page object. If
 *         applications have multiple step definitions file then with the help
 *         of this class we can avoid object creation again and again in step
 *         definition files
 */
public class PageObjectLibrary {

	private WebDriver driver;
	private LoginPage loginPage;
	private HomePage homePage;
	private CRUDPage crudPage;

	public PageObjectLibrary(WebDriver driver) {
		this.driver = driver;
	}

	// initialize LoginPage object, if already present then return the
	// current instance.
	public LoginPage getLoginPage() {

		return (loginPage == null) ? loginPage = new LoginPage(driver) : loginPage;
	}

	// initialize HomePage object, if already present then return
	// the current instance.
	public HomePage getHomePage() {

		return (homePage == null) ? homePage = new HomePage(driver) : homePage;
	}

	// initialize CRUDPage object, if already present then return the
	// current instance.
	public CRUDPage getCRUDPage() {

		return (crudPage == null) ? crudPage = new CRUDPage(driver) : crudPage;
	}

}
