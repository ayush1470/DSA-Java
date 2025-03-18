import java.sql;
class Database1{
    public static void main(String args[]){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/","root","root");
            Statement atmt=con.createStatement();
            stmt.execute("create database")
        }
    }
}