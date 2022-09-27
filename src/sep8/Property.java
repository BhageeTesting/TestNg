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

public class Property {
	WebDriver driver;
	Properties p;
	@BeforeTest
	public void setup() throws Throwable {
		p=new Properties();
		p.load(new FileInputStream("F:\\secondclass\\TestNg\\Netflix.properties"));
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(p.getProperty("url"));
		Thread.sleep(5000);
		Reporter.log("launched successfully",true);
		
		
		
	}
	@Test
	public void login() {
		driver.findElement(By.xpath(p.getProperty("user"))).sendKeys(p.getProperty("username"));
		driver.findElement(By.xpath(p.getProperty("pass"))).sendKeys(p.getProperty("password"));
		driver.findElement(By.xpath(p.getProperty("click"))).click();
		
		
		
		
	}
	@AfterTest
	public void teardown() {
		driver.close();
		
	}
	

}
