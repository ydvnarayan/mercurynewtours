package com.mercurynewtours.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signon_page {
	@FindBy(xpath="//td[.='SIGN-ON']")
	private WebElement signon;

	@FindBy(name="userName")
	private WebElement Username;
	
	@FindBy(name="password")
	private WebElement pwd;

	@FindBy(name="login")
	private WebElement submit;
	
	@FindBy(xpath="FlighDetails")
	private WebElement FlightDetail;
	
	@FindBy(xpath="//input[@value='roundtrip']")
	private WebElement roundtrip;
	
	@FindBy(xpath="//input[@value='oneway']")
	private WebElement onetrip;
	
	@FindBy(name="passCount")
	private WebElement passenger;
	
	@FindBy(name="fromPort")
	private WebElement departingfrom;
	
	@FindBy(name="fromMonth")
	private WebElement onmonth;
	
	@FindBy(name="fromDay")
	private WebElement onday;
	
	@FindBy(name="toPort")
	private WebElement arrivingin;
	
	@FindBy(name="toMonth")
	private WebElement returningmonth;
	
	@FindBy(xpath="toDay")
	private WebElement returningday;
	
	public signon_page(WebDriver driver)
	 {
		 
		 PageFactory.initElements(driver, this);
	 }
	public void clickonsignon()
	{
		signon.click();
	}

	public void username(String username)
	{
		Username.sendKeys(username);
	}
	public void password(String password)
	{
		pwd.sendKeys(password);
	}
	public void clickonsubmit()
	{
		submit.click();
	}
	
	public void flightdetailsectiondisplayed()
	{
		FlightDetail.isDisplayed();
		roundtrip.isDisplayed();
		onetrip.isDisplayed();
		passenger.isDisplayed();
		departingfrom.isDisplayed();
		onmonth.isDisplayed();
		onday.isDisplayed();
		arrivingin.isDisplayed();
		returningmonth.isDisplayed();
		returningday.isDisplayed();
		
		
		
	}

}
