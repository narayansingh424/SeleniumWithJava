package myPackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleBrowserWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//String windowId=driver.getWindowHandle();
		//System.out.println(windowId);
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		Thread.sleep(2000);
		Set<String> windowIds=driver.getWindowHandles();
		// first method to get windows id by using iterator 
		/*
		Iterator<String> it=windowIds.iterator();
		
		String parentId=it.next();
		String childId=it.next();
		
		System.out.println(parentId);
		System.out.println(childId);
		*/
		//Second method to get windows ids by using list / ArraList
		/*
		List<String> windowIdsList=new ArrayList(windowIds);
		String parentId=windowIdsList.get(0);
		String childId=windowIdsList.get(1);
		
		System.out.println(parentId);
		System.out.println(childId);
		
		driver.switchTo().window(parentId);
		System.out.println("get parent window title"+driver.getTitle());
		
		driver.switchTo().window(childId);
		System.out.println("get child window title"+driver.getTitle());
		*/
		//for each loop
		 for(String winId:windowIds)
		 {
			 String title=driver.switchTo().window(winId).getTitle();
			 System.out.println(title);
			  
		 }
		 //driver.close();
		 //driver.quit();//close all windows
		 
		 for(String winId:windowIds)
		 {
			 String title=driver.switchTo().window(winId).getTitle();
			 if(title.equals("OrangeHRM"))
			 {
				 driver.close();
				 }
			 }
			  

	}

}
