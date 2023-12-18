
import java.sql.*;  

class Example11
{  
public static void main(String args[]){  
try{  
    // 1. register
Class.forName("com.mysql.jdbc.Driver");  
  
    // 2. connection
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/student","root","root");  
  
    // 3. crt statment
Statement stmt=con.createStatement();  
  
    // 4. excute query 
ResultSet rs=stmt.executeQuery("select * from stud");  
 System.out.println("ID\t\tName\tGender\tDept");
 System.out.print("---------------------------------------\n");
while(rs.next()) 
{
System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)
        +"\t"+rs.getString(4)); 
}
System.out.println("---------------------------------------");
    // 5. close
con.close();  
  
}catch(Exception e)
{ 
    e.printStackTrace();
}  
  
}  
} 