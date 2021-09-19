package datadriventesting;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Tester5 {

	public static void main(String[] args) throws Exception {
		
		String filepath = "./resources/config.properties";
		
		FileInputStream fin = new FileInputStream(filepath);
		
		Properties prop = new Properties();
		
		prop.load(fin);
		
		String chromedriverkey = prop.getProperty("chromekey");
		String chromedriverpath = prop.getProperty("chromepath");
		String appurl = prop.getProperty("appurl");
		
		System.out.println(chromedriverkey);
		System.out.println(chromedriverpath);
		System.out.println(appurl);
		
		System.setProperty(chromedriverkey, chromedriverpath);
		WebDriver driver = new ChromeDriver();
		driver.get(appurl);
		

	}

}
