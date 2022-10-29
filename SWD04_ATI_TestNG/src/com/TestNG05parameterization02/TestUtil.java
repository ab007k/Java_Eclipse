package com.TestNG05parameterization02;

import java.util.ArrayList;

public class TestUtil {
	public static ArrayList<Object[]>getDataFromExcel(){
		ArrayList<Object[]> myData=new ArrayList<Object[]>();
		
		Xls_Reader reader = new Xls_Reader("./data/ActiTimeTestData.xlsx");	
			
		String uname=reader.getCellData("validcreds", "Username", 2);
		String pword=reader.getCellData("validcreds", "Password", 2);
		
		Object ob []= {uname,pword};
		
		myData.add(ob);
		return myData;
		
	}

}
