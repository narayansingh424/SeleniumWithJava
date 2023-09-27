package myPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleMultipleDropDown {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
	   driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/contact-sales/");
		
		/* Approach 1
		 Select countryDrp=new Select(driver.findElement(By.name("Country")));
		  countryDrp.selectByVisibleText("Aruba");
		 Select noofemployeesDrp=new Select(driver.findElement(By.name("NoOfEmployees")));
		 noofemployeesDrp.selectByVisibleText("11 - 15");
		 */
		
		// Approach 2
		WebElement countryele=driver.findElement(By.name("Country"));
		selectOptionFromDropDown(countryele,"Cuba");
		
		WebElement noofemployeesele=driver.findElement(By.name("NoOfEmployees"));
		selectOptionFromDropDown(noofemployeesele,"11 - 15");
		
		 
		 }
	
	public static void selectOptionFromDropDown(WebElement ele, String value)
	{
		Select drp=new Select(ele);
		List<WebElement> alloptions=drp.getOptions();
		for(WebElement option:alloptions)
		{
			if(option.getText().equals(value))
			{
				option.click();
				break;
			}
			
		}
	}

}
