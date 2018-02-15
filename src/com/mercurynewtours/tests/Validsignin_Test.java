package com.mercurynewtours.tests;

import org.testng.annotations.Test;

import com.mercurynewtours.generic.BaseTest;
import com.mercurynewtours.generic.ExcelData;
import com.mercurynewtours.page.signon_page;

public class Validsignin_Test extends BaseTest{
	@Test
	public void userRegistration()
	{
		String username = ExcelData.getData(path,"signin",1,1);
		
		String  password= ExcelData.getData(path,"signin",1,2);
		 signon_page vs= new signon_page(driver);
		 vs.clickonsignon();
		 vs.username(username);
		 vs.password(password);
		 vs.clickonsubmit();
		 vs.flightdetailsectiondisplayed();
		 
		
		
	}
}
