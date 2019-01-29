package com.finreach.stepdefinitions;

import org.junit.Assert;

import com.finreach.cucumber.context.TestContext;
import com.finreach.framework.libraries.LogUtils;
import com.finreach.pageobjects.LoginPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageStepDefinitions {

	LoginPage loginPage;
	TestContext testContext;
	private static final LogUtils LOGGER = new LogUtils(LoginPageStepDefinitions.class);

	public LoginPageStepDefinitions(TestContext context) {
		testContext = context;
		loginPage = testContext.getPageObjectLibrary().getLoginPage();
	}

	@Given("^User open the cafetownsend url$")
	public void user_open_the_cafetownsend_url() {

		LOGGER.info("********** Cafe Townsend login execution started ***********");
		loginPage.openURL();
	}

	@When("^User enter username \"([^\"]*)\"$")
	public void user_enter_username(String userName) {

		loginPage.setUserName(userName);
	}

	@And("^User enter password \"([^\"]*)\"$")
	public void user_enter_password(String password) {

		loginPage.setPassword(password);
	}

	@And("^User click on Login button$")
	public void user_click_on_Login_button() {

		loginPage.clickLoginButton();
	}

	@When("^User enter invalid username \"([^\"]*)\"$")
	public void user_enter_invalid_username(String wrongUserName) {

		loginPage.setWrongUserName(wrongUserName);

	}

	@And("^User enter invalid password \"([^\"]*)\"$")
	public void user_enter_invalid_password(String wrongPassword) {
		loginPage.setWrongPassword(wrongPassword);
	}

	@Then("^User receive validation error message$")
	public void user_receive_validation_error_message() {

		Assert.assertTrue(loginPage.getErrorMessage().contains("Invalid username or password!"));
	}

}
