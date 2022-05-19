package testUtility;

import java.util.ArrayList;

import excelUtility.Xls_Reader;

public class TestUtil {
	static Xls_Reader reader;

	public static ArrayList<Object[]> getDataFromExcel() {
		
		ArrayList<Object[]> myData=new ArrayList<Object[]>();
		
		try {
			reader=new Xls_Reader("D:\\@Qspider\\Java_Eclipse\\SWD_NA3_DDF3_TestNG\\src\\testData\\HalfEbayTestData.xlsx");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		for(int rowNum=2;rowNum<=reader.getRowCount("RegTestData");rowNum++) {
			String FirstName=reader.getCellData("RegTestData","FirstName",rowNum);
			
			String LastName=reader.getCellData("RegTestData","LastName",rowNum);
			
			String Email=reader.getCellData("RegTestData","Email",rowNum);
			
			String Password=reader.getCellData("RegTestData","Password",rowNum);	
			
			Object ob []= {FirstName,LastName,Email,Password};
			
			myData.add(ob);
		}
		return myData;
	}

}
