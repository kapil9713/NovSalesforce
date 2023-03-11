package com.qa.salesforce.driverfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	
	
	public WebDriver driver;
	
	public WebDriver initDriver(String browserName) {
		
		System.out.println("browser name is : "+browserName);
		
		if(browserName.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}
		else if(browserName.trim().equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}
		else if(browserName.trim().equalsIgnoreCase("Edge")) {
			driver=new EdgeDriver();
		}
		else {
			System.out.println("please Pass the Right Browser"+browserName);
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/?locale=in");
		
		return driver; 
	}
	
	

}
