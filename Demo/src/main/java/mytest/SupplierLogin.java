package mytest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SupplierLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver obj = new ChromeDriver();
		obj.get("http://localhost:3000/supplierlogin");
		obj.findElement(By.xpath("//*[@id=\"supplierEmail\"]")).sendKeys("arvinth@gmail.com");
		obj.findElement(By.xpath("//*[@id=\"supplierPassword\"]")).sendKeys("123456");
     	obj.findElement(By.xpath("//*[@id=\"btn\"]")).sendKeys("signed in successful");
     	
     	
     	
     	
     	
     	
		
		
      
	}

}
