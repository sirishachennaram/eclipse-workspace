package jdbcapp1;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

public class AddEmployee {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String driver,url,user,password;
		driver ="com.mysql.cj.jdbc.Driver";
		url ="jdbc:mysql://localhost:3306/edb1_12980";
        user ="root";
        password ="root";
        String sql ="insert into employee values(?,?,?,?,?)";
        
        //1.Loading driver
        Class.forName(driver);
        
        //2. Establish Connection
        Connection con = DriverManager.getConnection(url,user,password);
        
        //3.create Statement object.
       PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1,1005);
        ps.setString(2, "krish");
        ps.setString(3, "krish@gmail.com");
        ps.setLong(4, 99887766558L);
        ps.setString(5,"M");
        
        //4.Execute Insert sql query
        
        int status= ps.executeUpdate(); //For DML Operators
        if(status>= 1) {
        	System.out.println("new employee is added");
        }else {
        	System.out.println("failed");
        }
        //5. close resources
        ps.close();
        con.close();
        	
        	
        	
        	
        	
        }
}
        
        
        
