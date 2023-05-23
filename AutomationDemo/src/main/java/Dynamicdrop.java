import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicdrop 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.drive","E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/jquery-select.php");
		/*WebElement dropSearch=driver.findElement(By.xpath("(//span[@class='select2-selection select2-selection--single'])[1]"));
		dropSearch.click();
		WebElement dropSelect=driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		dropSelect.sendKeys("Washington");
		WebElement dropValue=driver.findElement(By.xpath("//li[@class='select2-results_option select2-resultsoption--selectable select2-results_option--highlighted']"));
		dropValue.click();*/
		//Multiple option
		/*WebElement dropMulSearch=driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--multiple']"));
		dropMulSearch.click();
		WebElement dropMulValue=driver.findElement(By.xpath("//textarea[@class='select2-search__field']"));
		dropMulValue.sendKeys("Oregon");
		WebElement dropMulSelect=driver.findElement(By.xpath("//li[@id='select2-states-xt-result-0x5v-OR']"));
		dropMulSelect.click();
		WebElement dropMuldum=driver.findElement(By.xpath("//span[@class='select2-selection__rendered']"));
		dropMuldum.click();*/
		/*----------------------Multiple value 2nd-----------------------------*/
		/*WebElement dropMulSearch=driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--multiple']"));
		dropMulSearch.sendKeys("Oregon");
        
        WebElement demo=driver.findElement(By.xpath("//ul[@class='select2-results__options']"));
		demo.click();
		WebElement dropMulValue2=driver.findElement(By.xpath("//textarea[@class='select2-search__field']"));
		dropMulValue2.sendKeys("Nevada");
		WebElement demo2=driver.findElement(By.xpath("//ul[@class='select2-results__options']"));
		demo2.click();
		WebElement dropMulValue3=driver.findElement(By.xpath("//textarea[@class='select2-search__field']"));
		dropMulValue3.sendKeys("Was");
		WebElement demo3=driver.findElement(By.xpath("//ul[@class='select2-results__options']"));
        demo3.click();*/
		/*----------------------Dynamic value 3rd-----------------------------*/
		WebElement dropSearch=driver.findElement(By.xpath("(//span[@class='select2-selection select2-selection--single'])[2]"));
		dropSearch.click();
		WebElement dropValEnter=driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		dropValEnter.sendKeys("Nevada");
		WebElement dropValSelect=driver.findElement(By.xpath("//li[@class='select2-results_option select2-resultsoption--selectable select2-results_option--highlighted']"));
		dropValSelect.click();
	}

}
