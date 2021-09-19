package webdrivermethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class tester5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://demo.actitime.com/");
		 String expectedtext = "Please identify yourself";
		 String source = driver.getPageSource();
		  if(source.contains(expectedtext)) {
			  System.out.println("PASS:: the text is present");
		  }
		  else {
			  System.out.println("FAIL:: the text is not present");
		  }
		 driver.close();
		 

		}

	
	}


