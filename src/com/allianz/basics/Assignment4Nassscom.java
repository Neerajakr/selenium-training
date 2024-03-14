package com.allianz.basics;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment4Nassscom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
		 driver.get("https://nasscom.in/");
		 driver.findElement(By.linkText("Login")).click();
		 driver.findElement(By.xpath("//li[text()='register']")).click();
		 driver.findElement(By.name("field_fname_reg[0][value]")).sendKeys("admin");
		 driver.findElement(By.name("field_lname[0][value]")).sendKeys("pass");
		 driver.findElement(By.name("mail")).sendKeys("admin@gmail.com");
		 driver.findElement(By.name("field_company_name_registration[0][value]")).sendKeys("Google");
		 
		 Select selectbusiness= new Select(driver.findElement(By.name("field_business_focus_reg")));
		 selectbusiness.selectByVisibleText("IT Consulting");
		 
		 driver.findElement(By.xpath("//input[@id='edit-submit--2']")).click();
		 
		 driver.quit();
	}

}
 