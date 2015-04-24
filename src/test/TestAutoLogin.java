package test;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;


public class TestAutoLogin {

	@Test
	public void testHomePage(){
	
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("http://gmail.com");
	WebElement username =driver.findElement(By.id("Email"));
	username.sendKeys("dummyname");
	
	WebElement password =driver.findElement(By.name("Passwd"));
	password.sendKeys("xxxxxx");
	
	WebElement button =driver.findElement(By.id("signIn"));
	button.click();

	}

}
