package com.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SignUp {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\devya\\OneDrive\\Documents\\trainnig\\libs\\chromedriver_win32\\chromedriver.exe");
		WebDriver obj = new ChromeDriver();
		obj.get("http://localhost:3000/SignUp");
		obj.findElement(By.xpath("//*[@id=\"retailerId\"]")).sendKeys("1223252545");
	    obj.findElement(By.xpath("//*[@id=\"retailerName\"]")).sendKeys("megavath");
		obj.findElement(By.xpath("//*[@id=\"retailerCompany\"]")).sendKeys("gaya@gmail.com");
		obj.findElement(By.xpath("//*[@id=\"retailerEmail\"]")).sendKeys("123456");
		obj.findElement(By.xpath("//*[@id=\"retailerPassword\"]")).sendKeys("gayatri");
	    obj.findElement(By.xpath("//*[@id=\"retailerContactNumber\"]")).sendKeys("megavath");
	    
    	obj.findElement(By.xpath("//*[@id=\"btn\"]")).click();
    	
    	obj.findElement(By.xpath("//*[@id=\"retailerEmail\"]")).sendKeys("devya1438@gmail.com");
		obj.findElement(By.xpath("//*[@id=\"retailerPassword\"]")).sendKeys("123456");

	obj.findElement(By.xpath("//*[@id=\"btn\"]")).click();
    	
    	
	
	    obj.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
//     	obj.quit();
		
	}

}
