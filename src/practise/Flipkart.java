package practise;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Flipkart {
	WebDriver con;
	Properties pro;
	@BeforeSuite
	public void setup()throws Throwable{
		pro=new Properties();
		pro.load(new FileInputStream("F:\\secondclass\\TestNg\\Flipkartprop.properties"));
		
		
		con=new ChromeDriver();
		con.manage().window().maximize();
		con.manage().deleteAllCookies();
		con.get(pro.getProperty("url"));
		Thread.sleep(5000);
		Actions ac= new Actions(con);
		ac.sendKeys(Keys.ESCAPE).perform();
		Reporter.log("launched successfully",true);
		}
	
	@Test
	public void flip() throws Throwable{
		
		con.findElement(By.xpath(pro.getProperty("mobiles")));
		Thread.sleep(4000);
		Reporter.log("mobiles clicked successfully",true);
		
		}
	@Test
	public void flip2() throws Throwable{
		con.findElement(By.xpath(pro.getProperty("nothing"))).click();
		Thread.sleep(4000);
		Reporter.log("clicked nothing successfully",true);
		
	}
	@Test
	public void flip3() throws Throwable{
		con.findElement(By.xpath(pro.getProperty("contact"))).click();
		Thread.sleep(4000);
		con.navigate().back();
		Reporter.log("clicked contact",true);
	}
//	@Test
//	public void flip4() throws Throwable{
//		con.findElement(By.xpath(pro.getProperty(""))).click();
//		Thread.sleep(4000);
//		
//		Reporter.log("clicked  successfully",true);
//	}
	
	@AfterSuite
	public void teardown() throws Throwable{
		con.close();
	}
	
	

}
