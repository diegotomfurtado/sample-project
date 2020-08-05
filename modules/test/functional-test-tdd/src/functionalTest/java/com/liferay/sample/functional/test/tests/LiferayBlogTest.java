package com.liferay.sample.functional.test.tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.liferay.sample.functional.test.page.HomePage;
import com.liferay.sample.functional.test.page.SearchResultPage;
import com.liferay.sample.functional.test.utils.CommonMethods;

public class LiferayBlogTest {

	@Before
	public void setUpAll() throws Exception {
		_commonMethods.setUpAll();
	}
	
	@Test
	public void checkIfThereIsContentPublishedForTest_success() {
		
		String specificContent = "test";
		
		_homePage.searchSpecificContent(specificContent);
		Assert.assertTrue(_searchResultPage.checkIfThereIsContentPublished());
	}
	
	CommonMethods _commonMethods = new CommonMethods();
	HomePage _homePage = new HomePage();
	SearchResultPage _searchResultPage = new SearchResultPage();
}
