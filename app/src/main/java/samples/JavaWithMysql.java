package samples;

import java.sql.*;
import java.util.HashMap;

public class JavaWithMysql {
    static final String DB_URL = "jdbc:mysql://java_mysql_mysql/java_mysql";   // container name
    static final String USER = "cocolabhub";
    static final String PASS = "cocolabhub";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        HashMap<Integer, HashMap<String, Object>> data = new HashMap<>();
        
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();

            // Create
            String sql = "INSERT INTO TableName (pk_id, column1, column2) VALUES (1, 'value1', 'value2')";
            stmt.executeUpdate(sql);

            // Read
            sql = "SELECT * FROM TableName";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                int pk_id = rs.getInt("pk_id");
                String column1 = rs.getString("column1");
                String column2 = rs.getString("column2");
                
                HashMap<String, Object> row = new HashMap<>();
                row.put("column1", column1);
                row.put("column2", column2);
                row.put("pk_id", pk_id);
                System.out.println(row);
            }

            // Update
            sql = "UPDATE TableName SET column1='newvalue1' WHERE pk_id=1";
            stmt.executeUpdate(sql);

            // Delete
            sql = "DELETE FROM TableName WHERE pk_id=1";
            stmt.executeUpdate(sql);

            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException se2) {
            }
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}
