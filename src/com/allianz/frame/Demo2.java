package com.allianz.frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://netbanking.hdfcbank.com/netbanking/");
        driver.switchTo().frame(0);
        driver.findElement(By.name("fldLoginUserId")).sendKeys("jack123");
        driver.findElement(By.linkText("CONTINUE")).click();
        
        driver.switchTo().defaultContent();
        
        
        System.out.println("End");
	}

}
