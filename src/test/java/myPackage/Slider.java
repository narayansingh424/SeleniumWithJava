package myPackage;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Slider {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		WebElement minslider=driver.findElement(By.xpath("//span[1]"));
       System.out.println(minslider.getSize());
       System.out.println(minslider.getLocation());
       
       Actions act=new Actions(driver);
       
       act.dragAndDropBy(minslider, 100, 0).perform();
       System.out.println(minslider.getLocation());
       
       WebElement maxslider=driver.findElement(By.xpath("//span[2]"));
       act.dragAndDropBy(maxslider, -100, 0).perform();
       System.out.println(maxslider.getLocation());
       
       /*
        act.moveToElement(maxslider).perform(); // used mouse hover function
        
        Action action=act.moveToElement().build(); // to create action class instance
         action.perform();
        
        */
	}

}
