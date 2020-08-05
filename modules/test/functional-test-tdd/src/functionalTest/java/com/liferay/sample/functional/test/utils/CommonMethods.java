package com.liferay.sample.functional.test.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.liferay.gs.testFramework.FunctionalTest;
import com.liferay.gs.testFramework.core.SeleniumReadPropertyKeys;
import com.liferay.gs.testFramework.utils.SeleniumWaitMethods;

/*
 * When you will need to use anything from the Liferay Framework
 * you must extends the FunctionalTest
 * 
 * In this class you will see the example as:
 * getWebdriver()
 * findElementWithWaitDriver()
 * 
 * */
public class CommonMethods extends FunctionalTest {

	public void clickOnTheElement(By locator) {

		// Improve your findElements using the implicitWaits
		SeleniumWaitMethods.findElementWithWaitDriver(getWebDriver(), locator,
				ExpectedConditions::visibilityOfElementLocated, ExpectedConditions::elementToBeClickable);
		// use getWebdriver() as the driver to interact with the browser
		getWebDriver().findElement(locator).click();
	}

	public void input(By locator, String text) {

		SeleniumWaitMethods.findElementWithWaitDriver(getWebDriver(), locator,
				ExpectedConditions::visibilityOfElementLocated, ExpectedConditions::elementToBeClickable);
		getWebDriver().findElement(locator).clear();
		getWebDriver().findElement(locator).sendKeys(text);
	}

	public String getTextFromPage(By locator) {

		SeleniumWaitMethods.findElementWithWaitDriver(getWebDriver(), locator,
				ExpectedConditions::visibilityOfElementLocated, ExpectedConditions::elementToBeClickable);

		String getText = getWebDriver().findElement(locator).getText().trim();
		return getText;
	}

	public void getTimeOutImplicitWait() {
		getWebDriver().manage().timeouts().implicitlyWait(SeleniumReadPropertyKeys.getTimeOut(), TimeUnit.SECONDS);
	}

	public void goToDefaultUrlPage() {
		getWebDriver().get(SeleniumReadPropertyKeys.getUrlToHome());
	}

	// It's important to define the dimension, specially when you run as Headless.
	public void setDimensionOfTheBrowser() {
		Dimension dimension = new Dimension(1424, 900);
		getWebDriver().manage().window().setSize(dimension);
	}

	public void setUpAll() {
		getTimeOutImplicitWait();
		goToDefaultUrlPage();
		setDimensionOfTheBrowser();
	}
	
	public boolean verifyIfElementIsDisplayed(By locator) {
		
		SeleniumWaitMethods.findElementWithWaitDriver(getWebDriver(), locator,
				ExpectedConditions::visibilityOfElementLocated, ExpectedConditions::elementToBeClickable);
		
		result = (getWebDriver().findElements(locator).size() > 0);
		return result;
	}
	
	boolean result = false;
}
