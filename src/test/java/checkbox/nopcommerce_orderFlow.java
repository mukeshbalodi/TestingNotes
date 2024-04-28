package checkbox;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import keyprocess.ScreenRecorderUtil;


public class nopcommerce_orderFlow {

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

		driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-1\"]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.id("topcartlink")).click();
		
		WebElement ele11 = driver.findElement(By.name("checkout_attribute_1"));
		Select slt11 = new Select(ele11);
		slt11.selectByValue("2");
		Thread.sleep(2000);
		
		
		WebElement ele2 = driver.findElement(By.id("discountcouponcode"));
		ele2.sendKeys("Mukesh12345");
		Thread.sleep(2000);

		WebElement ele21 = driver.findElement(By.id("giftcardcouponcode"));
		ele21.sendKeys("Mukesh123");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"termsofservice\"]")).click();
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[1]/div[3]/button[1]")).click();
		Thread.sleep(2000);
	
		WebElement ele211 = driver.findElement(By.id("BillingNewAddress_FirstName"));
		ele211.sendKeys("Mukesh");
		Thread.sleep(2000);
		

		WebElement ele2112 = driver.findElement(By.id("BillingNewAddress_LastName"));
		ele2112.sendKeys("Balodi");
		Thread.sleep(2000);
		
		
		WebElement ele21122 = driver.findElement(By.id("BillingNewAddress_Email"));
		ele21122.sendKeys("zoudoppuddoza-9266@yopmail.com");
		Thread.sleep(2000);
		
		WebElement ele2122 = driver.findElement(By.id("BillingNewAddress_Company"));
		ele2122.sendKeys("ABC Ltd.");
		Thread.sleep(2000);
		
		WebElement ele1112 = driver.findElement(By.name("BillingNewAddress.CountryId"));
		Select slt1112 = new Select(ele1112);
		slt1112.selectByValue("133");
		Thread.sleep(2000);
		

		WebElement ele212 = driver.findElement(By.id("BillingNewAddress_City"));
		ele212.sendKeys("Delhi");
		Thread.sleep(2000);
		
		WebElement ele101 = driver.findElement(By.id("BillingNewAddress_Address1"));
		ele101.sendKeys("Delhi 92");
		Thread.sleep(2000);
		
		
		WebElement ele102 = driver.findElement(By.id("BillingNewAddress_Address2"));
		ele102.sendKeys("Delhi 110092 ");
		Thread.sleep(2000);
		
		WebElement ele103 = driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_ZipPostalCode\"]"));
		ele103.sendKeys("110092 ");
		Thread.sleep(2000);
		
		
		WebElement ele104 = driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_PhoneNumber\"]"));
		ele104.sendKeys("123456789 ");
		Thread.sleep(2000);
		
		//*[@id="shipping-method-buttons-container"]/button
		
		driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/button[4]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/button")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//*[@id=\"payment-method-buttons-container\"]/button")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//*[@id=\"payment-info-buttons-container\"]/button")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"confirm-order-buttons-container\"]/button")).click();
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//*[@id=\"confirm-order-buttons-container\"]/button")).click();
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div/div[3]/button")).click();
		
		
		
		driver.close();
		ScreenRecorderUtil.stopRecord();
	}

}
