package com.StepDefinitions;


import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import com.Constants.Constants;
import com.PageObjects.Loginpage;
import com.utilitys.Webdriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class adminSelection {

	Logger Log = LogManager.getLogger(adminSelection.class);
	@Given("I want to write a step with {string}")
	public void i_want_to_write_a_step_with(String number) {
		try {
			Webdriver.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
			Webdriver.driver.navigate().to(Constants.URL);
			Loginpage.getInstance().getLoginButton().click();
			Loginpage.getInstance().getRegmob().click();
			Loginpage.getInstance().getMobnum().sendKeys(number);
			Thread.sleep(7000);
			Loginpage.getInstance().getSubmit().click();
			String atmtext = Loginpage.getInstance().getATM().getText();
			if (atmtext.contains("Pin")) {
				Log.info(Loginpage.getInstance().getATM().getText());
				System.out.print(Loginpage.getInstance().getATM().getText());
				
			}
		} catch (Exception e) {
			Log.error(e.getMessage());
		Assert.fail("invalid number");
		}
	
	}
	@When("I check for the {int} in step")
	public void i_check_for_the_in_step(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	}
	@Then("I verify the {string} in step")
	public void i_verify_the_in_step(String string) {
	    // Write code here that turns the phrase above into concrete actions
	}
	
}

