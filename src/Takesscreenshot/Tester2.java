package Takesscreenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://licindia.in/");
		File tempFile=driver.findElement(By.xpath("//img[contains(@class,'slidesjs-slide')]")).getScreenshotAs(OutputType.FILE);
		File destFile = new File ("./errorshots/LIC"+".png");
		FileUtils.copyFile(tempFile, destFile);
		driver.quit();


	}

}
