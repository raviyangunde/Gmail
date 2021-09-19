package webdrivermethods;

import java.util.Set;

import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;

public class tester13 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/");
		//	//we are storing all the browser window Ids in the set<string> reference variable
		Set<String> allwindowids = driver.getWindowHandles();
	    //Fetching each window id iteratively to transfer the control
		for(String wid:allwindowids) {
			//code to transfer the driver control
			driver.switchTo().window(wid);
			//printing the title iteratively
			System.out.println(driver.getTitle());
		}

	}

}
