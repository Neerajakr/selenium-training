package com.allianz.basics;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Assignment1SalesForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=topnav2-btn-ft");
		
		 driver.findElement(By.name("UserFirstName")).sendKeys("John");
		 driver.findElement(By.name("UserLastName")).sendKeys("wick");
		 driver.findElement(By.name("UserEmail")).sendKeys("john@gmail.com");
		 		
		 Select selectDay= new Select(driver.findElement(By.name("UserTitle")));
		 selectDay.selectByVisibleText("IT Manager");
		 
		 Select selectEmp= new Select(driver.findElement(By.name("CompanyEmployees")));
		 selectEmp.selectByVisibleText("101 - 200 employees");
		 
		 Select selectCountry= new Select(driver.findElement(By.name("CompanyCountry")));
		 selectCountry.selectByVisibleText("United Kingdom");
		 
		 driver.findElement(By.name("CompanyName")).sendKeys("Allianz");
		 driver.findElement(By.xpath("(//div[@class='checkbox-ui'])[2]")).click();
		 driver.findElement(By.name("start my free trial")).click();
		 
		 String error= driver.findElement(By.xpath("//span[text()='Enter a valid phone number']")).getText();
		 System.out.println("Error found: "+error);
		 
		 driver.quit();
	}

}
