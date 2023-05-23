import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcss 
{

	public static void main(String[] args)
	{
		 System.setProperty("webdriver.chrome.drive","C:\\Users\\admin\\Downloads\\chromedriver_win32.zip");
	      WebDriver driver=new ChromeDriver();
	     // driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
	      
	     /* WebElement valueACss=driver.findElement(By.cssSelector("input#"));
		     valueACss.sendKeys("2");
		  WebElement valueBCss=driver.findElement(By.cssSelector("input.form-control")); 
		     valueBCss.sendKeys("4");
		   WebElement idButtonCss=driver.findElement(By.cssSelector("button#button-two"));
		      idButtonCss.click(); */
		      
		    /*  WebElement valueACss=driver.findElement(By.cssSelector("input[placeholder='Enter value']"));
			     valueACss.sendKeys("2");
			  WebElement valueBCss=driver.findElement(By.cssSelector("input#value-b")); 
			     valueBCss.sendKeys("4");
			   WebElement idButtonCss=driver.findElement(By.cssSelector("button#button-two"));
			      idButtonCss.click(); */
			      
		 driver.navigate().to("https://artoftesting.com/samplesiteforselenium#");
        //  WebElement locateTagName=driver.findElement(By.tagName("title"));
        //  System.out.println(locateTagName.getText());
          
            
	}

}
