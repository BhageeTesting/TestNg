package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Beforetest {
WebDriver con;

@BeforeTest
public void setup() throws Throwable{
	con=new ChromeDriver();
	con.manage().window().maximize();
	con.manage().deleteAllCookies();
	con.get("https://www.amazon.in");
	Thread.sleep(5000);
	Reporter.log("launched successfully",true);
	
	
	
		
	}
@Test
public void bestsellers() throws Throwable {
	con.findElement(By.xpath("//img[@alt='Great Indian Festival']")).click();
	Thread.sleep(3000);
	Reporter.log("opened bestsellers",true);
	
	
	
}
@Test
public void mobiles()throws Throwable{
	con.findElement(By.xpath("//a[normalize-space()='Mobiles']")).click();
	Thread.sleep(4000);
	Reporter.log("mobiles clicked",true);
	
	
}
@Test
public void books()throws Throwable{
	con.findElement(By.xpath("")).click();
	Thread.sleep(4000);
	Reporter.log("opened books",true);
	
	
}
@AfterTest
public void teardown() throws Throwable{
	con.close();
}





	
	
	
}







