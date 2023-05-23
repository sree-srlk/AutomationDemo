package logincode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Commoncode 
{

	public static void login(WebDriver driver) throws InterruptedException
	
	{
		driver.get("https://qalegend.com/billing/public/login");
		WebElement name=driver.findElement(By.xpath("//input[@name='username']"));
		name.sendKeys("admin");
		WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys("123456");
		WebElement button=driver.findElement(By.xpath("//button[@type='submit']"));
		button.click();
		Thread.sleep(1000);
		WebElement endtour=driver.findElement(By.xpath("//button[@class='btn btn-default btn-sm']"));
		endtour.click();
		

	}

}
