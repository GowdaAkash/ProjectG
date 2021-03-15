package com.gw.qa.PolicyCenter;



import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class checkingfillo {

	public static void main(String[] args) throws FilloException {
		String projectpath=System.getProperty("user.dir");
	Fillo fillo=new Fillo();
	Connection conn=fillo.getConnection(projectpath+"\\src\\main\\java\\com\\gw\\qa\\testdata\\PCTestDataSheet.xlsx");
	String query="Select * from PC_AccountCreation";
	 Recordset rs = conn.executeQuery(query);
       while(rs.next())
       {
    	   System.out.println(rs.getField("Account Name"));
       }
       rs.close();
       conn.close();
	}

}
