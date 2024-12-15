package excelHandling_By_Amar_sir;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data_By_Amar_Sir {


	public static String readData(String sheet_name, int row_num, int cell_num) throws IOException
	{
		String path = "C:\\Users\\Sandeep Kushawaha\\OneDrive\\Desktop\\ReadData_Excel.xlsx";
		
		File file = new File(path);		
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = wb.getSheet(sheet_name);
		
		String data = sheet.getRow(row_num).getCell(cell_num).getStringCellValue();
		
		return data;
	}
}
