package twitterTest;

import com.sugat.twitter.utils.ExcelReader;

public class twitExcelReader {

	public static void main(String[] args) {
		
		System.out.println(System.getProperty("user.dir"));
		ExcelReader excel = new ExcelReader(System.getProperty("user.dir")+"\\src\\com\\sugat\\twitter\\testdata\\testdata.xlsx");
		
		String sheetName="Sheet1";
		for(int rownum=2;rownum<=excel.getRowCount(sheetName);rownum++){
			System.out.println(excel.getCellData(sheetName, "test_case", rownum));
			
		}

	}

}
