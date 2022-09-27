package sep6;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class Firstclass_1 {
	WebDriver skull;
	
	
	
  @Test
  public void cbanking() throws Throwable {
	  skull.findElement(By.xpath("(//img)[5]")).click();
	  Thread.sleep(4000);
	  Reporter.log("cbanking executed",true);
	  
	  
  }
  @Test
  public void ibanking() throws Throwable {
	  skull.findElement(By.xpath("(//img)[6]")).click();
	  Thread.sleep(4000);
	  Reporter.log("ibanking executed",true);
	  
	  
  }
  @Test
  public void pbanking() throws Throwable {
	  skull.findElement(By.xpath("(//img)[4]")).click();
	  Thread.sleep(4000);
	  Reporter.log("pbanking executed",true);
	  
	  
  }
  @BeforeTest
  public void beforeTest() throws Throwable {
	  skull=new ChromeDriver();
	  skull.manage().window().maximize();
	  skull.manage().deleteAllCookies();
	  skull.get("http://primusbank.qedgetech.com/");
	  Thread.sleep(5000);
	  Reporter.log("Home page is executed",true);
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  skull.close();
	  
	  
	  
	  
	  
  }

}
