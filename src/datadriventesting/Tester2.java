package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Date;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Tester2 {

	public static void main(String[] args) throws Exception {
		
		String xlfilepath = "./resources/TestData.xlsx";
		
		FileInputStream fin =new FileInputStream(xlfilepath);
		
		Workbook workbook = WorkbookFactory.create(fin);
		
		double ravi = workbook.getSheet("sheet2").getRow(1).getCell(1).getNumericCellValue();
		
		System.out.println(ravi);
		
		boolean bvalue = workbook.getSheet("sheet2").getRow(1).getCell(2).getBooleanCellValue();

		System.out.println(bvalue);
		
		Date dob = workbook.getSheet("sheet2").getRow(1).getCell(3).getDateCellValue();
		
		System.out.println(dob);
	}

}
