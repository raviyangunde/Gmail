package webdrivermethods;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
//WAS to transfer the driver control to 3rd window and then to 2nd window
public class Tester16 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.naukri.com/");
        
        Set<String> allwindowIds = driver.getWindowHandles();
        
        List<String> allwindowIdlists = new ArrayList<String>(allwindowIds);
        
        String windowId3 = allwindowIdlists.get(2);
        driver.switchTo().window(windowId3);
        System.out.println(driver.getTitle());
        
        String windowId2 = allwindowIdlists.get(1);
        driver.switchTo().window(windowId2);
        System.out.println(driver.getTitle());
        
        driver.quit();

	}

}
