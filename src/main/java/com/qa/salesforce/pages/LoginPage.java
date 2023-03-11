package com.qa.salesforce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver; 
	
	/**
	 * 1.private by locator
	 * 2.page constructor
	 * 3.page action/methods
	 */
	//1. private locator
	private By emailId=By.id("username");
	private By password=By.id("password");
	private By loginbtn=By.id("Login");
	
	
	//2. page constructor
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	//3.page actions/methods
	
	

	public String getTitle() {
		String title = driver.getTitle();
		System.out.println("Login page title :" + title);
		return title;
	}
	public boolean showForgotPasswordLink() {
		return driver.findElement(By.id("forgot_password_link")).isDisplayed();
	}
	public WebDriver doLogin(String un,String pwd) {
		 driver.findElement(emailId).sendKeys(un);
		 driver.findElement(password).sendKeys(pwd);
		 driver.findElement(loginbtn).click();
		
		return driver;
	}
	

}
