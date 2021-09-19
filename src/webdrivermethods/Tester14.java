package webdrivermethods;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class Tester14 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/");
		
		Set<String> allwindowids = driver.getWindowHandles();
		
		for(String s:allwindowids) {
		driver.switchTo().window(s);
		//verifying the browser title to be "Tech Mahindra"
		String actualtitle = driver.getTitle();
		if(actualtitle.equals("Tech Mahindra")) {
			break; //breaking the loop so that the driver control remains in the Tech Mahindra for further automation on it
		}
		}
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		driver.close();//closes only the Tech Mahindra browser window

	

	}
}