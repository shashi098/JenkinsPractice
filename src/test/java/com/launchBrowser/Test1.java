package com.launchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {
	
	

	
	
//	  static { System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe"); 
//	 // System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
//	  }
	 
	
	WebDriver driver;
	 
	  
	@Test
	public void openApp()
	{
		
		//System.out.println("test>>>>>>");
		WebDriverManager.firefoxdriver().setup();
		
		
		 driver=new FirefoxDriver();
		  
		 //driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.flipkart.com"); 
		 String title = driver.getTitle();
		 System.out.println(title); 
		 driver.quit();
		 
	}

}
