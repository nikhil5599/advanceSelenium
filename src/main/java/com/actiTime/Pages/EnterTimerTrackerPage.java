package com.actiTime.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actiTime.Generic.BasePage;

public class EnterTimerTrackerPage extends BasePage
{
	
	public EnterTimerTrackerPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	//Declaration
	@FindBy(id ="logoutLink")
	private WebElement logoutLink;
	
	
	//Utilization
	public void clickOnLogout()
	{
		logoutLink.click();
	}
}
