package crossbrowsersettings;

import org.openqa.selenium.WebDriver;

public class Factory {

	public static void test(WebDriver driver) {
		driver.get("https://google.com/");
		driver.manage().window().maximize();
		
		String expectedtitle = "google";
		String actualtitle = driver.getTitle();
		
		System.out.println("expectedtitle="+expectedtitle);
		System.out.println("actualtitle="+actualtitle);
		
		if(actualtitle.equals(expectedtitle)) {
			System.out.println("PASS:: the title is correct");
		}
		else {
			System.out.println("FAIL:: title is not correct");
		}
		
		String expectedurl = "https://google.com/";
		String actualurl = driver.getCurrentUrl();
		
		System.out.println("expectedurl="+expectedurl);
		System.out.println("actualurl="+actualurl);
		
		if(actualurl.equals(expectedurl)) {
			System.out.println("PASS:: the url is correct");
		}
		else {
			System.out.println("FAIL:: url is not correct");
		}
		
		driver.quit();
		

	}

}
