package com.qa;

import java.sql.Driver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JsUtilities 
{
   public static void drawBorder1(WebElement element , WebDriver driver)
   {
	   JavascriptExecutor js=(JavascriptExecutor)driver;
	   js.executeScript("arguments[0].style.border='3px solid red'", element);
	}
   public static void getTitle(WebDriver driver)
   {
	   JavascriptExecutor js=(JavascriptExecutor)driver;
	   String title=js.executeScript("return document.title").toString();
	   System.out.println(title);
   }
   public static void scrolldown(WebDriver driver)
   {
	   JavascriptExecutor js=(JavascriptExecutor)driver;
	   js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
   public static void scrollup(WebDriver driver)
   {
	   JavascriptExecutor js=(JavascriptExecutor)driver;
	   js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
   }
   public static void zoom(WebDriver driver)
   {
	   JavascriptExecutor js=(JavascriptExecutor)driver;
	   js.executeScript("document.body.style.zooom='50%'");  
   }
}	
