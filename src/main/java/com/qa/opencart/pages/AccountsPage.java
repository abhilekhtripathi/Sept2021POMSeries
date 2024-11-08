package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.utils.ElementUtil;

public class AccountsPage {
	private WebDriver driver;

	private ElementUtil eleUtil;
	
	private By header = By.cssSelector("div#logo a");
	private By accountSections = By.cssSelector("div#contain h2");
	private By searchField = By.name("search");
	private By searchButton = By.cssSelector("div#search Button");
	private By logoutLink = By.linkText("Logout");

	public AccountsPage(WebDriver driver) {
		this.driver = driver;
		eleUtil= new ElementUtil(driver);
	}
	
	public void getAccountPageTitle() {
		
		
	}

}
