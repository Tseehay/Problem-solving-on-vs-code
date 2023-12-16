    

    import java.sql.*;  
    class FetchRecord
    {  
    public static void main(String args[])throws Exception{  
      try
      {
    Class.forName("com.mysql.jdbc.Driver");  
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root"); 
    Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);  
    ResultSet rs=stmt.executeQuery("select * from stud");  
      
    //getting the record of 3rd row  
    rs.absolute(4);
    System.out.println("ID\tName\t\tGender\tDept");
    System.out.print("------------------------------------\n");
    System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));  
    System.out.println("-------------------------------------");
     con.close();  
      }
      catch(Exception e)
      {
          e.printStackTrace();
      }
    }
    }  
	