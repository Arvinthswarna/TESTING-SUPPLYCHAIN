package mytest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RetailerSignup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver obj = new ChromeDriver();
		obj.get("http://localhost:3000/signup");
		obj.findElement(By.xpath("//*[@id=\"retailerId\"]")).sendKeys("2");
		obj.findElement(By.xpath("//*[@id=\"retailerName\"]")).sendKeys("gokul");
     	obj.findElement(By.xpath("//*[@id=\"retailerCompany\"]")).sendKeys("gokultraders");
     	obj.findElement(By.xpath("//*[@id=\"retailerEmail\"]")).sendKeys("gokul@gmail.com");
     	obj.findElement(By.xpath("//*[@id=\"retailerPassword\"]")).sendKeys("123456");
     	obj.findElement(By.xpath("//*[@id=\"retailerContactNumber\"]")).sendKeys("9791321170");
     	obj.findElement(By.xpath("//*[@id=\"btn\"]")).sendKeys("signedup successful");
     	
	}

}
