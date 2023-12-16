    import java.sql.*; 
    import javax.sql.rowset.*; 
      
    public class RowSetEx{  
            public static void main(String[] args) throws Exception {  
                
               try
               {
                     Class.forName("com.mysql.jdbc.Driver");  
          
        //Creating and Executing RowSet  
            JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();  
            rowSet.setUrl("jdbc:mysql://localhost:3306/student");  
            rowSet.setUsername("root");  
            rowSet.setPassword("root");  
            rowSet.setCommand("select * from stud");  
            rowSet.execute();  
             //rowSet.getMaxRows();
        while (rowSet.next()) {
            // Generating cursor Moved event  
              System.out.println("Id: " + rowSet.getString(1));  
              System.out.println("Name: " + rowSet.getString(2));  
              System.out.println("Gender: " + rowSet.getString(3));  
              System.out.println("Department: " + rowSet.getString(4)); 
                    }  
               }
               catch(Exception ex)
               {
                   ex.printStackTrace();
               }
            }  
    }  