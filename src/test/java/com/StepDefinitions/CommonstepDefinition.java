package com.StepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import com.Constants.Constants;
import com.utilitys.CommonUtilities;
import com.utilitys.Webdriver;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class CommonstepDefinition {
	Logger Log = LogManager.getLogger(CommonstepDefinition.class);
	private static String senarioname;


	@Before
	public void beforeall(Scenario senario) {
		senarioname=senario.getName();
		Log.info("execution stated");
		try {

			CommonUtilities.getinstance().loadproperties();
			System.out.println(Constants.BROWSER);
			if (Webdriver.driver == null) {
				Webdriver.launchbrowser();
				
				Log.info("Execution Started");
				CommonUtilities.getinstance().initwebEle();
				Log.info("pagefactory initialized the webelement");

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
}

public static String getSenarioname() {
	return senarioname;
}
@AfterStep
public void screenShot(Scenario scenario) {
	try {
		if (scenario.isFailed()) {
			byte[] screenshotAs = ((TakesScreenshot)Webdriver.driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshotAs, "image/png", "failed-screenshot");
		}
	} catch (WebDriverException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
		
//	@After
//	public void teardown() {
//		Webdriver.driver.close();
//	}
}
