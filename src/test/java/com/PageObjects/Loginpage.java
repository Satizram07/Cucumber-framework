package com.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage {
	public static Loginpage Logininstance;

	private Loginpage() {

	}

	public static Loginpage getInstance() {
		if (Logininstance == null) {
			Logininstance = new Loginpage();
		}
	return Logininstance;
	}

	

	@FindBy(id  = "login-btn")
	private WebElement loginbutton;
	@FindBy(id = "DUMMY23")
	private WebElement regmob;
	@FindBy(id = "AuthenticationFG.RIB_LOGIN_MOBILE")
	private WebElement mobnum;
	@FindBy(id = "CUSTOM_RIB_VALIDATE_MOBILE_LOGIN")
	private WebElement submit;
	@FindBy(xpath ="(//*[@id='dummy'])[3]")
	private WebElement ATM;
	
	public WebElement getATM() {
		return ATM;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getLoginButton() {
		return loginbutton;
	}

	public WebElement getRegmob() {
		return regmob;
	}

	public WebElement getMobnum() {
		return mobnum;
	}

}
