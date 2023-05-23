import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandling {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.drive","C:\\Users\\admin\\Downloads\\chromedriver_win32.zip");
	      WebDriver driver=new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
	    driver.manage().window().maximize();
	    Thread.sleep(1000);
	    String parentWindow=driver.getWindowHandle();
	    
	    System.out.println(parentWindow);
	    
	  // String s=driver.getWindowHandle();
	  // Iterator<String> it=s.iterator();
	}

}
