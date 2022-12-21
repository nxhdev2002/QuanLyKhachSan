package hotelmanagement.DAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DAL {
    private static String DB_URL = "jdbc:mysql://localhost/testqlks";
    private static String USER_NAME = "root";
    private static String PASSWORD = "5EB7XYcF9KXbV1nO93b3";
    // private static String PASSWORD = "root@5EB7XYcF9KXbV1nO93b3";

    public static DAL instance;
    private Connection conn;
    // private Statement state;

    public DAL() {
        this.connectDB();
    }

    public static DAL getInstance() {
        if (instance == null) {
            instance = new DAL();
        }
        return instance;
    }

    public void connectDB() {
        try {
            conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
            System.out.println("Connect success");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public int executeQueryUpdate(String query) {
        try {

            if (conn == null)
                new DAL();
            Statement statement = conn.createStatement();
            return statement.executeUpdate(query);
        } catch (Exception ex) {
            return -1;
        }
    }

    public ResultSet executeQueryToGetData(String query) {
        try {
            if (conn == null)
                new DAL();
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);
            return rs;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public void closeConn() {
        try {
            if (conn != null)
                conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
