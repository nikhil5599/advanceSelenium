package com.actiTime.Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage
{
	WebDriver driver;
	
	public BasePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//Verify Title
	public void verifyTitle(String eTitle)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try
		{
			wait.until(ExpectedConditions.titleIs(eTitle));
			Reporter.log("Title is matching : "+eTitle,true);
		}
		catch (Exception e)
		{
			Reporter.log("Title is not Matching.Actual  Title is :"+driver.getTitle(),true);
			Reporter.log("Expected Title is :"+eTitle,true);
			Assert.fail();		
		}
	}
	
	public void verifyElemnet(WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try
		{
			wait.until(ExpectedConditions.visibilityOf(element));
			Reporter.log("Element is displayed",true);
		}
		catch (Exception e)
		{
			Reporter.log("Element is not displayed",true);
			Assert.fail();		
		}
	}
}
	
	
	
