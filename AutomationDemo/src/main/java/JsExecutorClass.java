import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.JsUtilities;

public class JsExecutorClass {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.drive","C:\\Users\\admin\\Downloads\\chromedriver_win32.zip");
	      WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	    driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
    
	   //drawing border
	    WebElement border=driver.findElement(By.xpath("//img[@alt='logo']"));
	    JsUtilities.drawBorder1(border, driver);
	    
	    //Screenshot
	    TakesScreenshot ts=(TakesScreenshot)driver;
	    File src=ts.getScreenshotAs(OutputType.FILE);
	    File des=new File(".\\screenshot\\logo.png");
	    FileUtils.copyFile(src,des);
	    
	    //Title
	    JsUtilities.getTitle(driver);
	    Thread.sleep(2000);
	    //Scroll Down
	    JsUtilities.scrolldown(driver);
	    //Scroll Up
	    Thread.sleep(2000);
	    JsUtilities.scrollup(driver);
	    //Zoom
	    JsUtilities.zoom(driver);
	    
	    
	    
	    

	}

}
