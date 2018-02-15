package com.mercurynewtours.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class Register_Page {
@FindBy(xpath="//td[.='REGISTER']")
 private WebElement register;
	 
 @FindBy(name="firstName")
 private WebElement fn;

 @FindBy(name="lastName")
 private WebElement ln;
 
 @FindBy(name="phone")
 private WebElement ph;

 @FindBy(name="userName")
 private WebElement eml;
 
 @FindBy(name="address1")
 private WebElement add;
	
 @FindBy(name="city")
 private WebElement cty;
	
 @FindBy(name="state")
 private WebElement State;

 @FindBy(name="postalCode")
 private WebElement Postalcode;
	
 @FindBy(name="country")
 private WebElement Country;
 
 @FindBy(name="email")
 private WebElement Username;

 @FindBy(name="password")
 private WebElement Pwd;

 @FindBy(name="confirmPassword")
 private WebElement Confirmpwd;

 @FindBy(name="register")
 private WebElement submit;
 
 @FindBy(xpath="//font[contains(.,' Dear Opesydra Uhet')]")
 private WebElement afterregister;
 
 public Register_Page(WebDriver driver)
 {
	 
	 PageFactory.initElements(driver, this);
 }
 public void contactInformation(String firstname,String lastname,String phone,String email)
 {
	 register.click();
     fn.sendKeys(firstname);
     ln.sendKeys(lastname);
     ph.sendKeys(phone);
     eml.sendKeys(email);
	 
 }
 public void mailingInformation(String address,String city,String state,String postalcode, String country )
 {
	 add.sendKeys(address);
     cty.sendKeys(city);
     State.sendKeys(state);
     Postalcode.sendKeys(postalcode);
     Select sel= new Select(Country);
     sel.selectByVisibleText(country);
 }
 public void userInformation(String username,String pwd,String confirmpwd)
 {
	 Username.sendKeys(username);
     Pwd.sendKeys(pwd);
     Confirmpwd.sendKeys(confirmpwd);
 }
 public void clickonsubmitbutton()
 {
	 submit.click();
 }
 
 public void registrationSuccessful()
 {
	 boolean ar=afterregister.isDisplayed();
	 try
		{
		Assert.assertTrue(ar);
		Reporter.log("Registration successful",true);
		}
		catch(Exception e)
		{
			Reporter.log("Registration not successful",true);
			Assert.fail();
		}
	 
	  }
	 
	 
	 
 }
 
 

