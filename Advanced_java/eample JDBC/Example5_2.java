
import java.sql.*;
class Select{
    public static void main(String[] args) {
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root"); 
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM stud");
            ResultSetMetaData rsmd = rs.getMetaData();
            int noCol = rsmd.getColumnCount();
            for(int i = 1; i <= noCol; i++)
            {
                if(i==2)
                    System.out.print("\t");
                System.out.print(rsmd.getColumnName(i)+"\t");
            }
            
           System.out.print("\n-----------------------------------------\n");
            while(rs.next()){
                for(int i = 1; i <= noCol; i++)
                {
                    System.out.print( rs.getString(i)+"\t");
                }
                System.out.println();
               }
            System.out.println("----------------------------------------");
        }
        catch(Exception e){e.printStackTrace();}
    }
}