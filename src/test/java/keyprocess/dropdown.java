package keyprocess;


import org.openqa.selenium.support.ui.Select;
import org.apache.commons.io.FileUtils;
import java.io.File;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class dropdown {

	public static void main(String[] args) throws Exception {
		
		ScreenRecorderUtil.startRecord("main");

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement ele = driver.findElement(By.name("fromPort"));
		Select slt = new Select(ele);
		slt.selectByValue("Portland");
		Thread.sleep(2000);
		
		
		WebElement ele1 = driver.findElement(By.name("toPort"));
		Select slt1 = new Select(ele1);
		slt1.selectByValue("New York");
		Thread.sleep(2000);

		
		driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[1]/td[1]/input")).click();
		Thread.sleep(2000);
		
		WebElement ele2 = driver.findElement(By.id("inputName"));
		ele2.sendKeys("Mukesh");
		Thread.sleep(2000);


		WebElement ele3 = driver.findElement(By.id("address"));
		ele3.sendKeys("Delhi");
		Thread.sleep(2000);
		
		WebElement ele4 = driver.findElement(By.name("city"));
		ele4.sendKeys("Delhi");
		Thread.sleep(2000);
		
		WebElement ele5 = driver.findElement(By.name("state"));
		ele5.sendKeys("Delhi");
		Thread.sleep(2000);
		
		
		WebElement ele6 = driver.findElement(By.name("zipCode"));
		ele6.sendKeys("110092");
		Thread.sleep(2000);
		
		WebElement ele11 = driver.findElement(By.name("cardType"));
		Select slt11 = new Select(ele11);
		slt11.selectByValue("dinersclub");
		Thread.sleep(2000);
		
		
		
		WebElement ele88 = driver.findElement(By.id("creditCardNumber"));
		ele88.sendKeys("123456789");
		Thread.sleep(2000);
		
		driver.findElement(By.id("creditCardMonth")).click();
		
		
		WebElement ele111 = driver.findElement(By.id("creditCardMonth"));
		Actions act= new Actions(driver);
		act.sendKeys(Keys.BACK_SPACE).perform();
		Thread.sleep(2000);
		
		WebElement ele1111 = driver.findElement(By.id("creditCardMonth"));
		Actions act1= new Actions(driver);
		act.sendKeys(Keys.BACK_SPACE).perform();
		Thread.sleep(2000);
		
		WebElement ele81 = driver.findElement(By.id("creditCardMonth"));
		ele81.sendKeys("12");
		Thread.sleep(2000);
		
		driver.findElement(By.id("creditCardYear")).click();
		
		
		WebElement ele112 = driver.findElement(By.id("creditCardYear"));
		Actions act2= new Actions(driver);
		act.sendKeys(Keys.BACK_SPACE).perform();
		Thread.sleep(2000);
		
		WebElement ele12 = driver.findElement(By.id("creditCardYear"));
		Actions act3= new Actions(driver);
		act.sendKeys(Keys.BACK_SPACE).perform();
		Thread.sleep(2000);
		
		WebElement ele1112 = driver.findElement(By.id("creditCardYear"));
		Actions act32= new Actions(driver);
		act.sendKeys(Keys.BACK_SPACE).perform();
		Thread.sleep(2000);
		
		WebElement ele1212 = driver.findElement(By.id("creditCardYear"));
		Actions act62= new Actions(driver);
		act.sendKeys(Keys.BACK_SPACE).perform();
		Thread.sleep(2000);
		
		
		
		
		WebElement ele89 = driver.findElement(By.id("creditCardYear"));
		ele89.sendKeys("2029");
		Thread.sleep(2000);
		
		
		
		WebElement ele9 = driver.findElement(By.id("nameOnCard"));
		ele9.sendKeys("mukesh ");
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/input")).click();
		Thread.sleep(2000);


		TakesScreenshot sc = ((TakesScreenshot) driver);
		File src = sc.getScreenshotAs(OutputType.FILE);
		File f2 = new File("D:\\screenshots\\flightdemo.png");
		FileUtils.copyFile(src, f2);


		
		




		driver.close();
		ScreenRecorderUtil.stopRecord();

	}

}
