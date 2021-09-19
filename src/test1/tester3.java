package test1;

import org.openqa.selenium.opera.OperaDriver;

public class tester3 {

	public static void main(String[] args) {
	  System.setProperty("webdriver.opera.driver", "./drivers/operadriver.exe");
	  OperaDriver driver = new OperaDriver();
	}

}
