package com.mercurynewtours.tests;

import org.testng.annotations.Test;

import com.mercurynewtours.generic.BaseTest;
import com.mercurynewtours.generic.ExcelData;
import com.mercurynewtours.page.Register_Page;


public class UserRegistration_Test extends BaseTest{
	@Test(priority=0)
	public void userRegistration() throws InterruptedException
	{
		String firstname = ExcelData.getData(path,"register",1,1);
		String  lastname= ExcelData.getData(path,"register",1,2);
		String  phone= ExcelData.getData(path,"register",1,3);
		String  email= ExcelData.getData(path,"register",1,4);
		String  address= ExcelData.getData(path,"register",1,5);
		String city = ExcelData.getData(path,"register",1,6);
		String  state= ExcelData.getData(path,"register",1,7);
		String  postalcode= ExcelData.getData(path,"register",1,8);
		String  country= ExcelData.getData(path,"register",1,9);
		String  username= ExcelData.getData(path,"register",1,10);
		String  pwd= ExcelData.getData(path,"register",1,11);
		String  confirmpwd= ExcelData.getData(path,"register",1,12);
		
		Register_Page rp=new Register_Page(driver);
		rp.contactInformation(firstname, lastname, phone, email);
		rp.mailingInformation(address, city, state, postalcode, country);
		rp.userInformation(username, pwd, confirmpwd);
		rp.clickonsubmitbutton();
		Thread.sleep(6000);
		rp.registrationSuccessful();
		
		
	
	}
}
