package webdrivermethods;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class tester8 {

	public static void main(String[] args) {
	   System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	   ChromeDriver driver = new ChromeDriver();
	   driver.get("https://www.licindia.in/");
	   Navigation navigation = driver.navigate();
	   
	  navigation.to("https://www.licindia.in/Guidelines/Be-a-Corporate-Agent");
	  

	}

}
