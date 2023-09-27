package myPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32//chromedriver.exe");
        // ChromeDriver driver=new ChromeDriver();
        
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.opencart.com/");
        
        System.out.println("Title of the page :"+driver.getTitle());
        System.out.println("Get current URL of the page :"+driver.getCurrentUrl());
        //System.out.println("get pagesource :"+driver.getPageSource());
        //Thread.sleep(2000);
       // driver.quit();
        
        // useing WebDriverManager 
		
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver=new ChromeDriver();
        //driver.get("https://www.opencart.com/");
		
	}

}
