package com.mercurynewtours.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class register_page {
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
 
 public register_page(WebDriver driver)
 {
	 
	 PageFactory.initElements(driver, this);
 }
 public void clickonregister()
 {
	 register.click();
 }
 public void enterfirstname( String firstname)
 {
	 fn.sendKeys(firstname);
 }
 public void enterlastname(String lastname)
 {
	 ln.sendKeys(lastname);
 }
public void enterphoneno(String phone)
 {
	 ph.sendKeys(phone);
 }
 public void enteremail(String email)
 {
	 eml.sendKeys(email);
	 
 }
 public void enteraddress(String address)
 {
	 add.sendKeys(address);
 }
 public void entercity(String city)
 {
	 cty.sendKeys(city);
 }
 public void enterstate(String state )
 {
	 State.sendKeys(state);
 }
 public void enterpostalcode(String postalcode)
 {
	 Postalcode.sendKeys(postalcode);
 }
 public void selectcounty()
 {
	 
 }
 public void enterusername(String username)
 {
	 Username.sendKeys(username);
 }
 
 public void enterpassword(String pwd)
 {
	 Pwd.sendKeys(pwd);
 }
 public void enterconfirmpassword(String confirmpwd)
 {
	 Confirmpwd.sendKeys(confirmpwd);
 }
 public void clickonsubmitbutton()
 {
	 submit.click();
 }
 
 
 
 
 
 
 
 
 
 
 
 
}

