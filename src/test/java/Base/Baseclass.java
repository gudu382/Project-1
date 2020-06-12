package Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Baseclass {
	public WebDriver driver=new FirefoxDriver();
	 
  @BeforeClass
  public void Openbrowser() {
	  System.out.println("Openbrowser");
	  driver.manage().window().maximize();
	  driver.navigate().to("https://demo.actitime.com/login.do");
	 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
  }
  @BeforeMethod
  public void Login() {
	  System.out.println("Login");
	  driver.findElement(By.id("username")).sendKeys("admin");
	  driver.findElement(By.name("pwd")).sendKeys("manager");
	  driver.findElement(By.id("loginButton")).click();
  }
  @AfterMethod
  public void Logout() {
	  System.out.println("Logout");
	  
  }
  @AfterClass
  public void Closebrowser() {
	  System.out.println("Closebrowser");
  }
}
