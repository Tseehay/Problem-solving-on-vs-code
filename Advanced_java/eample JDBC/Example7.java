import java.sql.*;  
class TCommit1{  
public static void main(String args[])throws Exception{  
    try
    {
 Class.forName("com.mysql.jdbc.Driver");
 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root"); 
 con.setAutoCommit(false);  

Statement stmt=con.createStatement();  
stmt.executeUpdate("insert into stud values('r/106/08','Lami','Male','ICT')");  
stmt.executeUpdate("insert into stud values('r/107/08','Abebe','Male','Electrical')");  
con.rollback();
con.commit();  
con.close(); 
   }
 catch(Exception e)
  {
     e.printStackTrace();
  }
}
}