package myPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectWebElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32//chromedriver.exe");
       
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		
		WebElement searchStore=driver.findElement(By.xpath("(//input[@id='small-searchterms'])[1]"));
		System.out.println("Search status :"+searchStore.isDisplayed());
		System.out.println("is selected :" +searchStore.isSelected());
		System.out.println("is enabled :"+searchStore.isEnabled());
		
		WebElement male=driver.findElement(By.xpath("(//label[normalize-space()='Male'])[1]"));
		WebElement female=driver.findElement(By.xpath("(//label[normalize-space()='Female'])[1]"));
		
		System.out.println(male.isSelected());
		System.out.println(female.isSelected());
		
		male.click();
		
		System.out.println(male.isSelected());
		System.out.println(female.isSelected());
		
		female.click();
		System.out.println(male.isSelected());
		System.out.println(female.isSelected());
		
		
		
	}

}
