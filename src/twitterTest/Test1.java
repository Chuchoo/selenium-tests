package twitterTest;

import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.sugat.twitter.utils.ExcelReader;
import com.sugat.twitter.utils.Utility;

public class Test1 {	
	
	@BeforeTest
	public void setUp(){
		ExcelReader excel = new ExcelReader(System.getProperty("user.dir")+"\\src\\com\\sugat\\twitter\\testdata\\testdata.xlsx");
		if(!(Utility.isExecutable("validateRegistration", excel))){
			throw new SkipException("Skipping the test because runmode is NO.");
		}		
	}	

	
	@Test
	public void doLogin(){
		System.out.println("I am logging in...");
	}
	
	
}
