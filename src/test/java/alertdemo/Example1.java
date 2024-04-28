package alertdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoblaze.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[3]/div/div/h4/a")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.findElement(By.id("cartur")).click();

		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button")).click();
		Thread.sleep(2000);

		
		// Start coding...
		
		
		WebElement ele1 = driver.findElement(By.xpath("//*[@id=\"name\"]"));
		ele1.sendKeys("Mukesh Chandra");
		Thread.sleep(2000);
		
		
		WebElement ele2 = driver.findElement(By.xpath("//*[@id=\"country\"]"));
		ele2.sendKeys("India");
		Thread.sleep(2000);
		
		WebElement ele3 = driver.findElement(By.xpath("//*[@id=\"city\"]"));
		ele3.sendKeys("Delhi");
		Thread.sleep(2000);
		

		WebElement ele4 = driver.findElement(By.xpath("//*[@id=\"card\"]"));
		ele4.sendKeys("123456789");
		Thread.sleep(2000);
		
		WebElement ele5 = driver.findElement(By.xpath("//*[@id=\"month\"]"));
		ele5.sendKeys("12");
		Thread.sleep(2000);
		
		WebElement ele6 = driver.findElement(By.xpath("//*[@id=\"year\"]"));
		ele6.sendKeys("2029");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]")).click();
		
		
		
		

		Thread.sleep(2000);
		driver.close();

	}

}