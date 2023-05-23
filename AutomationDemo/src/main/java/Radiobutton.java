import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.drive","C:\\Users\\admin\\Downloads\\chromedriver_win32.zip");
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://selenium.obsqurazone.com/radio-button-demo.php");
	      
	      WebElement radioButton=driver.findElement(By.xpath("//input[@class='form-check-input' and @value='Female']"));
	      radioButton.click();
	      WebElement button=driver.findElement(By.xpath("//button[text()='Show Selected Value']"));
	      button.click();
	      
	      WebElement gender=driver.findElement(By.xpath("//input[@type='radio' and @id='inlineRadio21']"));
	       gender.click();
	       WebElement age=driver.findElement(By.xpath("//input[@type='radio' and @id='inlineRadio23']"));
	        age.click();
	       WebElement button2=driver.findElement(By.xpath("//button[@type='button' and @id='button-two']"));
	        button2.click();
	}

}
