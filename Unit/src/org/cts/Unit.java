package org.cts;

import java.sql.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Unit {
	
static WebDriver driver;

@BeforeClass
public static void beforeclass() {
	// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Balaji\\eclipse-workspace2\\Unit\\driver\\chromedriver.exe");
driver = new ChromeDriver();
driver.get("https://www.facebook.com");
}
@Before
public void before() {
	// TODO Auto-generated method stub
	Date d = new Date(5000);
System.out.println(d);
}
@Test
public void test() {
	// TODO Auto-generated method stub
	WebElement a= driver.findElement(By.xpath("//*[@id=\"u_0_l\"]"));
	a.sendKeys("balajivikram005@gmail.com");
}
@After
public void after() {
	// TODO Auto-generated method stub
Date d = new Date(5000);
System.out.println(d);
}
@AfterClass
public static void afterclass() {
	// TODO Auto-generated method stub
driver.quit();
}
}
