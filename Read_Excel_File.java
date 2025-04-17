package java_Program;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;


import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Excel_File {
	public static void main(String[] args)throws IOException {
		


  String excelfile=System.getProperty("user.dir");
		//FileInputStream fis = new FileInputStream(excelfile+"/ReadFileWithSelenium");

	
  XSSFWorkbook  workbook =new XSSFWorkbook(excelfile+"/ReadFileWithSelenium.xlsx");

		 Sheet s = workbook.getSheet("Sheet1");

		 String value = s.getRow(0).getCell(0).getStringCellValue();
		 System.out.println(value);
		 
workbook.close();

	
	}

	
	}



