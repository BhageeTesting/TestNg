package sep7;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import config_1.Primus;

public class Firstclass_1 extends Primus {
@Test(priority=3)
public static void admin() throws Throwable {
	con.findElement(By.xpath("(//b[normalize-space()='Admin'])[1]")).click();
	Thread.sleep(4000);
	Reporter.log("admin success",true);
}
	
	@Test(priority=4,enabled=false)
	public static void pim() throws Throwable {
		con.findElement(By.xpath("(//b[normalize-space()='PIM'])[1]")).click();
		Thread.sleep(4000);
		Reporter.log("admin success",true);
	
	
}
//	@Test
//	public static void pim() throws Throwable {
//		con.findElement(By.xpath("(//b[normalize-space()='PIM'])[1]")).click();
//		Thread.sleep(4000);
//		Reporter.log("pim success",true);
//	}
	@Test(priority=1)
	public static void leave() throws Throwable {
		con.findElement(By.xpath("(//b[normalize-space()='Leave'])[1]")).click();
		Thread.sleep(4000);
		Reporter.log("pim success",true);
	}
	@Test(priority=0)
	public static void time() throws Throwable {
		con.findElement(By.xpath("//b[normalize-space()='Time']")).click();
		Thread.sleep(4000);
		Reporter.log("pim success",true);
	}
	@Test(priority=2)
	public static void recruit() throws Throwable {
		con.findElement(By.xpath("(//b[normalize-space()='Recruitment'])[1]")).click();
		Thread.sleep(4000);
		Reporter.log("pim success",true);
	}
	
	
	
}
