package com.finreach.stepdefinitions;

import org.junit.Assert;

import com.finreach.cucumber.context.TestContext;
import com.finreach.framework.libraries.LogUtils;
import com.finreach.pageobjects.HomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageStepDefinitions {

	HomePage homePage;
	TestContext testContext;
	private static final LogUtils LOGGER = new LogUtils(HomePageStepDefinitions.class);

	public HomePageStepDefinitions(TestContext context) {
		testContext = context;
		homePage = testContext.getPageObjectLibrary().getHomePage();
	}

	@Then("^User navigates to homepage$")
	public void user_navigates_to_homepage(){
		
		Assert.assertTrue(homePage.verifyUserIsInHomePage());
		LOGGER.info("********** User is in Home page now ***********");
	}

	@Given("^User is on homepage$")
	public void user_is_on_homepage(){
		
	}

	@When("^User click on Create button$")
	public void user_click_on_Create_button(){
		
	}
}
