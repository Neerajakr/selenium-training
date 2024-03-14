package com.allianz.basics;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo1LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ChromeDriver driver =new ChromeDriver();
		
	   WebDriver driver =new ChromeDriver();
	   driver.quit();
	   
	   driver = new EdgeDriver();
	   driver.get("https://www.facebook.com/");
	   
	   String actualTitle =driver.getTitle();
	   System.out.println("Title: "+actualTitle);
	   
	   String currentURL =driver.getCurrentUrl();
	   System.out.println("Current URL: "+currentURL);
	   
	   String pageSource =driver.getPageSource();
	   System.out.println("Page Source: "+pageSource);
	   
	   driver.quit();

	}

}
