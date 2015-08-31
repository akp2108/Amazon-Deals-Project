package com.amazon.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class HomePage {
	
	private WebDriver driver;
  
  @BeforeTest
  public void beforeTest() {
	  driver = new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.amazon.com/gp/gw/ajax/s.html");	  
  }
  
  @Test
  public void clickTodaysDealsLink() throws Exception {
	  driver.findElement(By.linkText("Today's Deals")).click();
	  Thread.sleep(2000);
	  System.out.println(driver.getTitle());
	  
  }
  @Test
  public void clickGiftCardLink() throws Exception {
	  driver.findElement(By.linkText("Gift Cards")).click();
	  Thread.sleep(2000);
	  System.out.println(driver.getTitle());
  }
  @Test
  public void clickSellLink() throws Exception {
	  driver.findElement(By.linkText("Sell")).click();
	  Thread.sleep(2000);
	  System.out.println(driver.getTitle());
  }
  @AfterTest
  public void afterTest() {
	  driver.quit();	  
  }

}
