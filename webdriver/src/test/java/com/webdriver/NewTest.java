package com.webdriver;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest {
  @Test
 
  public void f() {
	  System.err.println("hello hydrabad");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.err.println("Hello devya");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("wel come here");
  }

}
