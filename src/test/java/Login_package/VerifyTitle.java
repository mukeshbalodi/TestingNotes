package Login_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTitle {
	WebDriver driver;

	@BeforeTest
	public void setup() throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");

		driver.manage().window().maximize();
		Thread.sleep(3000);
	}

	@Test
	public void title() {
		String expectedTitle = "Swag Labs";

		String actualtitle = driver.getTitle();

		if (expectedTitle.equals(actualtitle)) {
			System.out.println("title is correct");
		} else {
			System.out.println("Title is wrong");
		}

	}

	@AfterTest
	public void teardown() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}

}