package myPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutocompleteGooglePlacesDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://twoplugs.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[normalize-space()='Live Posting']")).click();
		WebElement searchbox=driver.findElement(By.xpath("//input[@id='autocomplete']"));
		searchbox.clear();
		searchbox.sendKeys("Delhi");
		
		String text;
		do {
			
			searchbox.sendKeys(Keys.ARROW_DOWN);
			text=searchbox.getAttribute("value");
			if(text.equals("Delhi, ON, Canada"))
			{
				searchbox.sendKeys(Keys.ENTER);
				break;
			}
			Thread.sleep(3000);
			
		}while(!text.isEmpty());
		
	}

}
