import java.sql.*;

public class JDBCExample {

    public static void main(String[] args) {

        String dbUrl = "jdbc:mysql://localhost:3306/college";
        String dbUser = "root";
        String dbPassword = "Shark@2005";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection =
                    DriverManager.getConnection(
                            dbUrl, dbUser, dbPassword);

            Statement statement =
                    connection.createStatement();

            ResultSet resultSet =
                    statement.executeQuery(
                            "SELECT * FROM students");

            while(resultSet.next()) {

                System.out.println(
                        resultSet.getInt("id") + " " +
                                resultSet.getString("name") + " " +
                                resultSet.getInt("age"));
            }

            connection.close();

        } catch(Exception error) {
            error.printStackTrace();
        }
    }
}
