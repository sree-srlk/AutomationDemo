import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Alertdemo {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.drive","C:\\Users\\admin\\Downloads\\chromedriver_win32.zip");
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
	      
	      WebElement alert1=driver.findElement(By.xpath(" //button[@id='alertBox']"));
           alert1.click();
          driver.switchTo().alert().accept(); // OK , .dismiss() for cancel
          
          WebElement text=driver.findElement(By.xpath("//div[@id='output']"));
          System.out.println(text.getText());
	    
          WebElement alert2=driver.findElement(By.xpath("//button[@id='confirmBox']"));
          alert2.click();
          driver.switchTo().alert().dismiss();
          
          WebElement text1=driver.findElement(By.xpath("//div[@id='output']"));
          System.out.println(text.getText());
          
          WebElement alert3=driver.findElement(By.xpath("//button[@id='promptBox']"));
          alert3.click();
          driver.switchTo().alert().sendKeys("hy");
          driver.switchTo().alert().accept();
         /* Alert prompt=driver.switchTo().alert();
          Thread.sleep(1000);
          prompt.sendKeys("hi");
        prompt.accept();	  
          //          alert3.sendKeys("hi");
//	      alert3.click();
//	      driver.switchTo().alert().accept();*/
	      
	      
	}

}
