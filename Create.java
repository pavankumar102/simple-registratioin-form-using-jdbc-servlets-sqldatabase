import java.sql.*;
public class Create
{
        public static void main(String[] args) throws Exception 
         {
             String driver="oracle.jdbc.driver.OracleDriver";
             String jdbc_url="jdbc:oracle:thin:@localhost:1521:xe";
             String user="system";
             String pwd="root";
	     String sql_query="create table register(name varchar2(15),age number,email varchar2(21),password varchar2(8),Confirmpassword varchar2(15))";
             Class.forName(driver);
             Connection con = DriverManager.getConnection(jdbc_url,user,pwd);
             Statement st = con.createStatement();
             st.executeUpdate(sql_query);
             System.out.println("Table is created successfully");
             con.close();
        }
}
             