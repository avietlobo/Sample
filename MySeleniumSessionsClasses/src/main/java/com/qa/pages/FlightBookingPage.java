package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.qa.pages.*;

public class FlightBookingPage {

	WebDriver ldriver;
	
	public FlightBookingPage(WebDriver driver)
	{
		ldriver=driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath="//span[text()='Hotels']")
	WebElement lbl_hotels;
	
	@FindBy(xpath="//button[@class='fli_primary_btn text-uppercase ']")
	WebElement btn_booknow;
	
	
	
	//button[@class='fli_primary_btn text-uppercase ']
	
	public void BookFlight()
	{
		btn_booknow.click();
		
		
		
	}
	
	
	

	
	
	
}
