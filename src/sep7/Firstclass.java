package sep7;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import config.Javautil;

public class Firstclass extends Javautil {
	@Test
	public void addition() {
		skull.findElement(By.name("display")).sendKeys("5245");
		skull.findElement(By.xpath("(//input[@value='+'])[1]")).click();
		skull.findElement(By.name("display")).sendKeys("69768");
		skull.findElement(By.xpath("(//input[@value='='])[1]")).click();
	String addres=	skull.findElement(By.name("display")).getAttribute("value");
	Reporter.log(addres,true);
	}
	@Test
	public void division() {
		skull.findElement(By.name("display")).sendKeys("6824686");
		skull.findElement(By.xpath("(//input[@value='/'])[1]")).click();
		skull.findElement(By.name("display")).sendKeys("6284");
		skull.findElement(By.xpath("(//input[@value='='])[1]")).click();
		String divres=	skull.findElement(By.name("display")).getAttribute("value");
		Reporter.log(divres,true);
		
	}
	@Test
	public void multiply() {
		skull.findElement(By.name("display")).sendKeys("571345745");
		skull.findElement(By.xpath("(//input[@value='x'])[1]")).click();
		skull.findElement(By.name("display")).sendKeys("66248");
		skull.findElement(By.xpath("(//input[@value='='])[1]")).click();
		String mulres=	skull.findElement(By.name("display")).getAttribute("value");
		Reporter.log(mulres,true);
		
	}
	
	

}
