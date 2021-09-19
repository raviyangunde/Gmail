package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester4 {

	public static void main(String[] args) throws Exception {
		String xlpathfile = "./resources/TestData.xlsx";
		FileInputStream fin = new FileInputStream(xlpathfile);
		Workbook workbook = WorkbookFactory.create(fin);
		
		Sheet sheet = workbook.getSheet("sheet3");
		
		int rowcount = sheet.getPhysicalNumberOfRows();
		int cellcount = sheet.getRow(0).getPhysicalNumberOfCells();
		
		System.out.println(rowcount);
		System.out.println(cellcount);
		
		 String[][] sarr = new String[rowcount][cellcount];
		
		for(int i=0; i<=rowcount-1; i++) {
			for(int j=0; j<=cellcount-1; j++) {
				sarr[i][j]=sheet.getRow(i).getCell(j).toString();
			}
		}
		for(int i=0; i<=sarr.length-1; i++) {
			
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.actitime.com/");
		
		driver.findElement(By.id("username")).sendKeys(sarr[i][0]);
		driver.findElement(By.name("pwd")).sendKeys(sarr[i][1]);
		
		
		
		}
		
		
		
		

	}

}
