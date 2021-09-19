package webdrivermethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class tester4 {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://demo.actitime.com/");
        String ExpectedTitle = "actiTIME - Login";
        String ActualTitle = driver.getTitle();
        System.out.println("ExpectedTitle="+ExpectedTitle);
        System.out.println("AcualTitle="+ActualTitle);
        
        if(ActualTitle.equals(ExpectedTitle)){
        	System.out.println("PASS:: Login page title is correct");
        }
        else {
        System.out.println("FAIL:: Login page title is incorrect");
        }
        String expectedurl = "https://demo.actitime.com/login.do";
        String actualurl = driver.getCurrentUrl();
        System.out.println("expectedurl="+expectedurl);
        System.out.println("actualurl="+actualurl);
        if(actualurl.equals(expectedurl)) {
        	System.out.println("PASS::Login page url is correct");
        }
        else {
        	System.out.println("FAIL::Login page url is incorrect");
        }
      driver.close();
	}

}
