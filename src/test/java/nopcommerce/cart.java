package nopcommerce;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import keyprocess.ScreenRecorderUtil;


public class cart {

	public static void main(String[] args) throws Exception  {
		
		
		ScreenRecorderUtil.startRecord("main");
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement ele = driver.findElement(By.name("customerCurrency"));
		Select slt = new Select(ele);
		slt.selectByValue("https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F");
		Thread.sleep(2000);
		
		
		
		
		
		
		driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[1]/div/div[1]/a/img")).click();
		Thread.sleep(2000);
		

		//RAM selection
		WebElement ele1 = driver.findElement(By.id("product_attribute_2"));
		Select slt12 = new Select(ele1);
		slt12.selectByValue("5");
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//input[@type='radio'and @value=\"7\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='checkbox'and @value=\"10\"]")).click();
		Thread.sleep(2000);
		
		
		
		List<WebElement> chkBox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for (WebElement chk:chkBox) 
		{
			chk.click();
		Thread.sleep(2000);
		
		}

	
		
	}
}
		
		
		
		