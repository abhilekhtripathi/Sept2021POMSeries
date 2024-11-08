package com.qa.opencart.test;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.opencart.utils.Constants;

public class AccountsPageTest extends BaseTest{
	
	@BeforeClass
	
	public void accPageSetup() {
		accountPgae = loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
	}
   @Test(priority = 1)
   public void accPageTitleTest() {
	  String actTitle = accountPgae.getAccountPageTitle();
	  System.out.println("the acc page title is :" +actTitle);
	  Assert.assertEquals(actTitle, Constants.ACCOUNTS_PAGE_TITLE);
   }
   @Test(priority =2 )
   public void accPageHeaderTest() {
	   String header = accountPgae.getAccountsPageHeader();
	   System.out.println("the acc page header is :"+ header);
	   Assert.assertEquals(header, Constants.ACCOUNTS_PAGE_HEADER);
   }
   
   @Test(priority = 3)
   
   public void isLogoutExistTest() {
	  Assert.assertTrue(accountPgae.isLogoutLinkExist());
   }
   @Test(priority = 4)
   public void accPageSectionsTest() {
	   List<String> actAccSecList = accountPgae.getAccountSeList();
	   Assert.assertEquals(actAccSecList, Constants.getExpectedAccSecList());
   }
   
   @Test(priority = 5)
   public void searchTest() {
	   accountPgae.doSearch("Mackbook Pro");
   }
}
