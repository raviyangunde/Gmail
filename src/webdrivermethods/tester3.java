package webdrivermethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class tester3 {

	public static void main(String[] args) {
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  ChromeDriver driver = new ChromeDriver();
	  driver.get("https://www.google.com/");
	  String title = driver.getTitle();
	  System.out.println("the webpage title is "+title);
	  String url = driver.getCurrentUrl();
	  System.out.println("the webpage Url is "+url);
	  
	 
     driver.close();
	}
}
