package com.qa.opencart.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.opencart.utils.Constants;

public class LoginPageTest extends BaseTest {

	@Test(priority  =1)

	public void loginPageTitleTest() {
		String actualTilte = loginPage.getloginPageTitle();
		System.out.println("page title :" + actualTilte);
		Assert.assertEquals(actualTilte, Constants.LOGIN_PAGE_TITLE);
	}

	@Test(priority  =2)
	public void loginPageUrlTest() {
		Assert.assertTrue(loginPage.getLoginPageUrl());
	}

	@Test(priority  =3)
	public void forgotPwdLinkTest() {
		Assert.assertTrue(loginPage.isForgotPwdLinkExist());

	}
	@Test(priority  =4)

	public void registerPwdLinkTest() {
		Assert.assertTrue(loginPage.isRegisterLinkExist());

	}
	@Test(priority  =5)
	
	public void loginTest() {
		loginPage.doLogin(prop.getProperty("username").trim() , prop.getProperty("password").trim());
	}

}
