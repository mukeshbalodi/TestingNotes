package Test;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;


public class Desktop_App {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		DesktopOptions option = new DesktopOptions();
		option.setApplicationPath("C:\\Windows\\System32\\calc.exe");
		WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999"), option);
		Thread.sleep(2000);

		driver.findElement(By.name("Seven")).click();
		driver.findElement(By.name("Plus")).click();
		driver.findElement(By.name("Six")).click();
		driver.findElement(By.name("Equals")).click();
		
		String output= driver.findElement(By.id("CalculatorResults")).getAttribute("Display is 15");
		System.out.println("Resultb is :"+output);

		driver.close();

	}

}
