package myPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\admin\\\\Downloads\\\\chromedriver_win32//chromedriver.exe");

		//WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		
		//driver.findElement(By.xpath("//a[@class='btn btn-black navbar-btn']")).click();
		//driver.switchTo().frame("form action");
		//Thread.sleep(10000);
		WebElement drpcountryele=driver.findElement(By.name("country_id"));
		
		Select drpcountry=new Select(drpcountryele);
		
		//drpcountry.selectByVisibleText("Denmark");
		//drpcountry.selectByValue("10");
		//drpcountry.selectByIndex(13);
		
		// selecting option from dropdown without using select methods
		
		List<WebElement> alloptions=drpcountry.getOptions();
		for(WebElement option:alloptions)
		{
			if(option.getText().equals("Cuba"))
			{
				option.click();
				break;
			}
		}
		
	}

}
