package com.allianz.assignments;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3Meddibuddy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.medibuddy.in/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// driver.findElement(By.xpath("//a[contains(@href,'javascript:void(0)')]")).click();
//		 driver.findElement(By.xpath("//a[@class='wzrkClose']")).click();
		 driver.findElement(By.xpath("//a[text()='Login']")).click();
		 driver.findElement(By.xpath("//div[@class='coperate']")).click();
		 driver.findElement(By.linkText("Learn More")).click();
//		 driver.findElement(By.xpath("//a[text()='Learn More']")).click();
		 driver.findElement(By.xpath("//a[text()='skip']")).click();
		 driver.findElement(By.xpath("//a[contains (text(),'Username ')]")).click();
		 driver.findElement(By.name("username")).sendKeys("john");
		 driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		 driver.findElement(By.name("password")).sendKeys("john123 ");
		 driver.findElement(By.xpath("//img[@src='/assets/icons/hide-password.svg']")).click();
//		 driver.findElement(By.xpath("//img[@src='/assets/icons/show-password.svg']")).click();
		 driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		 String error=driver.findElement(By.xpath("//div[contains (text(),'Sorry')]")).getText();
         System.out.println("Error found: "+error);
		 
		 driver.quit();
	
	}

}
 