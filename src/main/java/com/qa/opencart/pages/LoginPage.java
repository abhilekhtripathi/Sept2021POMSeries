package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.utils.Constants;
import com.qa.opencart.utils.ElementUtil;

public class LoginPage {
	// 1 declasre private driver

	private WebDriver driver;
	private ElementUtil eleUtil;
	// 2 create a page constructere

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(driver);
		// 3 By locators
	}

	private By emilId = By.id("input-email");
	private By password = By.id("input-password");
	private By LoginBtn = By.xpath("//button[text()='Login']");
	private By registerLink = By.linkText("Register");
	private By forgotPwdLink = By.linkText("Forgotten Password");

	// 4 Page Ations

	public String getloginPageTitle() {
		return eleUtil.doGetTitle(Constants.LOGIN_PAGE_TITLE, Constants.DEFAULT_TIME_OUT);
	}

	public boolean getLoginPageUrl() {
		return eleUtil.waitForURLToContain(Constants.LOGIN_PAGE_URL_FRACTION, Constants.DEFAULT_TIME_OUT);
	}

	public boolean isForgotPwdLinkExist() {
		return eleUtil.doIsDisplayed(forgotPwdLink);
	}

	public boolean isRegisterLinkExist() {
		return eleUtil.doIsDisplayed(registerLink);
	}

	public AccountsPage doLogin(String un, String pwd) {
		System.out.println("login With :" + un + " : " + pwd);
		eleUtil.doSendKeys(emilId, un);
		eleUtil.doSendKeys(password, pwd);
		eleUtil.doClick(LoginBtn);
		return new AccountsPage(driver);

	}

}
