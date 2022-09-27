package sep8;

import java.io.FileInputStream;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Orangehrm {
	WebDriver skull;
	Properties p;
	@BeforeTest
	public void setup() throws Throwable {
		p=new Properties();
		p.load(new FileInputStream("F:\\secondclass\\TestNg\\orange.properties"));
		skull=new ChromeDriver();
		skull.manage().window().maximize();
		skull.manage().deleteAllCookies();
		skull.get(p.getProperty("url"));
		Thread.sleep(5000);
		
	}
	@Test
	public void login() throws Throwable {
		skull.findElement(By.xpath(p.getProperty("user"))).sendKeys(p.getProperty("username"));
		Thread.sleep(3000);
		skull.findElement(By.xpath(p.getProperty("pass"))).sendKeys(p.getProperty("password"));
		Thread.sleep(3000);
		skull.findElement(By.xpath(p.getProperty("click"))).click();
		Thread.sleep(5000);
		
	}
	@AfterTest
	public void teardown()throws Throwable {
		skull.close();
		
	}
	
	
	

}
