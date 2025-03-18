import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


class MySqlConnW{
    public static void main(String args[]){
        try{
            //1. Load driver
            Class.forName("com.mysql.cj.jdbc.Driver");  //com.mysql.cj.jdbc.Driver
            //2. Create connection
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","abcd1234");
            //3. Create/Prepare statement/query
            Statement stmt=con.createStatement();
            //4. Execute the statement
            ResultSet rs=stmt.executeQuery("select * from student");
            //   Display result
            if (rs !=null)
                System.out.println("\nData:");
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            //5. Close connection
            con.close();
        }catch(Exception e){ System.out.println(e);}
    }// End Main
}// End Class