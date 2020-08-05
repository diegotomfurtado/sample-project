package com.liferay.sample.functional.test.page;

import org.openqa.selenium.By;

import com.liferay.sample.functional.test.utils.CommonMethods;

public class HomePage {

	public void searchSpecificContent(String specificContent) {

		clickOnTheSearchIcon();
		typeTheStringToSearch(specificContent);
		clickToStartSearching();
	}
	
	public void clickOnTheSearchIcon() {
		_commonMethods.clickOnTheElement(_searchIconLocator);
	}
	
	public void typeTheStringToSearch(String specificText) {
		_commonMethods.input(_searchFieldLocator, specificText);
	}
	
	public void clickToStartSearching() {
		_commonMethods.clickOnTheElement(_searchIconOnFieldLocator);
	}

	private static final By _searchIconLocator = By.xpath("//*[@class='osb-nav-item osb-nav-secondary-item search-bar']");
	private static final By _searchFieldLocator = By.xpath("//*[@id='siteSearchInput']");
	private static final By _searchIconOnFieldLocator = By.xpath("//*[@class='doc-search-submit']");

	CommonMethods _commonMethods = new CommonMethods();
}
