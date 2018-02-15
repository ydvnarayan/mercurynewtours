package com.mercurynewtours.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class findflight_page {

	@FindBy(xpath="FlighDetails")
	private WebElement FlightDetail;
	
	@FindBy(xpath="")
	private WebElement roundtrip;
	
	@FindBy(xpath="")
	private WebElement onetrip;
	
	@FindBy(xpath="")
	private WebElement passenger;
	
	@FindBy(xpath="")
	private WebElement onmonth;
	@FindBy(xpath="")
	private WebElement onday;
	@FindBy(xpath="")
	private WebElement arrivingin;
	@FindBy(xpath="")
	private WebElement returningmonth;
	
	@FindBy(xpath="")
	private WebElement returningday;
}
