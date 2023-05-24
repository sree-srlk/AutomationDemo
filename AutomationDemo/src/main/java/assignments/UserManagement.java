package assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import logincode.Commoncode;

public class UserManagement {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.drive","E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qalegend.com/billing/public/home");
		Commoncode.login(driver);
		
		WebElement userManage=driver.findElement(By.xpath("//span[@class='title']"));
		userManage.click();
		Thread.sleep(1000);
		WebElement user=driver.findElement(By.xpath("(//span[@class='title'])[2]"));
		user.click();
		WebElement roles=driver.findElement(By.xpath("(//span[@class='title'])[3]"));
		roles.click();
	    WebElement sales=driver.findElement(By.xpath("(//span[@class='title'])[4]"));
	    sales.click();
	}

}
