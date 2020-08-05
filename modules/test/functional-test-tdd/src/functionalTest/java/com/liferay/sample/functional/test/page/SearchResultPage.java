package com.liferay.sample.functional.test.page;

import org.openqa.selenium.By;

import com.liferay.sample.functional.test.utils.CommonMethods;

public class SearchResultPage {

	public boolean checkIfThereIsContentPublished() {

		return _commonMethods.verifyIfElementIsDisplayed(_listOfResultLocator); 
	}

	private static final By _listOfResultLocator = By.xpath("//*[@class='st-result']");

	CommonMethods _commonMethods = new CommonMethods();

}
