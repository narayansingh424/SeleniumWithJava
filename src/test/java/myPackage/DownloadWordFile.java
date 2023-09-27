package myPackage;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DownloadWordFile {

	public static void main(String[] args) {
		
		
		String location=System.getProperty("user.dir")+"\\downloads\\";
		//chrome
				/*
		HashMap pref=new HashMap();
		pref.put("downloads.default_directory", location);
		
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("prefs", pref);
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://file-examples.com/index.php/sample-documents-download/sample-doc-download/");
		
		driver.findElement(By.xpath("//tbody/tr[1]/td[5]/a[1]")).click();
        */
		
		//edge browser
		EdgeOptions options=new EdgeOptions();
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver(options);
		driver.get("https://file-examples.com/index.php/sample-documents-download/sample-doc-download/");
		
		driver.findElement(By.xpath("//tbody/tr[1]/td[5]/a[1]")).click();
		
		HashMap pref=new HashMap();
		pref.put("download.default_directory", location);
		
		
		options.setExperimentalOption("prefs", pref);
		
		
		
	}

}
