package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BasePage {
	
	public static WebDriver driver;
	
	
	@BeforeClass
	public void setup()
	{
		
		
		  ChromeOptions options = new ChromeOptions();
		  options.addArguments("--incognito"); DesiredCapabilities capabilities =
		  DesiredCapabilities.chrome();
		  capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		 
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		
	}
	
	@AfterClass
	public void tearDown()
	{
		
		driver.quit();
	}
	
	

}
