package com.nop.TestCases;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.nop.PageObjects.DashboardPage;
import com.nop.PageObjects.LoginPage;
import com.nop.baseclass.BaseClass;
import com.nop.utility.utility;

public class TC_LoginTest_001 extends BaseClass
{
	
	protected LoginPage lp;
	

	@BeforeClass
	public void launch()
	{
		setup();
		lp = new LoginPage(driver);		
	}

	@Test(priority = 1)
	public void logvalidation() throws IOException, InterruptedException
	{
		driver.get(utility.readconfig("url"));
		lp.enterusername();
		Thread.sleep(2000);
		lp.enterpassword();
		Thread.sleep(2000);
		lp.clickloginbtn();
		Thread.sleep(2000);
	}
	
	@Test (priority = 2)
	public void logoverification()
	{
		DashboardPage dash = new DashboardPage(driver);
		dash.logovalidation();
		
	}
	
	
	

}
