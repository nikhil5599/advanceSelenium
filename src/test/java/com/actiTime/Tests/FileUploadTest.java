package com.actiTime.Tests;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.actiTime.Generic.BaseTest;
import com.google.common.io.Files;

public class FileUploadTest extends BaseTest
{
	@Test
	public void Popup() throws InterruptedException, AWTException, IOException
	{
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.get("https://demo.actiTime.com/login.do");	
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath( "//div[.='Login ']")).click();
		
		//driver.findElement(By.className("popup_menu_button popup_menu_button_support")).click();
		//driver.findElement(By.xpath( "//div[.='menu_icon']")).click();
		//driver.findElement(By.className("item_link")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='popup_menu_icon'])[3]")).click();
		driver.findElement(By.xpath("//a[text()='Contact actiTIME Support']")).click();
		driver.findElement(By.xpath("//div[@class='icon dz-clickable']")).click();
		
		Thread.sleep(5000);
		
		//gettakeScreenShot(driver);
		
	
//}

	//private static void gettakeScreenShot(WebDriver driver) 
	//{
		//try
		//{
			//File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			//Files.copy(src, new File("./src/main/resources/Screenshot"+System.currentTimeMillis()+".png"));
		//}
		//catch (Exception e)
		//{
			//
		//}
	//}
		
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rect = new Rectangle(d);
		Robot r = new Robot();
		BufferedImage img = r.createScreenCapture(rect);
		ImageIO.write(img, "png", new File("./src/main/resources/Screenshot"+System.currentTimeMillis()+".png"));
		Thread.sleep(3000);
		//driver.close();
		}
}