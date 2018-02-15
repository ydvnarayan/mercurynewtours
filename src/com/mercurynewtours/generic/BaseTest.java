package com.mercurynewtours.generic;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements AutoConstant
{
	public static WebDriver driver;
	@BeforeMethod
	public void preCondition() 
	{
		System.out.println("Enter brwoser name ");
		Scanner scan=new Scanner(System.in);
		String browser =scan.nextLine();
		if(browser.equalsIgnoreCase("chrome"))
		{
		System.setProperty(chrome_key,chrome_value);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com");
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty(gecko_key,gecko_value);
			driver=new FirefoxDriver();	
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get("http://newtours.demoaut.com");
		}
	}

	
	//@AfterMethod
	//public void postCondition()
	//{
	//	driver.close();
	//}
	
}
