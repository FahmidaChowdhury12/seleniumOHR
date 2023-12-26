package com.generic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pageobjmodle.Pageobjmodle;
import com.utility.Baseconfig;



public class Login {
	
	public void getlogin() throws Exception{
		
		WebDriver driver = new ChromeDriver();
		Baseconfig obj = new Baseconfig();
		
		driver.get(obj.getconfig("URL"));
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		Thread.sleep(2000);
		
		Pageobjmodle pom = new Pageobjmodle();
		
		driver.findElement(pom.username).sendKeys(obj.getconfig("USER"));
		driver.findElement(pom.password).sendKeys(obj.getconfig("PASSWORD"));
		//driver.findElement(By.xpath("//*[text()=' Login']")).click();
		
		driver.findElement(pom.loginbtn).click();
		
		Thread.sleep(2000);
		driver.findElement(pom.Dropdown).click();
		
	
	
		WebElement logout = driver.findElement(pom.logoutbtn);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(logout));
		
		
		Boolean logoutfound = logout.isDisplayed();
		System.out.println(logoutfound);
		
		
		driver.quit();
				
				
	
		
	}

}
