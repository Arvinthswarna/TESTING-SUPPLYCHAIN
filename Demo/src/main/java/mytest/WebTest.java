package mytest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
				System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
				WebDriver  obj = new ChromeDriver();
				obj.get("https://www.facebook.com/");
				
				System.out.println(obj.getTitle());
				//obj.quit();

	}

}
