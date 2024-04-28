package checkbox;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Demo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		driver.manage().window().maximize();
		
		List<WebElement> chk = driver.findElements(By.xpath("//input[@type= 'checkbox']"));
		
		for (WebElement vl : chk) {
			Thread.sleep(2000);
			vl.click();
		}
		
		driver.close();
	}

}
