package leaveaddd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.tomcat.dbcp.dbcp2.PStmtKey;

public class CostomerDBUtil {
	
	
public static boolean insertcustomer(String staffmid, String name, String leavetype, String startdate, String enddate,String assignamem,String askapp) {
    	
    	boolean isSuccess = false;
    	String url="jdbc:mysql://localhost:3306/hotel";
		String user= "root";
		String password="";
    	try {
              Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection(url,user,password);
			Statement stmt=con.createStatement();
    		
    	    String sql = "insert into customer values ('"+staffmid+"','"+name+"','"+leavetype+"','"+startdate+"','"+enddate+"','"+assignamem+"','"+askapp+"')";
    		int rs = stmt.executeUpdate(sql);
    		
    		if(rs > 0) {
    			isSuccess = true;
    		} else {
    			isSuccess = false;
    		}
    		
    	}
    	catch (Exception e) {
    		e.printStackTrace();
    	}
 	
    	return isSuccess;
    }

}
