import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseactions
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.drive","C:\\Users\\admin\\Downloads\\chromedriver_win32.zip");
	      WebDriver driver=new ChromeDriver();
	   /*   driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");

	     WebElement context=driver.findElement(By.xpath("//span[text()='right click me']"));
	     Actions act=new Actions(driver);
	     act.contextClick(context).perform();
	     
	    driver.navigate().to("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_ondblclick");
	    Thread.sleep(1000);
	    driver.switchTo().frame("iframeResult");
	    WebElement dubleClick=driver.findElement(By.xpath("//p[@ondblclick='myFunction()']"));
	    Actions act1=new Actions(driver);
	    act1.doubleClick(dubleClick).perform(); */
	      
	    /*  driver.navigate().to("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");   
	      WebElement rome=driver.findElement(By.xpath("//div[@id='box6']"));
	      WebElement italy=driver.findElement(By.xpath("//div[@id='box106']"));
	      Actions act2=new Actions(driver);
	       act2.dragAndDrop(rome, italy).perform(); */
	      
	      driver.navigate().to("https://demo.opencart.com/");
	      WebElement compo=driver.findElement(By.xpath("//a[text()='Components']"));
	      WebElement moni=driver.findElement(By.xpath("//a[text()='Monitors (2)']"));
	      Actions act3=new Actions(driver);
	      act3.moveToElement(compo).moveToElement(moni).click().perform();
	}

}
