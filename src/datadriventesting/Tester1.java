package datadriventesting;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Tester1 {

	public static void main(String[] args) throws Exception {
		
		String xlfilepath = "./resources/TestData.xlsx";
		
		FileInputStream fin = new FileInputStream(xlfilepath);
		
		Workbook workbook = WorkbookFactory.create(fin);
		
		String username = workbook.getSheet("sheet1").getRow(1).getCell(1).getStringCellValue();
		
		System.out.println("username");

	}

}
