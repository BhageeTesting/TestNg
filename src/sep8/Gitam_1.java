package sep8;

import java.io.FileInputStream;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Gitam_1 {
	WebDriver con;
	Properties p;
	@BeforeTest
	public void setup() throws Throwable {
		p= new Properties();
		p.load(new FileInputStream("F:\\secondclass\\TestNg\\Gitam.properties"));
		con= new ChromeDriver();
		con.manage().window().maximize();
		con.manage().deleteAllCookies();
		con.get(p.getProperty("Url"));
		Thread.sleep(5000);
		Reporter.log("before condition success",true);
		
	}
	@Test
	public void login() throws Throwable {
		con.findElement(By.xpath(p.getProperty("User"))).sendKeys(p.getProperty("Username"));
		Thread.sleep(3000);
		con.findElement(By.xpath(p.getProperty("Pass"))).sendKeys(p.getProperty("Password"));
		Thread.sleep(3000);
		con.findElement(By.xpath(p.getProperty("Click"))).click();
		Thread.sleep(5000);
		Reporter.log("Login success",true);
		
		
	}
	@AfterTest
	public void teardown() throws Throwable {
		Thread.sleep(3000);
		con.close();
		Reporter.log("ended successful",true);
	}

}
