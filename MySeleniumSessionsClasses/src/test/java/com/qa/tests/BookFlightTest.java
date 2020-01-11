package com.qa.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.pages.BasePage;
import com.qa.pages.FlightBookingPage;
import com.qa.pages.HomePage;

public class BookFlightTest extends BasePage{


HomePage hp;
FlightBookingPage fp;
	
	@Test
	public void bookFlight()
	{
		hp= new HomePage(driver);
		fp=hp.SearchFlight();
	    fp.BookFlight();
	
	}
	
	
	
	
	
}
