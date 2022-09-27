package config_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Primus {
	public static WebDriver con;
	@BeforeSuite
	public static void setup() throws Throwable {
		con=new ChromeDriver();
		con.manage().window().maximize();
		con.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		Thread.sleep(5000);
		con.findElement(By.name("txtUsername")).sendKeys("Admin");
		Thread.sleep(4000);
		con.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
		Thread.sleep(4000);
		con.findElement(By.id("btnLogin")).click();
	}
	@AfterSuite
	public static void teardown() {
		
		con.close();
	}

}
