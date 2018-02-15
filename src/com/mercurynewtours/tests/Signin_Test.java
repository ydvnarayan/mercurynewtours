package com.mercurynewtours.tests;

import org.testng.annotations.Test;

import com.mercurynewtours.generic.BaseTest;
import com.mercurynewtours.generic.ExcelData;
import com.mercurynewtours.page.Signon_Page;

public class Signin_Test extends BaseTest{
	@Test(priority=1)
	public void signIn() throws InterruptedException
	{
		String username = ExcelData.getData(path,"signin",1,1);
		
		String  password= ExcelData.getData(path,"signin",1,2);
		 Signon_Page vs= new Signon_Page(driver);
		 vs.clickonsignon();
		 vs.username(username);
		 vs.password(password);
		 vs.clickonsubmit();
		 Thread.sleep(6000);
		 vs.flightdetailsectiondisplayed();
		 
		
		
	}
} 
