package com.utilitys;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.Constants.Constants;
import com.PageObjects.AdminPage;
import com.PageObjects.Loginpage;
//common utilities class
public class CommonUtilities {
	public static CommonUtilities commoninstance;

	private CommonUtilities() {
	}

	public static CommonUtilities getinstance() {
		if (commoninstance == null) {
			commoninstance = new CommonUtilities();

		}
		return commoninstance;
	}

	public void loadproperties() throws IOException {
		FileInputStream reader = new FileInputStream("src\\test\\resources\\config.properties");
		Properties property = new Properties();
		try {

			property.load(reader);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}

		Constants.URL = property.getProperty("APP_URL");
		Constants.USERNAME = property.getProperty("Username");
		Constants.PASSWORD = property.getProperty("Password");
		Constants.BROWSER = property.getProperty("BROWSER");

	}

	public void initwebEle() {
		PageFactory.initElements(Webdriver.driver, Loginpage.getInstance());
		PageFactory.initElements(Webdriver.driver, AdminPage.getInstance());
	}

	public void mouseover(WebElement webelement) {
		Actions action = new Actions(Webdriver.driver);
		action.moveToElement(webelement).click().build().perform();
	}

	@SuppressWarnings("unused")
	private void select(WebElement webelement, String text) {
		Select sel = new Select(webelement);
		sel.selectByVisibleText(text);
	}


}
