package com.finreach.cucumber.context;

import com.finreach.framework.libraries.PageObjectLibrary;
import com.finreach.framework.libraries.WebDriverLibrary;

/**
 * @author r.moharana This class initialize WebDriverLibrary & PageObjectLibrary
 *         which is used in stepdefinition class
 *
 */
public class TestContext {

	private WebDriverLibrary webDriverLibrary;
	private PageObjectLibrary pageObjectLibrary;

	public TestContext() {
		webDriverLibrary = new WebDriverLibrary();
		pageObjectLibrary = new PageObjectLibrary(webDriverLibrary.getDriver());
	}

	// return WebDriverLibrary object
	public WebDriverLibrary getWebDriverLibrary() {
		return webDriverLibrary;
	}

	// return PageObjectLibrary object
	public PageObjectLibrary getPageObjectLibrary() {
		return pageObjectLibrary;
	}

}
