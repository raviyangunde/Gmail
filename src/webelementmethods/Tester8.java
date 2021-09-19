package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester8 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		
		driver.findElement(By.id("login_Layer")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("input[placeholder = 'Enter your active Email ID / Username']")).sendKeys("raviyangunde@gmail.com");

	}

}