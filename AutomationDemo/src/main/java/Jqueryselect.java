import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Jqueryselect {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.drive","C:\\Users\\admin\\Downloads\\chromedriver_win32.zip");
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://selenium.obsqurazone.com/jquery-select.php");

	      WebElement dropDownSearch=driver.findElement(By.xpath("//input[@role='searchbox']"));
	       Select obj1=new Select(dropDownSearch);
	       List<WebElement> allOption1=obj1.getOptions();
	        
	}

}
