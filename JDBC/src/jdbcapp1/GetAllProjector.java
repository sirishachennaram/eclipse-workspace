package jdbcapp1;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

public class GetAllProjector{

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String driver,url,user,password;
		driver ="com.mysql.cj.jdbc.Driver";
		url ="jdbc:mysql://localhost:3306/edb1_12980";
        user ="root";
        password ="root";
        String sql ="select * from projector";
        
        //1.Loading driver
        Class.forName(driver);
        
        //2. Establish Connection
        Connection con = DriverManager.getConnection(url,user,password);
        
        //3.create Statement object.
        Statement st = con.createStatement();
        
        //4.Execute sql query
       ResultSet rs = st.executeQuery(sql);
       
       while(rs.next()) {
    	   System.out.println(rs.getInt("id"));
    	   System.out.println("Brand:"+rs.getString("Brand"));
    	   System.out.println("Model:"+rs.getString("Model"));
    	   System.out.println("Resolution:"+rs.getString("Resolution"));
    	   System.out.println("Brightness:"+rs.getString("Brightness"));
    	   System.out.println("................................");
       }
       //5.close resources
       rs.close();
       st.close();
       con.close();
        
        
	}

}
