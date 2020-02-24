package com.launchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test1 {
	
	
	WebDriver driver;
	
	static
	{
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	
	@Test
	public void openApp()
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();
	}

}
