package practise;

import java.io.FileInputStream;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Rediff_1 {
	WebDriver con;
	Properties p;
	@BeforeSuite
	public  void setup() throws Throwable {
     p= new Properties();
     p.load(new FileInputStream("F:\\secondclass\\TestNg\\rediff.properties"));
     con= new ChromeDriver();
     con.manage().window().maximize();
     con.manage().deleteAllCookies();
     con.get(p.getProperty("url"));
     Thread.sleep(5000);
     Reporter.log("launched successfully",true);
	}
     
   @Test
   public void link1() throws Throwable {
	   con.findElement(By.xpath(p.getProperty("money"))).click();
	   Thread.sleep(5000);
	   Reporter.log("money clicked successfully",true);
	   
	}
   @Test
   public void link2()throws Throwable{
	   con.findElement(By.xpath(p.getProperty("mutual"))).click();
	   Thread.sleep(4000);
	   Reporter.log("link2 clicked successfully",true);
   }
   @Test
   public void search() throws Throwable{
	 WebElement text=  con.findElement(By.xpath(p.getProperty("txt")));
	 text.click();
	 Thread.sleep(3000);
	 text.sendKeys(p.getProperty("searchdata"));
	//use actions class
	   Actions ac= new Actions(con);
	   ac.sendKeys(Keys.ARROW_DOWN).perform();
	   Thread.sleep(2000);
	   ac.sendKeys(Keys.ARROW_DOWN).perform();
	   Thread.sleep(2000);
	   ac.sendKeys(Keys.ARROW_DOWN).click().perform();
	   Thread.sleep(2000);
	   ac.sendKeys(Keys.ENTER);
	  // con.findElement(By.xpath(p.getProperty(""))).click();
	   Thread.sleep(5000);
	   con.findElement(By.xpath(p.getProperty("searchbutton"))).click();
	   Reporter.log("searched successfully",true);
   }
   @Test
   public void select() throws Throwable{
	   //store that list box into select class
	   Select d=new Select(con.findElement(By.xpath(p.getProperty("list"))));
	   d.selectByVisibleText(p.getProperty("word"));
	   Thread.sleep(4000);
	   Reporter.log("selected successfull",true);
	 
   }
   
   @AfterSuite
   public void teardown() {
	   con.close();
   }
	
                                                                             
}
