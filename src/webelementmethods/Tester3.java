package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;


public class Tester3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.opera.driver", "./drivers/operadriver.exe");
		WebDriver driver = new OperaDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		
		driver.findElement(By.className("dismiss")).click();

	}

}
