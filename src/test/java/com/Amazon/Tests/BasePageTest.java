package com.Amazon.Tests;

import java.io.FileNotFoundException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Amazon.Generics.BaseTest;
import com.Amazon.Generics.GenericUtils;
import com.Amazon.Pages.OnlineShoppingSiteInIndiaPage;

public class BasePageTest extends BaseTest
{
	
	@Test
	public void basePageTest() throws FileNotFoundException
	{
		OnlineShoppingSiteInIndiaPage onlineshop=new OnlineShoppingSiteInIndiaPage(driver);
		onlineshop.verifyTitle(GenericUtils.excelData(file_path, "Sheet1", 1, 0));
		onlineshop.getLinks();
		
		
	}

}
