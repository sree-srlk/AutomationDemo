package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import logincode.Commoncode;

public class Contacts 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.drive","C:\\Users\\admin\\Downloads\\chromedriver_win32.zip");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qalegend.com/billing/public/home");
		Commoncode.login(driver);
		
		WebElement cont=driver.findElement(By.xpath("//a[@id='tour_step4_menu']"));
		cont.click();
		WebElement supl=driver.findElement(By.xpath("//a[text()=' Suppliers']"));
		supl.click();
	    WebElement custo=driver.findElement(By.xpath("//a[text()=' Customers']"));
	    custo.click();
	    WebElement custoG=driver.findElement(By.xpath("//a[text()=' Customer Groups']"));
	    custoG.click();
	    WebElement impcon=driver.findElement(By.xpath("//a[text()=' Import Contacts']"));
	    impcon.click();
	
	}

}
