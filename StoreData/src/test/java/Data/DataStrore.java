package Data;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataStrore {
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		Workbook work=new XSSFWorkbook();
		Sheet sheet=work.createSheet("DataSheet");
		//create row and cell
		
		Row row=sheet.createRow(0);
		row.createCell(0).setCellValue("ram");
		row.createCell(1).setCellValue("Age");
		row.createCell(2).setCellValue("city");
		
		Row row1=sheet.createRow(1);
		row1.createCell(0).setCellValue("ramudu");
		row1.createCell(1).setCellValue(25);
		row1.createCell(2).setCellValue("ATP");
		String filepath="E:\\Rockey\\excel.xlsx";
		try(FileOutputStream out=new FileOutputStream(filepath))
		{
			work.write(out);
			work.close();
			System.out.println("Excel file written successfully");
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}

}
