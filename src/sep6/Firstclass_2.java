package sep6;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class Firstclass_2 {
	WebDriver con;
 
	  
  
  @Test
  public void mobiles() throws Throwable {
	  con.findElement(By.xpath("(//a[contains(text(),'Mobiles')])[1]")).click();
	  Thread.sleep(5000);
	  Reporter.log("mobiles got clicked",true);
	  
	 
  }
  
  @Test
  public void customer() throws Throwable {
	  con.findElement(By.xpath("(//body)[1]")).click();
	  Thread.sleep(4000);
	  Reporter.log("customer service clicked",true);
	  
	 
  }
  
  @Test
  public void books() throws Throwable {
	  con.findElement(By.xpath("(//body)[1]")).click();
	  Thread.sleep(5000);
	  Reporter.log("books got clicked",true);
	  
	 
  }
  
  
 
  @BeforeTest
  public void beforeTest() throws Throwable {
	  con = new ChromeDriver();
	  con.manage().window().maximize();
	  con.manage().deleteAllCookies();
	  con.get("https://amazon.in");
	  Thread.sleep(5000);
	  Reporter.log("launched browser",true);
  }

  @AfterTest
  public void afterTest() {
	  con.close();
  }

}
