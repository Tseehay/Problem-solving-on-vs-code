import java.sql.*;  
    class InsertRecord{  
    public static void main(String args[])throws Exception{  
      try
      {
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student",
                  "root","root");   
    Statement stmt=con.createStatement();  
      
    //int result=stmt.executeUpdate("insert into stud values('r/104/08','Ibrahim','Male','Economics')");  
    //int result=stmt.executeUpdate("update stud set Name='Jemal' where id='r/104/08'");  
    int result=stmt.executeUpdate("delete from stud where id='r/104'");  
      
    System.out.println(result+" records affected");  
    con.close();  
     }
      catch(Exception e)
      {
          e.printStackTrace();
      }
      
    }
    }  