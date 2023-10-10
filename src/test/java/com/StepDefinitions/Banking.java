package com.StepDefinitions;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import com.Constants.Constants;
import com.PageObjects.AdminPage;
import com.PageObjects.Loginpage;
import com.utilitys.CommonUtilities;
import com.utilitys.Webdriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Banking {
	Logger Log = LogManager.getLogger(Banking.class);

	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() throws InterruptedException {

		Webdriver.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		Webdriver.driver.get(Constants.URL);
		Log.info("URL launced successfully");
		Webdriver.driver.manage().window().maximize();
//		Loginpage.getInstance().getUsername().sendKeys(Constants.USERNAME);
//		Log.info("user entered username");
//		Loginpage.getInstance().getPassword().sendKeys(Constants.PASSWORD);
//		Log.info("user entered password");
//		Loginpage.getInstance().getSubmit().click();
//		Log.info("login successfully");
//		System.out.println(Webdriver.driver.getCurrentUrl());
	}

	@Given("some other precondition")
	public void some_other_precondition() {
	}

	@When("I complete action")
	public void i_complete_action() throws InterruptedException {
		try {
			Webdriver.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
			AdminPage.getInstance().getLoan().click();
			AdminPage.getInstance().getCommercial().click();
			AdminPage.getInstance().getRole().click();
		} catch (Exception e) {
			Log.error(e);
//			CommonUtilities.getinstance().takeScreenshot(CommonstepDefinition.getSenarioname());
			Assert.fail("role not selected");
		}
		
		
		

	}

	@When("some other action")
	public void some_other_action() {
	}

	@When("yet another action")
	public void yet_another_action() {
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
	}

	@Then("check more outcome")
	public void check_more_outcome() {
	}
}
//