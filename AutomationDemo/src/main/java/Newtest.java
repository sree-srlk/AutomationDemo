import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newtest 
{

	public static void main(String[] args) 
	{
	
	     System.setProperty("webdriver.chrome.drive","C:\\Users\\admin\\Downloads\\chromedriver_win32.zip");
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
	    /*  WebElement simpleFormLink=driver.findElement(By.linkText("Simple Form Demo"));
	      simpleFormLink.click();
	      System.out.println("clicked");
	      
	      WebElement checkBoxLink=driver.findElement(By.linkText("Checkbox Demo"));
	      checkBoxLink.click();
	      System.out.println("clicked");
	      
	      WebElement radioButtonsLink=driver.findElement(By.partialLinkText("Radio"));
	      radioButtonsLink.click();
	      System.out.println("clicked"); */
	      
	     /* driver.navigate().to("https://artoftesting.com/samplesiteforselenium#");
	      WebElement name=driver.findElement(By.name("firstName"));
	      name.sendKeys("HAIII"); */
	      
	    
	      
	      WebElement messageCss=driver.findElement(By.cssSelector("input.form-control"));
	       messageCss.sendKeys("HAIII");
	      WebElement idButtonCss=driver.findElement(By.cssSelector("button#button-one"));
	       idButtonCss.click();
	}

}
