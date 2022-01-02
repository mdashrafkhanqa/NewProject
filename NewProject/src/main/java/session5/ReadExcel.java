package session5;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {
	
	@Test
	public void readExcel() throws InvalidFormatException, IOException {

		// Read the file
		XSSFWorkbook wbook = new XSSFWorkbook(new File("./data/Login.xlsx"));

		// go to first sheet
		XSSFSheet sheet1 = wbook.getSheet("Sheet1");

		int rowCount = sheet1.getLastRowNum();
		int columnCount = sheet1.getRow(0).getLastCellNum();
		
		System.out.println("Row Count: "+rowCount);		
		System.out.println("Column Count: "+columnCount);
		// go to the row

		// go to the cell 1

		for (int i = 1; i <= rowCount; i++) {

			XSSFRow row1 = sheet1.getRow(i);

			for (int j = 0; j < columnCount; j++) {
				XSSFCell cell = row1.getCell(j);
				System.out.println(cell.getStringCellValue());
			}

		}

	}


}
