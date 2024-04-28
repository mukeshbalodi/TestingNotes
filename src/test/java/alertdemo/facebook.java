package alertdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class facebook {
	public static void main (String args[]) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		
		WebElement ele= driver.findElement(By.id("email"));
		ele.sendKeys("mukeshbalodi5@gmail.com");
		Thread.sleep(2000);
		
		WebElement ele1 = driver.findElement(By.id("pass"));
		ele1.sendKeys("123456");
		Thread.sleep(2000);
	
		driver.findElement(By.name("login")).click();
		
		
		
		String expectedurl = ("https://www.facebook.com/");
		String actualurl = driver.getCurrentUrl();
		
		
		if (expectedurl.equals(actualurl)) {
			System.out.println("Login successful");
			
		}
		else {
			System.out.println("Invalid Credentials");
		}
		
		driver.close();
		
	}

}

