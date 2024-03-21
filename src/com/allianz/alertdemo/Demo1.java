package com.allianz.alertdemo;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        
        driver.get("https://netbanking.hdfcbank.com/netbanking/IpinResetUsingOTP.htm");
        driver.findElement(By.xpath("//img[@src='gif/go.gif']")).click();
       
        WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.alertIsPresent());
        
        String actualAlertText=driver.switchTo().alert().getText();
        System.out.println(actualAlertText);
        
        driver.switchTo().alert().accept();
        System.out.println("End");
	}

}
