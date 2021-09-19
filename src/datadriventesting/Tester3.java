package datadriventesting;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Tester3 {

	public static void main(String[] args) throws Exception {
		
		String xlpathfile = "./resources/TestData.xlsx";
		FileInputStream fin = new FileInputStream(xlpathfile);
		Workbook workbook = WorkbookFactory.create(fin);
		Sheet sheet = workbook.getSheet("sheet3");
		
		int rowcount = sheet.getPhysicalNumberOfRows();
		int cellcount = sheet.getRow(0).getPhysicalNumberOfCells();
		
		System.out.println(rowcount);
		System.out.println(cellcount);
	
		for(int i=0; i<=rowcount-1; i++) {
			for(int j=0; j<=cellcount-1; j++) {
				System.out.print(sheet.getRow(i).getCell(j).toString()+" :: ");
			}
			System.out.println();
		}

	}

}
