package com.qa.salesforce.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.salesforce.base.BaseTest;

public class LoginPageTest extends BaseTest {

	@Test
	public void isTitleTest() {
		String title = loginPage.getTitle();
		Assert.assertEquals(title,"Login | Salesforce");
	}
	
	@Test
	public void isDoLoginTest() {
		loginPage.doLogin("kapil9713@gmail.com","&&kapil9713");
	}

}
