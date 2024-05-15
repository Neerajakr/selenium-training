package com.allianz.tabs;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
	
	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://db4free.net");
		
		//click on phpMyAdmin »
		//b[contains(text(),'phpMyAdmin')]
		driver.findElement(By.partialLinkText("phpMyAdmin")).click();
		
		ArrayList<String> windows=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windows.get(1));
		
		driver.findElement(By.id("input_username")).sendKeys("admin");
		//enter password admin1233
		//click on login
		
		driver.close(); //check - what is happening?
		
		driver.switchTo().window(windows.get(0));

		System.out.println(driver.getTitle());
		
	}

}