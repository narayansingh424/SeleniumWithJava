package myPackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureScreenShot {

	public static void main(String[] args) throws IOException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.nopcommerce.com/");
	driver.manage().window().maximize();
	//full page screenshot
	/*
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File trg=new File(".\\screenshots\\homepage.png");
	FileUtils.copyFile(src, trg);
	*/
	
	// specific screenshot
	
	WebElement section=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']//div[@class='title']"));
	File src=section.getScreenshotAs(OutputType.FILE);
	File trg=new File(".\\screenshots\\features.png");
	FileUtils.copyFile(src, trg);
	
	
	
	
	
	}

}
