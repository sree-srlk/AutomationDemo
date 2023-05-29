package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import logincode.Commoncode;

public class Suppliers
{
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.drive","C:\\Users\\admin\\Downloads\\chromedriver_win32.zip");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://qalegend.com/billing/public/home");
	Commoncode.login(driver);
	
	WebElement cont=driver.findElement(By.xpath("//a[@id='tour_step4_menu']"));
	cont.click();
	WebElement supl=driver.findElement(By.xpath("//a[text()=' Suppliers']"));
	supl.click();
	//no: of visible pages
	  List<WebElement> a=driver.findElements(By.xpath("//li[@class='paginate_button ']"));
	  System.out.println(a.size());
	  
	  //to find no of data
	   /* WebElement data=driver.findElement(By.xpath("//div[@id='contact_table_info']"));
	    System.out.println(data.getText());*/
	    //or 
	    String data=driver.findElement(By.xpath("//div[@id='contact_table_info']")).getText();
	    System.out.println(data);
	    // to get 1045 from the text; +2, 1 for space and 1 for 1 of 1045; -1 to get 5, 1 for space aftr 5
	    String t=data.substring(data.indexOf("f") + 2, data.indexOf("e") - 1);
	    //to remove special character
	    String num=t.replaceAll(",", "");
	    System.out.println("No: of data: "+num);
	    for(int i=1; i<=5; i++) {
	    	WebElement activePages=driver.findElement(By.xpath("//li[@class='paginate_button active']/a"));
	    	System.out.println("Active page:"+activePages.getText());
	    	Thread.sleep(2000);
	    	int rows=driver.findElements(By.xpath("//table[@id='contact_table']/tbody/tr")).size();
	    	System.out.println("Rows:"+rows);
	    	//to go for next page
	    	//converting integer value to string bcoz xpath didn't take integer values and to go to next page i+1 given
	    	String pageno=Integer.toString(i + 1);
	    	Thread.sleep(2000);
	    	//at this we are in page 1 so we have to take xpath of 2 from 1
	    	WebElement nextPage=driver.findElement(By.xpath("//li[@class='paginate_button ']//a[text()='"+ pageno +"']"));
	    	nextPage.click();
	}
	}
}
