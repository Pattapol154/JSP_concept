package test.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnDB {
    public ConnDB() {
        super();
    }
    
    public static void main(String args[]){  
        ConnDB testConn=new ConnDB();
        
        System.out.println("-------------------");
        
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@10.12.11.217:1521:orcl","tranning","tranning");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from USERS");  
            while(rs.next())  
            System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            con.close(); 
        }catch (Exception e){
            System.out.println(e);
        	}
	}
}
