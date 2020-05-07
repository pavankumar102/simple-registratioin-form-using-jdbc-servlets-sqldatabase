import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Insert extends HttpServlet
{
             public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
              {
                     res.setContentType("text/html");
                     PrintWriter out=res.getWriter();
                     String name=req.getParameter("t1");
		     String age=req.getParameter("t2");
                     String email=req.getParameter("t3");
		     String password=req.getParameter("t4");
                     String confirmPassword=req.getParameter("t5");
                     
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
PreparedStatement ps=con.prepareStatement("insert into register values(?,?,?,?,?)");
ps.setString(1,name);
ps.setString(2,age);
ps.setString(3,email);
ps.setString(4,password);
ps.setString(5,confirmPassword);
ps.executeUpdate();
con.close();
}
catch (Exception e2)
  {
  out.println(e2);
  }
                     out.println("<html>");
		     out.println("<body bgcolor=orange>");
                     out.println("<h1> registration is successfull</h1>");
                     out.println("</body>");
                     out.println("</html>");
          }
 
}


