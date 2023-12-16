
import java.sql.*;  

class JDatabase
{  
public static void main(String args[]){  
try{  
Class.forName("com.mysql.jdbc.Driver");  
  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/student","root","root");  
  
Statement stmt=con.createStatement();  
  
ResultSet rs=stmt.executeQuery("select * from stud");  
 System.out.println("ID\t\tName\tGender\tDept");
 System.out.print("---------------------------------------\n");
while(rs.next()) 
{
System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)
        +"\t"+rs.getString(4)); 
}
System.out.println("---------------------------------------");
  
con.close();  
  
}catch(Exception e)
{ 
    e.printStackTrace();
}  
  
}  
} 