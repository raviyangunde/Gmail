package webdrivermethods;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class Tester15 {

	public static void main(String[] args) {
         System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
         ChromeDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://www.naukri.com/");
         
         String parentwindow = driver.getWindowHandle();
         
         Set<String> allwindowids = driver.getWindowHandles();
         
         for(String wid:allwindowids) {
        	 driver.switchTo().window(wid);
        	 
        	 String actualtitle = driver.getTitle();
        	 
        	 if(actualtitle.equals("Tech Mahindra")) {
        		 break;
        	 }
        	 
         }
         System.out.println(driver.getTitle());
         System.out.println(driver.getCurrentUrl());
         driver.close();
         
         driver.switchTo().window(parentwindow);
         System.out.println(driver.getTitle());
         System.out.println(driver.getCurrentUrl());
         driver.close();

	}

}
