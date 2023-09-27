package myPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootstrapDropDown {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		
		// product type
		driver.findElement(By.xpath("//div[@class='drp1']//div[@class='dropdown']")).click();
		List<WebElement> productTypes=driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
		
		System.out.println("Number of options "+productTypes.size());
		
		for(WebElement ptype:productTypes)
		{
			if(ptype.getText().equals("Accounts"))
			{
				ptype.click();
			    break;
			}
		}
		// product select
		driver.findElement(By.xpath("//div[@class='drp2']//div[@class='dropdown']")).click();
		List<WebElement> sproduct=driver.findElements(By.xpath("//div[@class='dropdown open']//ul[@class='dropdown2 dropdown-menu']/li"));
		System.out.println("number of product ele :"+sproduct.size());
		selectOptionFromDropDown(sproduct,"Current Accounts");
		
		/*for(WebElement product:sproduct)
		{
			if(product.getText().equals("Current Accounts"))
			{
				product.click();
				break;
			}
		}*/
	}
	
	public static void selectOptionFromDropDown(List<WebElement> options, String value)
	{
		for(WebElement option:options)
		{
			if(option.getText().equals(value))
			{
				option.click();
				break;
			}
		}
	}

}
