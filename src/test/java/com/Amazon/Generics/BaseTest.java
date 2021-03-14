package com.Amazon.Generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest 
{
	public WebDriver driver;
	protected String file_path="E:\\PracticeSession\\com.Amazon\\Data\\Datainput.xlsx";
	
	@BeforeMethod
	public void preCondition()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		
	}
	
	@AfterMethod
	public void postCondition(ITestResult result)
	{
		int status=result.getStatus();
		if(status==2)
		{
			GenericUtils.takeScreenshot(driver, result.getName());
		}
		driver.close();
	}

}
