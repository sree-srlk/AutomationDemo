import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.drive","C:\\Users\\admin\\Downloads\\chromedriver_win32.zip");
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://selenium.obsqurazone.com/select-input.php");
	      
	      WebElement dropDownStatic=driver.findElement(By.xpath("//select[@id='single-input-field']"));
	      Select obj=new Select(dropDownStatic);
	      obj.selectByIndex(2);
	      obj.selectByValue("Green");
	      obj.selectByVisibleText("Red");
	      
	      WebElement firstoption=obj.getFirstSelectedOption();
	       System.out.println(firstoption.getText());
	       
	      List<WebElement> allOption=obj.getOptions();
	       for(int i=1;i<allOption.size();i++)
	       {
	    	  String optionText=allOption.get(i).getText();
	    	  System.out.println(optionText);
	       }
	       
	      
	}
	
	}


