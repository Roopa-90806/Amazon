package com.Amazon.Generics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class GenericUtils 
{
	public static void takeScreenshot(WebDriver driver,String name)
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		try
		{
			Files.copy(ts.getScreenshotAs(OutputType.FILE),new File("./"+name+".png"));
		}
		catch(Exception e)
		{
			
		}
	}
	
	public static String excelData(String file_path,String sheet,int row,int cell) throws FileNotFoundException
	{
		try
		{
			FileInputStream file = new FileInputStream(new File(file_path)) ;
			String data=WorkbookFactory.create(file).getSheet(sheet).getRow(row).getCell(cell).toString();
			return data;
			
		}
		catch(Exception e)
		{
			return "";
		}
		
	}

}
