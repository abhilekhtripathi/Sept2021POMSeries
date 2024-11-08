package com.qa.opencart.test;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.opencart.factory.DriverFactory;
import com.qa.opencart.pages.AccountsPage;
import com.qa.opencart.pages.LoginPage;

public class BaseTest {

	DriverFactory df;
	WebDriver driver;
	Properties prop;
	LoginPage loginPage;
	AccountsPage accountsPage;

	@BeforeTest
	public void setup() {
		df = new DriverFactory();
		prop = df.inti_prop();
		driver = df.inti_driver(prop);
		loginPage = new LoginPage(driver);

	}

	@AfterTest

	public void tearDown() {

		driver.quit();

	}

}
