package com.nop.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DashboardPage 
{
	
	@FindBy (xpath="(//img[@alt='logo.png'])[2]") WebElement logo;
	
	public DashboardPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void logovalidation()
	{
		
		boolean expResult = true;
		boolean actResult = logo.isDisplayed();
		Assert.assertEquals(expResult, actResult, "logo is not displayed");
		
	}

	
	
}
