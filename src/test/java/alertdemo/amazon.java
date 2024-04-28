package alertdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class amazon {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://www.amazon.in/");	
		Driver.manage().window().maximize();
		
		
		WebElement ele = Driver.findElement(By.id("twotabsearchtextbox"));
		ele.sendKeys("puma shoe for men");
		Driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		Thread.sleep(3000);
		
		//Driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[62]/div/div/span/div/div/div[1]/div/span/a/div/img")).click();
		Thread.sleep(2000);
		
		Driver.close();
		
		


	}

}
