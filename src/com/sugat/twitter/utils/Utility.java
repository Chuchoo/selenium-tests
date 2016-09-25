package com.sugat.twitter.utils;

public class Utility {
	
	public static boolean isExecutable(String test_name,ExcelReader excel){
		
		String sheetName="Sheet1";
		for(int rownum=2;rownum<=excel.getRowCount(sheetName);rownum++){
			
			if(excel.getCellData(sheetName, "test_case", rownum).equals(test_name)){
				
			if(excel.getCellData(sheetName, "runmode", rownum).equalsIgnoreCase("Y"))				
					return true;
				else
					return false;	
			}
			
		}
		return false;
	}
}