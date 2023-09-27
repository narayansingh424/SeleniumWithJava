package myPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkDropdownSorted {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://twoplugs.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[normalize-space()='Live Posting']")).click();
		
		WebElement drpelement=driver.findElement(By.name("category_id"));
		Select drpselect=new Select(drpelement);
		List<WebElement> options=drpselect.getOptions();
		
		ArrayList orginallist=new ArrayList();
		ArrayList templist=new ArrayList();
		
		for(WebElement option:options)
		{
			orginallist.add(option.getText());
			templist.add(option.getText());
		}
		System.out.println("orginal list :"+orginallist);
		System.out.println("temp list :"+templist);
		
		Collections.sort(templist);
		
		System.out.println("orginal list :"+orginallist);
		System.out.println("temp list after sorting :"+templist);
		
		if(orginallist.equals(templist))
		{
			System.out.println("dropdown Sorted list");
		}
		else
		{
			System.out.println("dropdown unsorted list");
		}
		
		driver.close();

	}

}
