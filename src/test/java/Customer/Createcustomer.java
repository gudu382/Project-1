package Customer;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Base.Baseclass;

public class Createcustomer extends Baseclass{
  @Test
  public void TestCreatecustomer() {
	  System.out.println("Createcustomer");
	  driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
	  driver.findElement(By.xpath("//div[text()='Add New']")).click();
	  driver.findElement(By.xpath("//div[@class='item createNewCustomer']")).click();
	  driver.findElement(By.xpath("(//input[@placeholder='Enter Customer Name'])[2]")).sendKeys("JAN");
	  driver.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description']")).sendKeys("Hello");
	  driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
	  
  }
}
