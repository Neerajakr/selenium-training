package com.allianz.assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6OpenEMR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("http://demo.openemr.io/b/openemr/");
		 
		 driver.findElement(By.name("authUser")).sendKeys("admin");
		 driver.findElement(By.name("clearPass")).sendKeys("pass");

		 Select language= new Select(driver.findElement(By.xpath("//select[@name='languageChoice']")));
		 language.selectByVisibleText("English (Indian)");
		 driver.findElement(By.id("login-button")).click();
		 driver.findElement(By.xpath("//div[text()='Patient']")).click();
		 driver.findElement(By.xpath("//div[text()='New/Search']")).click();
		 driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='pat']")));
		 driver.findElement(By.xpath("//input[@name='form_fname']")).sendKeys("test");
		 driver.findElement(By.name("form_lname")).sendKeys("name");
		 driver.findElement(By.id("form_DOB")).sendKeys("2024-04-02");
		 
		 Select gender= new Select(driver.findElement(By.id("form_sex")));
		 gender.selectByValue("Female");
		 
		 driver.findElement(By.id("form_DOB")).sendKeys("2024-04-02");
		 driver.findElement(By.id("create")).click();
		 driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='modalframe']")));
		 driver.findElement(By.xpath("//button[contains(text(),'Confirm')]")).click();

         System.out.println("End ");
//         driver.close();
//		 driver.quit();
 

	}

}
