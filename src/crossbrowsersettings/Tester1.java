package crossbrowsersettings;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Tester1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.opera.driver", "./drivers/operadriver.exe");
		
		Factory.test(new ChromeDriver());
		Factory.test(new FirefoxDriver());
		Factory.test(new OperaDriver());

	}

}
