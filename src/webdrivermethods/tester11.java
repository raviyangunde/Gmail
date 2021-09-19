package webdrivermethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class tester11 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
	    Dimension currentwindowsize = driver.manage().window().getSize();
	    
	    int width = currentwindowsize.getWidth();
	    int height = currentwindowsize.getHeight();
	    
	    System.out.println("width="+width);
	    System.out.println("height="+height);
	    
	    driver.quit();

	}

}
