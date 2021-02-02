package test;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import entity.EntityMgmt;
import entity.ExcelConstant;



public class ExcelReader 
{
		private EntityMgmt em = new EntityMgmt();
		
		public static HashSet<String> testCaseIds = new HashSet<String>() ; 
		
		public void readExcel() throws IOException 
		{
			File src = new File("C:\\Users\\Ravinder Singh\\Desktop\\Esewa_data_sheet_demo.xlsx");
			
			FileInputStream f = new FileInputStream(src);
			XSSFWorkbook wb = new XSSFWorkbook(f);
							
			int totalSheet = wb.getNumberOfSheets();
			
			for(int sheetCount=0; sheetCount < totalSheet; sheetCount++)
			{
				XSSFSheet sheet = wb.getSheetAt(sheetCount);
				String sheetName = sheet.getSheetName();

				int rowcount = sheet.getLastRowNum() - sheet.getFirstRowNum();

				XSSFRow row = sheet.getRow(sheetCount);

				for (int i = 0; i < rowcount + 1; i++) 
				{
					// create getter & setter Object
					
					if(sheetName.equalsIgnoreCase(ExcelConstant.PROFILE_SERVICE_SHEET))
						
						/*
						 * if (row.getCell(1).getStringCellValue()!= "")
						 * System.out.println(testCaseIds.add(row.getCell(1).getStringCellValue()));
						 */				
					em.createProfileEntity(row);
					
					{
					
					}
				}
			}
		}


}

		/*	Oper_usrname = wb.getSheetAt(3).getRow(2).getCell(1).getStringCellValue();   //Get operator username 
			Oper_passwd = wb.getSheetAt(3).getRow(2).getCell(2).getStringCellValue();
		
			Oper_depart = wb.getSheetAt(1).getRow(1).getCell(2).getStringCellValue();
			Appcnt_first_name = wb.getSheetAt(9).getRow(1).getCell(4).getStringCellValue();
			Appcnt_first_Father_name = wb.getSheetAt(9).getRow(1).getCell(7).getStringCellValue();
			Appcnt_first_Mother_name = wb.getSheetAt(9).getRow(1).getCell(10).getStringCellValue();
		
			Appcnt_address =wb.getSheetAt(9).getRow(1).getCell(15).getStringCellValue();
			Appcnt_State =wb.getSheetAt(9).getRow(1).getCell(16).getStringCellValue();
			Appcnt_district =wb.getSheetAt(9).getRow(1).getCell(17).getStringCellValue();
			Appcnt_tehsil =wb.getSheetAt(9).getRow(1).getCell(18).getStringCellValue();
			Appcnt_region =wb.getSheetAt(9).getRow(1).getCell(19).getStringCellValue();*/
		//	Appcnt_pincode =(int) wb.getSheetAt(9).getRow(1).getCell(20).getNumericCellValue();
			
			
				
		    

				
