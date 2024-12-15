package excelHandlingPractise;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHandingPractise2 {

	public static void main(String[] args) throws IOException {
		
		String path = "C:\\Users\\Sandeep Kushawaha\\OneDrive\\Desktop\\ReadData_Excel.xlsx";
		
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		XSSFRow row = sheet.getRow(0);
		XSSFCell cell = row.getCell(2); 
		String data = cell.getStringCellValue();
		System.out.println(data);
		

	}

}
