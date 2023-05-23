

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test1 
{

	public static void main(String[] args) 
	{
		//RemoteWebDriver.chrome.driver
	  // ChromeDriver driver=new ChromeDriver();
    // WebDriver driver=new ChromeDriver();
     System.setProperty("webdriver.chrome.drive","C:\\Users\\admin\\Downloads\\chromedriver_win32.zip");
      WebDriver driver=new ChromeDriver();
      
      driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
      System.out.println(driver.getTitle());
      System.out.println(driver.getCurrentUrl());
     // System.out.println(driver.getPageSource());
     // driver.close();
     //  driver.quit();
      
     /* //navigate commands
      driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
      driver.navigate().back();
      driver.navigate().forward();
      driver.navigate().refresh(); */
      
     //  LOCATOR are: id,Xpath,CSS,SELECTOR,NAME,TAG NAME,LINKEXIT,PARTIAL LINK TEXT
      // driver.findElement(By.id("single-input-field")).sendKeys("HAI");
      // sendKeys used for pass text
     // WebElement message=driver.findElement(By.id("single-input-field"));
     // message.sendKeys("HELLO");
      
     /* WebElement message=driver.findElement(By.className("form-control"));
      message.sendKeys("yah!!!");
      WebElement button=driver.findElement(By.id("button-one"));
      button.click(); */
      
      WebElement button=driver.findElement(By.className("btn-primary"));
	  button.sendKeys("yah!!!");
      WebElement value_a=driver.findElement(By.className("form-control"));
       value_a.sendKeys("2");
      WebElement value_b=driver.findElement(By.className("form-control"));
      value_b.sendKeys("4");
      
     // WebElement button=driver.findElement(By.id("button-two"));
     // button.click();
      
	}

}
