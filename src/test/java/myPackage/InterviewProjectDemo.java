package myPackage;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v86.indexeddb.model.Key;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InterviewProjectDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement searchbox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		Thread.sleep(2000);
		searchbox.sendKeys("cameara");
		Thread.sleep(2000);
		WebElement searchsubmit=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		searchsubmit.click();
		Thread.sleep(2000);
		
		List<WebElement> items=driver.findElements(By.xpath("//div[@class='sg-col-inner']"));
		System.out.println(items.size());
		Thread.sleep(2000);
		
		
		List<WebElement> itemtext=driver.findElements(By.xpath("//div//h2//span"));
		List<WebElement> pricelist=driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
		StringBuilder divtext=new StringBuilder();
		for(WebElement stringtext:itemtext)
		{
			divtext.append(stringtext.getText()).append("\n");
		}
		String filepath="D:\\output.csv";
		
		try
		{
			FileWriter writer=new FileWriter(filepath);
			writer.write(divtext.toString());
			writer.close();
			System.out.println("Text save to "+ filepath);
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		
		System.out.println(itemtext.size());
		for(WebElement item:itemtext)
		{
			for(WebElement price:pricelist)
			{
			System.out.println("item Name : "+item.getText()+"\nitem price :"+price.getText());
			break;
			}
			
		}
		
		
		/*for(int i=0;i<=5;i++)
		{ 
		
		
				
			System.out.println(itemtext.getText()+" , "+pricelist.getText());
			
			
	
	      	
		}
		*/
		
		
		
		

	}

}
