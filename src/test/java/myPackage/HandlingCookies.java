package myPackage;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingCookies {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		 // how capture cookies from browser
		Set<Cookie> cookies=driver.manage().getCookies();
		System.out.println("Size of cookies :"+ cookies.size());
		//how to print cookies from browser
		for(Cookie cookie:cookies)
		{
			System.out.println(cookie.getName()+" : "+cookie.getValue());
		}
		
		//how to add cookies to the browser
		Cookie cookieobj=new Cookie("Mycookies123", "12345");
		driver.manage().addCookie(cookieobj);
		
		 cookies=driver.manage().getCookies();
		System.out.println("Size of After adding cookies :"+ cookies.size());//6
		
		//delete cookies 
		//driver.manage().deleteCookie(cookieobj);
		driver.manage().deleteCookieNamed("Mycookies123");
		cookies=driver.manage().getCookies();
		System.out.println("Size of After deleting cookies :"+ cookies.size());//5
		
		//delete all cookies
		driver.manage().deleteAllCookies();
		cookies=driver.manage().getCookies();
		System.out.println("Size of After delete all cookies :"+ cookies.size());//0
		
			

	}

}
