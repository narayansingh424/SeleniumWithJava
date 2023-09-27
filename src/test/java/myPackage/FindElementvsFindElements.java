package myPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementvsFindElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		
		//WebElement searchbox=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		//searchbox.sendKeys("XYZ");
		/*
		WebElement ele=driver.findElement(By.xpath("//div[@class='footer-block customer-service']//li[2]//a"));
		System.out.println(ele.getSize());
		System.out.println(ele.getText());
		
		List<WebElement> links=driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
		System.out.println(links.size());
		
		for(WebElement eles:links) {
		System.out.println(eles.getText());
		}
		*/
		
		//System.out.println(searchbox.getAttribute("class"));
		//System.out.println(searchbox.getText());
		
		//for login button
		WebElement ln=driver.findElement(By.xpath("//button[normalize-space()='Log in']"));
		System.out.println(ln.getAttribute("class"));
		System.out.println(ln.getText());
		
	}

}
