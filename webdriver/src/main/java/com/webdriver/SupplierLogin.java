package com.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SupplierLogin {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\devya\\OneDrive\\Documents\\trainnig\\libs\\chromedriver_win32\\chromedriver.exe");
		WebDriver obj = new ChromeDriver();
		obj.get("http://localhost:3000/SupplierLogin");
		obj.findElement(By.xpath("//*[@id=\"supplierEmail\"]")).sendKeys("sb@gmail.com");
		obj.findElement(By.xpath("//*[@id=\"supplierPassword\"]")).sendKeys("123456");
	    obj.findElement(By.xpath("//*[@id=\"btn\"]")).click();
      obj.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	//obj.quit();
	}
	
}
