import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelementcom 
{

	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.drive","C:\\Users\\admin\\Downloads\\chromedriver_win32.zip");
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
	      
	      WebElement buttoncssSelector=driver.findElement(By.xpath("//button[text()='Show Message']"));
	      
	      //is Displayed();
	          if(buttoncssSelector.isDisplayed())
	          {
	        	System.out.println("button is present");
	        	}
	          else
	          {
	        	System.out.println("button is not present");
	        	}
	       
	       // is Enabled
	            if(buttoncssSelector.isEnabled())
	             {
	            	System.out.println("button is enabled");
	             }
	             else
	              {
	            	 System.out.println("button is disabled");
	            	 }
	       // is selected
	            
	           driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
	            WebElement check=driver.findElement(By.xpath("//input[@type='checkbox' and @id='gridCheck']"));
	            if(check.isSelected())
	             {
	            	System.out.println("checked");
	            	}
	             else
	              {
	            	 System.out.println("not checked");
	            	 }
	            //summit command
	               
	            //get location
	            //
	            
	            
	}

}
