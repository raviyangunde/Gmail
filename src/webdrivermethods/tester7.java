package webdrivermethods;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class tester7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.licindia.in/");
		
		driver.get("https://www.wikipedia.org/");
		
		Navigation navigation = driver.navigate();
		
		navigation.back();
		
		navigation.forward();
		
		navigation.refresh();

	}

}
