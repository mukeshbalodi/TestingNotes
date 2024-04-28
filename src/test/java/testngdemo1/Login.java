package testngdemo1;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.By;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Login {
	
	WebDriver driver ;
	
 
  @BeforeTest
  public void setup() throws InterruptedException{
	  
	  WebDriverManager.chromedriver().setup();
	  
	  driver = new ChromeDriver();
	  
	  
	 driver.get("https://www.saucedemo.com/");
	 driver.manage().window().maximize();
	 Thread.sleep(2000);
  }

  @Test
  public Login() throws InterruptedException {
	  String expectedUrl =  "https://www.saucedemo.com/";
	  String actualUrl = driver.getCurrentUrl();
	  
	  
	  if (expectedUrl.equals(actualUrl)){
		  System.out.println("Url is correct Url");
		  
	  }
	  else {
		  System.out.println("Url is wrong");
	  }

	 String expectedTitle =  "Swag Labs";
	 
	 String actualTitle = driver.getTitle();
	 if (expectedTitle.equals(actualTitle)) {
		 System.out.println("Title is correct");
	 } 
	 else {
		 System.out.println("Title not correct");
	 }
  
   
  WebElement ele = driver.findElement(By.name("user-name"));
  ele.sendKeys("standard_user");
  
  WebElement ele1 = driver.findElement(By.name("password"));
	ele1.sendKeys("secret_sauce");
	Thread.sleep(2000);
	driver.findElement(By.name("login-button")).click();
	Thread.sleep(2000);
  
	String expectUrl= "https://www.saucedemo.com/inventory.html";
	String actualUrl2= driver.getCurrentUrl();
	
	if (expectUrl.equals(actualUrl2)) {
		System.out.println("Log in Successful");
	}
	else {
		System.out.println("invalid Credentials");
	}
  
  
  
  
  
  }
  @AfterTest
  public void teardown() throws InterruptedException {
	  Thread.sleep(2000);
  }

}
