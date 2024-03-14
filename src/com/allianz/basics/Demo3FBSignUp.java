package com.allianz.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo3FBSignUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("https://www.facebook.com/"); 
		 driver.findElement(By.linkText("Create new account")).click();
		 driver.findElement(By.name("firstname")).sendKeys("jack");
		 driver.findElement(By.name("lastname")).sendKeys("wick");
		 driver.findElement(By.name("reg_passwd__")).sendKeys("test123");
		 
		 Select selectDay= new Select(driver.findElement(By.id("day")));
		 selectDay.selectByVisibleText("14");
		 
		 Select selectMonth= new Select(driver.findElement(By.id("month")));
		 selectMonth.selectByIndex(3);
		 
		 Select selectYear= new Select(driver.findElement(By.id("year")));
		 selectYear.selectByValue("1970");
		 
		 driver.findElement(By.xpath("//input[@value='1']")).click();
		 driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		 
		 driver.quit();
		 
	}

}
