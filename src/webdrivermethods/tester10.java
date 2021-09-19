package webdrivermethods;

import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class tester10 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Window window = driver.manage().window();
		
		window.maximize();
	
	    Thread.sleep(5000);
		
	    window.fullscreen();
	    
	    Thread.sleep(5000);
	    
	    driver.quit();
	    

	}

}
