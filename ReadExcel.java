package testNG.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		//setup excel doc path
		XSSFWorkbook wb = new XSSFWorkbook("./Data/CreateLead.xlsx");
		//setup worksheet
		XSSFSheet sheet = wb.getSheet("Sheet1");
		//Find no of rows in a sheet
		int rowCount = sheet.getLastRowNum();
		System.out.println("rowCount is " + rowCount );
		//Get no of cells in row1
		short cellCount = sheet.getRow(0).getLastCellNum();
		System.out.println("cellCount is " + cellCount );
		//Print all cell values from sheet
		for (int i = 1; i <= rowCount; i++) {
			for (int j = 0; j < cellCount; j++) {
				String text = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(text+" ");
			}
			System.out.println();
		}
		wb.close();
	}
}
