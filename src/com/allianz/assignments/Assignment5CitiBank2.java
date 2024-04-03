package com.allianz.assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment5CitiBank2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("https://www.online.citibank.co.in/");

		 driver.findElement(By.xpath("//a[@class='newclose']")).click();
		 driver.findElement(By.xpath("//a[@class='newclose2']")).click();
		 
		 driver.findElement(By.xpath("//img[@src='/images/login.png']")).click();
		 ArrayList<String> windows =new ArrayList<String>(driver.getWindowHandles());
		 driver.switchTo().window(windows.get(1));
		 driver.findElement(By.xpath("//div[contains(text(),' User ID? ')]")).click();
		 driver.findElement(By.xpath("//a[text()='select your product type']")).click();
		 driver.findElement(By.linkText("Credit Card")).click();
		 driver.findElement(By.name("citiCard1")).sendKeys("4545");
		 driver.findElement(By.name("citiCard2")).sendKeys("5656");
		 driver.findElement(By.name("citiCard3")).sendKeys("8887");
		 driver.findElement(By.name("citiCard4")).sendKeys("9998");
		 driver.findElement(By.name("CCVNO")).sendKeys("998");
		 driver.findElement(By.xpath("//input[@name='DOB']")).click();
		 
		 Select selectYear= new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
		 selectYear.selectByValue("2022");
		 
		 Select selectMonth= new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
		 selectMonth.selectByVisibleText("Apr");
		 
		 //driver.findElement(By.linkText("14")).click();
		 driver.findElement(By.xpath("//a[text()='14']")).click();
		 driver.findElement(By.xpath("//input[@value='PROCEED']")).click();
		 
		 String error= driver.findElement(By.xpath("//li[text()='• Please accept Terms and Conditions ']")).getText();
         System.out.println("Error found: "+error);
//         driver.close();
		 driver.quit();
//	 

	}

}
