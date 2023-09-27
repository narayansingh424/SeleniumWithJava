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

public class JavascriptExecutorDemo {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		// Drawing border and takes screen shot
		WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		JavaScriptUtil.drawBorder(logo, driver);
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File(".\\screenshots\\logo.png");
		FileUtils.copyFile(src, trg);
		
		//getting title of the page
		String title=JavaScriptUtil.getTitleByJS(driver);
		System.out.println("Title of the page :"+title);
		
		//click action
		WebElement regi=driver.findElement(By.xpath("//a[normalize-space()='Register']"));
		JavaScriptUtil.clickElementByJS(regi, driver);
		
		//generate alert
		//JavaScriptUtil.generateAlert(driver, "This is js alert");
		
		//refresh the page
		//JavaScriptUtil.refreshBrowserByJS(driver);
		
		//scroll down page
		JavaScriptUtil.scrollPageDown(driver);
		Thread.sleep(3000);
		//scroll up page
		JavaScriptUtil.scrollPageUp(driver);
		
		//zoom page by js
		JavaScriptUtil.zoomPageByJS(driver);
		
		//flash logo
		WebElement logo1=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		JavaScriptUtil.flash(logo1, driver);
		

	}

}
