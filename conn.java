
package employeeproject;
import java.sql.*;

public class conn {
    

   
        public Connection con = null;
          public Statement s = null;
        public conn()
        {
            try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:8111/mpl_project","root"," ");
            s=con.createStatement();
        }catch(Exception e)
        {
          System.out.println("Exception occur" +e)  ;
        }
    }
}


