package entity;

import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFRow;

import profileentity.Profileclass;


public class EntityMgmt {

	private static Map<String, Profileclass>profileDataMap = new HashMap<String, Profileclass>();
	
	public void createProfileEntity(XSSFRow row) 
	{
		int columnIndex = 1; 
		
		Profileclass pfentity = new Profileclass();
		
		String testCaseid = row.getCell(columnIndex++).getStringCellValue();
		
		pfentity.setTestCaseid(testCaseid);
		pfentity.setTestSummary(row.getCell(columnIndex++).getStringCellValue());
        
		String TestSummary =row.getCell(columnIndex++).getStringCellValue();
				
		String actorType =row.getCell(columnIndex++).getStringCellValue();
		pfentity.setactorType(row.getCell(columnIndex++).getStringCellValue());
		
		String value = testCaseid + TestSummary+ actorType;
		
		profileDataMap.put(value, pfentity);
				
		
	}
}
