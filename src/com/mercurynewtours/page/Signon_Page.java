package com.mercurynewtours.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class Signon_Page {
	@FindBy(xpath="//td[.='SIGN-ON']")
	private WebElement signon;

	@FindBy(name="userName")
	private WebElement Username;
	
	@FindBy(name="password")
	private WebElement pwd;

	@FindBy(name="login")
	private WebElement submit;
	
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
	
	@FindBy(name="toDay")
	private WebElement returningday;
	
	public Signon_Page(WebDriver driver)
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
	
	public void flightdetailsectiondisplayed() throws InterruptedException
	{
		Thread.sleep(1000);
		 boolean rt=roundtrip.isDisplayed();
		 try
			{
			Assert.assertTrue(rt);
			Reporter.log("roundtrip is dispalyed",true);
			}
			catch(Exception e)
			{
				Reporter.log("roundtrip is not dispalyed",true);
				Assert.fail();
			}
	    boolean ot=onetrip.isDisplayed();
		try
		{
		Assert.assertTrue(ot);
		Reporter.log("onetrip is dispalyed",true);
		}
		catch(Exception e)
		{
			Reporter.log("onetrip is not dispalyed",true);
			Assert.fail();
		}
		
		boolean pass=passenger.isDisplayed();
		try
		{
		Assert.assertTrue(pass);
		Reporter.log("passenger is dispalyed",true);
		}
		catch(Exception e)
		{
			Reporter.log("passenger is not dispalyed",true);
			Assert.fail();
		}
		 boolean df=departingfrom.isDisplayed();
		try
		{
		Assert.assertTrue(df);
		Reporter.log("departingfrom is dispalyed",true);
		}
		catch(Exception e)
		{
			Reporter.log("departingfrom is not dispalyed",true);
			Assert.fail();
		}
		 boolean om=onmonth.isDisplayed();
		try
		{
		Assert.assertTrue(om);
		Reporter.log("onmonth is dispalyed",true);
		}
		catch(Exception e)
		{
			Reporter.log("onmonth is not dispalyed",true);
			Assert.fail();
		}
		boolean od=onday.isDisplayed();
		try
		{
		Assert.assertTrue(od);
		Reporter.log("onday is dispalyed",true);
		}
		catch(Exception e)
		{
			Reporter.log("onday is not dispalyed",true);
			Assert.fail();
		}
		boolean ai=arrivingin.isDisplayed();
		try
		{
		Assert.assertTrue(ai);
		Reporter.log("arrivingin is dispalyed",true);
		}
		catch(Exception e)
		{
			Reporter.log("arrivingin is not dispalyed",true);
			Assert.fail();
		}
		boolean rm=returningmonth.isDisplayed();
		try
		{
		Assert.assertTrue(rm);
		Reporter.log("returningmonth is dispalyed",true);
		}
		catch(Exception e)
		{
			Reporter.log("returningmonth is not dispalyed",true);
			Assert.fail();
		}
		boolean rd=returningday.isDisplayed();
		try
		{
		Assert.assertTrue(rd);
		Reporter.log("returningday is dispalyed",true);
		}
		catch(Exception e)
		{
			Reporter.log("returningday is not dispalyed",true);
			Assert.fail();
		}
		
		
		
	}

}
