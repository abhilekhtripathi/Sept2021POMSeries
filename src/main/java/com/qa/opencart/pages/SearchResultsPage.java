package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.utils.ElementUtil;

public class SearchResultsPage {

	private WebDriver driver;

	private ElementUtil eleUtil;

	private By productsResult = By.cssSelector("div.caption a");

	public SearchResultsPage(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(driver);
	}

	public int getProductListCount() {
		int resultCount = eleUtil.waitForElementsToBeVisible(productsResult, 10, 2000).size();
		System.out.println("the product result count is :" + resultCount);
		return resultCount;
	}

	public void selectProduct() {

	}
}
