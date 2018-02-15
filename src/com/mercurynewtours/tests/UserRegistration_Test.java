package com.mercurynewtours.tests;

import org.testng.annotations.Test;

import com.mercurynewtours.generic.AutoConstant;
import com.mercurynewtours.generic.BaseTest;
import com.mercurynewtours.generic.ExcelData;
import com.mercurynewtours.page.register_page;

public class UserRegistration_Test extends BaseTest{
	@Test
	public void userRegistration()
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
		register_page rp=new register_page(driver);
		rp.clickonregister();
		rp.enterfirstname(firstname);
		rp.enterlastname(lastname);
		rp.enterphoneno(phone);
		rp.enteremail(email);
		rp.enteraddress(address);
		rp.entercity(city);
		rp.enterstate(state);
		rp.enterpostalcode(postalcode);
        rp.enterusername(username);
		rp.enterpassword(pwd);
		rp.enterpassword(confirmpwd);
		rp.clickonsubmitbutton();
		
		
		
		
		
		
		
		
	}
}
