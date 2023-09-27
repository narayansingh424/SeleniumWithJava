package myPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolTip {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		
		WebElement inputbox=driver.findElement(By.xpath(""));
		String tooltiptext=inputbox.getAttribute("title");
		System.out.println(tooltiptext);
		
		//how to open new tab
		driver.get("");
		String tab=Keys.chord(Keys.CONTROL, Keys.RETURN);
		driver.findElement(By.linkText("Register")).sendKeys(tab);
		
		

	}

}
