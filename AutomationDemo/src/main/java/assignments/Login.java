package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import logincode.Commoncode;

public class Login 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.drive","C:\\Users\\admin\\Downloads\\chromedriver_win32.zip");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qalegend.com/billing/public/login");
		Commoncode.login(driver);
		
//		WebElement name=driver.findElement(By.xpath("//input[@name='username']"));
//		name.sendKeys("admin");
//		WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));
//		pass.sendKeys("123456");
//		WebElement button=driver.findElement(By.xpath("//button[@type='submit']"));
//		button.click();
//		WebElement endtour=driver.findElement(By.xpath("//button[@class='btn btn-default btn-sm']"));
//		endtour.click();
//		Thread.sleep(5000);

	}

}
