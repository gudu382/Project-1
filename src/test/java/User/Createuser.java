package User;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Base.Baseclass;

public class Createuser extends Baseclass{
  @Test
  public void TestCreateuser() {
	  System.out.println("Createuser");
	  
	  driver.findElement(By.xpath("//div[@id='container_users']")).click();
	  driver.findElement(By.xpath("//div[text()='New User']")).click();
	  driver.findElement(By.xpath("(//input[@name='firstName'])[2]")).sendKeys("Hello");
	  driver.findElement(By.xpath("(//input[@name='lastName'])[2]")).sendKeys("HI");
	  driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("jan223@gmail.com");
	  driver.findElement(By.xpath("//div[text()='Save & Send Invitation']")).click();
	  driver.findElement(By.xpath("(//span[text()='Close'])[1]")).click();
  }
}
