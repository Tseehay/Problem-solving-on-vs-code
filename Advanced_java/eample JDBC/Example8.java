import java.sql.*;  
class FetchRecords{  
public static void main(String args[])throws Exception{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");  
con.setAutoCommit(false);  
  
Statement stmt=con.createStatement();  
stmt.addBatch("insert into stud values('R/103/08','Fraol','CSE','III')");  
stmt.addBatch("insert into stud values('R/104/08','Lemma','CSE','III')");
  
stmt.executeBatch();//executing the batch  


  
con.commit();  
con.close();  
}}  