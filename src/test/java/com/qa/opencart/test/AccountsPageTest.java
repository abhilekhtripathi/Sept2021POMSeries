package com.qa.opencart.test;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.opencart.utils.Constants;

public class AccountsPageTest extends BaseTest {

	@BeforeClass
	public void accPageSetup() {
		accountsPage = loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Test(priority = 1)
	public void accPageTitleTest() {
		String actTitle = accountsPage.getAccountPageTitle();
		System.out.println("the acc page title is :" + actTitle);
		Assert.assertEquals(actTitle, Constants.ACCOUNTS_PAGE_TITLE);
	}

	@Test(priority = 2)
	public void accPageHeaderTest() {
		String header = accountsPage.getAccountsPageHeader();
		System.out.println("the acc page header is :" + header);
		Assert.assertEquals(header, Constants.ACCOUNTS_PAGE_HEADER);
	}

	@Test(priority = 3)

	public void isLogoutExistTest() {
		Assert.assertTrue(accountsPage.isLogoutLinkExist());
	}

	@Test(priority = 4)
	public void accPageSectionsTest() {
		List<String> actAccSecList = accountsPage.getAccountSeList();
		Assert.assertEquals(actAccSecList, Constants.getExpectedAccSecList());
	}

	@DataProvider

	public Object[][] productData() {
		return new Object[][] { { "MackBook Pro" }, { "Apple" }, { "Samsung" } };

	}

	@Test(priority = 5 ,dataProvider= "productData")
	public void searchTest(String productName ) {
		accountsPage.doSearch(productName);
	}
}
