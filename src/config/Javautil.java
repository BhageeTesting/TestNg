package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class Javautil {
	public static WebDriver skull;
	@BeforeMethod
	public static void setup() throws Throwable {
		skull=new ChromeDriver();
		skull.manage().window().maximize();
		skull.get("http://calc.qedgetech.com/");
		Thread.sleep(3000);
		Reporter.log("Before method successfull",true);
		
	}
	@AfterMethod
	
	public static void teardown() {
		skull.close();
		Reporter.log("after method successfull",true);
		
	}
	

}
