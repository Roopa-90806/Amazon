package com.Amazon.Pages;

import java.awt.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Amazon.Generics.BasePage;

public class OnlineShoppingSiteInIndiaPage extends BasePage
{

	@FindBy(xpath="//div[@id=\"nav-xshop-container\"]//a")
	private java.util.List<WebElement> allinks;
	
	public OnlineShoppingSiteInIndiaPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	
	public void getLinks()
	{
		int count=allinks.size();
		System.out.println(count);
	}
	

}
