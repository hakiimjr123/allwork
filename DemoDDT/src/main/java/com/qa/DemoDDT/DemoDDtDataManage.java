package com.qa.DemoDDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DemoDDtDataManage {
	private static XSSFSheet DemoDataSheet;

	private static XSSFWorkbook DemoWBook;

	private static XSSFCell demoCell;

	private static XSSFRow demoRow;
	
	private static FileInputStream	file;
	
	public static void DataManage(String Path, int sheetIndex ) {
		
	try {
		file = new FileInputStream(Path);
	
			DemoWBook = new XSSFWorkbook(file);
		
		
		DemoDataSheet = DemoWBook.getSheetAt(sheetIndex); 
		
	}catch (Exception e) {
		e.printStackTrace();
	}
	}
	public static XSSFSheet getDemoDataSheet(){
		return DemoDataSheet;
		
	}
	public static String getCellData(int Rownum, int Colnum) {
		
		try {
			demoCell = DemoDataSheet.getRow(Rownum).getCell(Colnum);
			String CellData = demoCell.getStringCellValue();
			return CellData;
		} catch (Exception e) {

			e.printStackTrace();
			return "";
		}
		
	}
	
	public static void setCellData(String Result, int Rownum, int Colnum) {
		
	try {
		demoRow = DemoDataSheet.getRow(Rownum);
		demoCell = demoRow.getCell(Colnum, MissingCellPolicy.RETURN_BLANK_AS_NULL);
		
		if (demoCell == null) {
			demoCell = demoRow.createCell(Colnum);
			demoCell.setCellValue(Result);
		}else{
			demoCell.setCellValue(Result);
		}
		FileOutputStream fileOut = new FileOutputStream(ConstantsDemo.Path_DemoData + ConstantsDemo.File_DemoData);

		DemoWBook.write(fileOut);

		fileOut.flush();

		fileOut.close();

	} catch (Exception e) {

		e.printStackTrace();
		}
	}	
		
		
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
