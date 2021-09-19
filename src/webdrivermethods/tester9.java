package webdrivermethods;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class tester9 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.licindia.in/");
		String expectedtitle = "Life Insurance Corporation of India - Home";
		String actualtitle = driver.getTitle();
		 System.out.println("expected title is"+expectedtitle);
		 System.out.println("actual title is"+actualtitle);
		 if(actualtitle.equals(expectedtitle)) {
			 System.out.println("PASS::the title is correct");
		 }
		 else {
			 System.out.println("FAIL:: the title is not correct");
		 }
		 String expectedurl = "https://www.licindia.in/";
		 String actualurl = driver.getCurrentUrl();
		 System.out.println("expected url is"+expectedurl);
		 System.out.println("actual url is"+expectedurl);
		 if(actualurl.equals(expectedurl)) {
			 System.out.println("PASS::the url is correct");
		 }
		 else {
			 System.out.println("FAIL::the url is mot correct");
		 }
		 
		 Navigation navigation = driver.navigate();
		 navigation.to("https://www.licindia.in/Guidelines/Be-a-Corporate-Agent");
		 
		 String Expectedtitle = "Life Insurance Corporation of India - Be a Corporate Agent";
			String Actualtitle = driver.getTitle();
			 System.out.println("expected title is"+Expectedtitle);
			 System.out.println("actual title is"+Actualtitle);
			 if(Actualtitle.equals(Expectedtitle)) {
				 System.out.println("PASS::the title is correct");
			 }
			 else {
				 System.out.println("FAIL:: the title is not correct");
			 }
			 
			 String Expectedurl = "https://www.licindia.in/Guidelines/Be-a-Corporate-Agent";
			 String Actualurl = driver.getCurrentUrl();
			 System.out.println("expected url is"+Expectedurl);
			 System.out.println("actual url is"+Expectedurl);
			 if(Actualurl.equals(Expectedurl)) {
				 System.out.println("PASS::the url is correct");
			 }
			 else {
				 System.out.println("FAIL::the url is mot correct");
			 }
			 
			 
	}
}		 
			 

