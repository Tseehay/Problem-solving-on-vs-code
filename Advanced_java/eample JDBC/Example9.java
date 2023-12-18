import java.sql.*;
import javax.sql.rowset.*;

public class Example9 {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
            rowSet.setUrl("jdbc:mysql://localhost:3306/student");
            rowSet.setUsername("root");
            rowSet.setPassword("root");
            rowSet.setCommand("select * from stud");
            rowSet.execute();

            while (rowSet.next()) {
                System.out.println("Id: " + rowSet.getString(1));
                System.out.println("Name: " + rowSet.getString(2));
                System.out.println("Gender: " + rowSet.getString(3));
                System.out.println("Department: " + rowSet.getString(4));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}