package webdrivermethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class tester6 {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://www.flipkart.com/");
		 String expectedtext ="Get access to your Orders, Wishlist and Recommendations";
		 String source = driver.getPageSource();
	        if(source.contains(expectedtext)) {
	        	System.out.println("PASS::the text is present");
	        }
	        else {
	        	System.out.println("FAIL::the text is not present");
	        }
	        driver.close();
		}

	

	}


