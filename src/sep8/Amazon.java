package sep8;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazon {
	WebDriver con;
	Properties p;
	@BeforeTest
	public void setup() throws Throwable {
		
		p=new Properties();
		p.load(new FileInputStream("F:\\secondclass\\TestNg\\Amazon.properties"));
		con= new ChromeDriver();
		con.manage().window().maximize();
		con.manage().deleteAllCookies();
		con.get(p.getProperty("url"));
		Thread.sleep(5000);
		
		}
	@Test
	public void web() throws Throwable{
		
		con.findElement(By.xpath(p.getProperty("mobile"))).click();
		con.findElement(By.xpath(p.getProperty("new"))).click();
		//con.findElement(By.xpath(p.getProperty("link"))).click();
		con.findElement(By.xpath(p.getProperty("search"))).sendKeys(p.getProperty("searchkey"));
		con.findElement(By.xpath(p.getProperty("//input[@value='Go']"))).click();
		
	}
	@AfterTest
	public void teardown() throws Throwable{
		con.close();
	}

}
