package com.PageObjects;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPage {

	public static AdminPage Admininstance;

	private  AdminPage() {
	}

	public static AdminPage getInstance() {

		if (Admininstance == null) {
			Admininstance = new AdminPage();
		}

		return Admininstance;
	}

	@FindBy(xpath = "(//div[@class='menu-item'])[3]")
	private WebElement Loan;
	@FindBy(xpath = "//header[@id=\"new-header\"]/div/div[3]/div/div/nav/ul/li[3]/div[2]/div/ul/li[3]/a/label")
	private WebElement commercial;
	@FindBy(xpath = "(//div[@role='option'])[3]")
	private  WebElement role;
//	@FindBy(xpath = "*[text()='Admin']")
//	private WebElement admin;

	public WebElement getLoan() {
		return Loan;
	}

	public WebElement getCommercial() {
		return commercial;
	}

	public WebElement getRole() {
		return role;
	}

}
