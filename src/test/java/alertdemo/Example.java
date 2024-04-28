package alertdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example {

	public static void main(String[] args)throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoblaze.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a"));
		
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		driver.findElement(By.id("cartur")).click();
		
		driver.findElement(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]"));
		Thread.sleep(2000);
		
		WebElement ele1 = driver.findElement(By.id("name"));
		ele1.sendKeys("Mukesh Chandra");
		Thread.sleep(2000);
		
		WebElement ele2 = driver.findElement(By.id("country"));
		ele2.sendKeys("India");
		Thread.sleep(2000);
		
		WebElement ele3 = driver.findElement(By.id("city"));
		ele3.sendKeys("Delhi");
		Thread.sleep(2000);
		

		WebElement ele4 = driver.findElement(By.id("card"));
		ele4.sendKeys("123456789");
		Thread.sleep(2000);
		
		WebElement ele5 = driver.findElement(By.id("month"));
		ele5.sendKeys("12");
		Thread.sleep(2000);
		
		WebElement ele6 = driver.findElement(By.id("year"));
		ele6.sendKeys("2029");
		Thread.sleep(2000);
		
		
		
		driver.findElement(By.name("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]")).click();
		Thread.sleep(2000);
		
		
		driver.close();
		
		
		
		
		

	}

}
