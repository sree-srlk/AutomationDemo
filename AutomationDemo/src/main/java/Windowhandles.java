import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandles {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.drive","C:\\Users\\admin\\Downloads\\chromedriver_win32.zip");
	      WebDriver driver=new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
      
	    driver.manage().window().maximize();
	    Thread.sleep(1000);
	    
	   WebElement childWindowId=driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")); 
	   Thread.sleep(1000);
	   childWindowId.click();
	   
	   Set<String>windowids=driver.getWindowHandles();
	   List<String> windwidlist=new ArrayList(windowids);
	   
	   String parentid=windwidlist.get(0);
	   String childid=windwidlist.get(1);
	   
       System.out.println("parent="+parentid+ " and child="+childid);
       driver.switchTo().window(childid);
       WebElement textArea=driver.findElement(By.xpath("//input[@type='email']"));
	   textArea.sendKeys("ki@gmail.com");
	   driver.close();
	   driver.quit();
	   
	}

}
