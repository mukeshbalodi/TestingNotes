package alertdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;
public class google {

	
	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	 
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.youtube.com");
	driver.manage().window().maximize();
	
	
	driver.findElement(By.name("search_query")).click();
	
	
	
	WebElement ele= driver.findElement(By.name("search_query"));

	ele.sendKeys("jhumki gadwali song");
	Thread.sleep(2000);
	
	
	driver.findElement(By.xpath("//*[@id=\"search-icon-legacy\"]/yt-icon/yt-icon-shape/icon-shape/div")).click();
	

	driver.findElement(By.xpath("//*[@id=\"video-title\"]")).click();
	Thread.sleep(30000);
	
	

	
	
	driver.close();	
	
	
	
	
	
	
	}

}


