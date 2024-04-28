package Login_package;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login_page {
	public static void main(String[] args) throws InterruptedException  {

	
	WebDriverManager.chromedriver().setup();
	
	WebDriver Driver = new ChromeDriver();
	Driver.get("https://www.saucedemo.com/");
	
	
	
	
	WebElement ele = Driver.findElement(By.name("user-name"));
	ele.sendKeys("standard_user");
	Thread.sleep(2000);
	
	WebElement ele1 = Driver.findElement(By.name("password"));
	ele1.sendKeys("secret_sauc");
	Thread.sleep(2000);
	
	Driver.findElement(By.name("login-button")).click();
	Thread.sleep(2000);
	
	String expectedurl= "https://www.saucedemo.com/inventory.html";
	String actualurl= Driver.getCurrentUrl();
	
	if (expectedurl.equals(actualurl)) {
		System.out.println("Login Successful");
	}
	else {
		System.out.println("Invalid Credentials");
	}
	Thread.sleep(2000);
	Driver.close();
}

	
}
