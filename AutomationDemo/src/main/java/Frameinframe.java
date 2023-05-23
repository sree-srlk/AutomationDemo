import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Frameinframe 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.drive","C:\\Users\\admin\\Downloads\\chromedriver_win32.zip");
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
	
	      driver.switchTo().frame("iframeResult");
	      WebElement frame1=driver.findElement(By.xpath("//h2[text()='HTML Iframes']"));
	      System.out.println(frame1.getText());
	      
	      WebElement frame2=driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));
	      driver.switchTo().frame(frame2);
	      WebElement frame2Text=driver.findElement(By.xpath("//h1[text()='This page is displayed in an iframe']"));
	      System.out.println(frame2Text.getText());
	      driver.switchTo().parentFrame(); //step into previous frame
	      System.out.println(frame1.getText());
	      
	}

}
