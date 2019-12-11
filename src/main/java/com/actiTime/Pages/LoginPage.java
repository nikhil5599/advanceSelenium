package com.actiTime.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actiTime.Generic.BasePage;

public class LoginPage extends BasePage
{
	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	//Declaration
	@FindBy(id ="username")
	private WebElement unTb;
	
	@FindBy(name ="pwd")
	private WebElement pwTb;
	
	@FindBy(xpath = "//div[.='Login ']")
	private WebElement logInBtn;
	
	@FindBy(xpath ="//span[contains(.,'Username or Password')]")
	private WebElement errMsg;
	
	@FindBy(xpath ="//nobr[contains(.,'actiTIME 2020.1 Pro')]")
	private WebElement version;
	
	

	//Utilization
	public void verifyPageTitle(String eTitle)
	{
		verifyTitle(eTitle);
	}
	
	public void enterUserName(String un)
	{
		unTb.sendKeys(un);
	}
	
	public void enterPassword(String pw)
	{
		pwTb.sendKeys(pw);
	}
	
	public void clickOnLogin()
	{
		logInBtn.click();
	}
	
	public String verifyErrorMsg()
	{
		verifyElemnet(errMsg);
		String aErrorMsg = errMsg.getText();
		return aErrorMsg;
	}
	
	public String verifyVersion()
	{
		verifyElemnet(version);
		String aVersion = version.getText();
		return aVersion;
	}
}
