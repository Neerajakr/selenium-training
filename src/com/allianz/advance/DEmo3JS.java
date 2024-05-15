package com.allianz.advance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DEmo3JS {
	public static void main(String[] args) {
		
		 WebDriver driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("https://www.citibank.co.in/ssjsps/forgetuserid.jsp");
		
		 driver.findElement(By.xpath("//a[text()='select your product type']")).click();
		 driver.findElement(By.linkText("Credit Card")).click();
		 driver.findElement(By.cssSelector("#citiCard1")).sendKeys("4545");
		 driver.findElement(By.cssSelector("input[name='citiCard2']")).sendKeys("5656");
		 driver.findElement(By.cssSelector("[name='citiCard3']")).sendKeys("8887");
		 driver.findElement(By.cssSelector("#citiCard4")).sendKeys("9998");
		 //approach 1
//		 driver.findElement(By.id("bill-date-long")).sendKeys("08/08/2207");
		 
		 //approach 2
//		 driver.findElement(By.id("bill-date-long")).click();
//		 Select selectYear= new Select(driver.findElement(By.xpath("//select[@data-handler='selectYear']")));
//		 selectYear.selectByValue("2017");
//		 
//		 Select selectMonth= new Select(driver.findElement(By.xpath("//select[@data-handler='selectMonth']")));
//		 selectMonth.selectByVisibleText("Aug");
//		 
//		 driver.findElement(By.linkText("14")).click();

		 
		 //approach 3 - JavaScript
		 //document.querySelector('#bill-date-long').click();
//		 JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("document.querySelector('#bill-date-long').value='17/08/2017'");
		 
	     
		 //approach 4 - JavaScript
		 //document.querySelector('#bill-date-long').click();
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 WebElement ele1=driver.findElement(By.xpath("//input[@id='bill-date-long']"));
	     js.executeScript("arguments[0].value='22/10/2020'",ele1);
}
}