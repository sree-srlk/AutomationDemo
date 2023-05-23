import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.drive","C:\\Users\\admin\\Downloads\\chromedriver_win32.zip");
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
	      
	      WebElement checkBox=driver.findElement(By.xpath("//input[@type='checkbox' and @id='gridCheck']"));
	        checkBox.click();
	      WebElement text=driver.findElement(By.id("message-one"));
	       System.out.println(text.getText());
	        
	      WebElement checkBoxOne=driver.findElement(By.xpath("//input[@type='checkbox' and @id='check-box-one']"));
	         checkBoxOne.click();
		  WebElement checkBoxFour=driver.findElement(By.xpath("//input[@type='checkbox' and @id='check-box-four']"));  
	         checkBoxFour.click();
	      WebElement button=driver.findElement(By.xpath("//input[@value='Select All']"));
	         button.click();
	         button.click();
	}
	

}
