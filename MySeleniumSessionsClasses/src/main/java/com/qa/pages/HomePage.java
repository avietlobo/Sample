package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

WebDriver ldriver;
	
	public HomePage(WebDriver driver)
	{
		ldriver=driver;
		
		PageFactory.initElements(driver, this);
		
	}
	

	@FindBy(xpath="//a[contains(@class,'primaryBtn font24 latoBlack widgetSearchBtn')]")
	WebElement btn_search;
	
	
	
	
	public FlightBookingPage SearchFlight()
	{
		btn_search.click();
		
		return new FlightBookingPage(ldriver);
	}
	

	
	
		
	
	
	
}
