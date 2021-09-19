package Takesscreenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester1 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		
		driver.get("https://en-gb.facebook.com/");

		File tempFile = driver.findElement(By.xpath("//input[@type='text']/../../..")).getScreenshotAs(OutputType.FILE); 
		
		File destFile = new File ("./errorshots/FBloginPannel"+".png");
		FileUtils.copyFile(tempFile, destFile);
		driver.quit();
	



	}	

}
