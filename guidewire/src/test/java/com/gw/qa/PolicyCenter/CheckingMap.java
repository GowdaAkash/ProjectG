package com.gw.qa.PolicyCenter;

import java.util.Map;

import com.gw.qa.base.ReadExcelSheet;

   
public class CheckingMap {
	
public static void main(String[] args) throws Exception {
	String projectpath=System.getProperty("user.dir");
	Map<String,String> TestDataInMap=ReadExcelSheet.getTestDataInMap(projectpath+"\\src\\main\\java\\com\\gw\\qa\\testdata\\Test data.xlsx", "CreateAccount", "TC_001");
	 
	

}
}
