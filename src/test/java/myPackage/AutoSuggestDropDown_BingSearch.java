package myPackage;

import java.time.Duration;
import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestDropDown_BingSearch {

	public static void main(String[] args) throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		driver.get("https://www.bing.com/");
		driver.findElement(By.xpath("//textarea[@id='sb_form_q']")).sendKeys("java ");
		Thread.sleep(6000);
		
		
		
		List<WebElement> list=driver.findElements(By.xpath("//li[@class='sa_sg as_extra_pad']//span"));
        System.out.println("size of autosuggest "+list.size());
        
        for(WebElement item:list)
        {
        	if(item.getText().contains("download"))
        	{
        		item.click();
        		break;
        	}
        }
	}

}
