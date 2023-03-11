package com.qa.salesforce.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.salesforce.driverfactory.DriverFactory;
import com.qa.salesforce.pages.LoginPage;

public class BaseTest {
	
	DriverFactory df;
	WebDriver driver;
	protected LoginPage loginPage;

	
	@BeforeTest
	public void setUp() {
		df=	new DriverFactory();
		driver=df.initDriver("chrome");
		loginPage= new LoginPage(driver);
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
