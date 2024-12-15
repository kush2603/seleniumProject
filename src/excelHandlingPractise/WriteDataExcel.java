package excelHandlingPractise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataExcel {
	
	public static void writeData() throws IOException
	{
		String path = "\"D:\\excel_Docs\\ReadData_Excel.xlsx";
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
	    XSSFSheet sheet = wb.getSheet("Sheet1");
	    XSSFRow row = sheet.getRow(1);
	    //to create cell
		XSSFCell cell = row.createCell(4);
		cell.setCellValue("pass");
		
		//we want output of our data
		
		FileOutputStream fos = new FileOutputStream(file);
		wb.write(fos);
	}

	public static void main(String[] args) throws IOException {
		
		WriteDataExcel.writeData();

	}

}
