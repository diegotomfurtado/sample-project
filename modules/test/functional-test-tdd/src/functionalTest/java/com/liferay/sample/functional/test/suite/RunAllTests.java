package com.liferay.sample.functional.test.suite;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import com.liferay.gs.testFramework.core.ConcurrentSuite;
import com.liferay.gs.testFramework.driver.WebDriverManager;
import com.liferay.sample.functional.test.tests.LiferayBlogTest;

@RunWith(ConcurrentSuite.class)
@SuiteClasses
({
	LiferayBlogTest.class
})
public class RunAllTests {

	@AfterClass
	public static void afterClass() {
		_webDriverManager.quitAll();
	}

	private static WebDriverManager _webDriverManager = new WebDriverManager();
}
