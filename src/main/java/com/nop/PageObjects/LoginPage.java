package com.nop.PageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nop.utility.utility;

public class LoginPage 
{
	@FindBy(id="Email") WebElement mail;
	@FindBy(id="Password") WebElement pwd;
	@FindBy(xpath="//button[@type='submit']") WebElement loginbtn;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void enterusername() throws IOException
	{
		mail.clear();
		mail.sendKeys(utility.readconfig("un"));
	}
	
	public void enterpassword() throws IOException
	{
		pwd.clear();
		pwd.sendKeys(utility.readconfig("pswd"));
	}
	
	public void clickloginbtn()
	{
		loginbtn.click();
	}
}
