package myPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleLinks {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.linkText("Today's Deals")).click();
		//driver.findElement(By.partialLinkText("Deals")).click();
		
		//how catch all link
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("all Links:"+links.size());
		
		for(int i=0;i<=links.size();i++)
		{
			System.out.println(links.get(i).getText());
			System.out.println(links.get(i).getAttribute("href"));
		}

	}

}
