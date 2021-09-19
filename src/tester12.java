import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class tester12 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		Point currentpoint = driver.manage().window().getPosition();
		
		int x = currentpoint.getX();
		
		int y = currentpoint.getY();
		
		System.out.println("x="+x);
		System.out.println("y="+y);
		
		driver.quit();

	}

}
