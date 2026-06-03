import java.sql.*;

public class MoneyTransfer {

    static String dbUrl =
            "jdbc:mysql://localhost:3306/college";

    static String dbUser = "root";
    static String dbPassword = "Shark@2005";
    public static void transfer(
            int sourceAccount,
            int targetAccount,
            double transferAmount) {
        Connection connection = null;
        try {

            connection = DriverManager.getConnection(
                    dbUrl,dbUser,dbPassword);

            connection.setAutoCommit(false);

            PreparedStatement debitStatement =
                    connection.prepareStatement(
                            "UPDATE accounts " +
                                    "SET balance=balance-? " +
                                    "WHERE acc_no=?");

            debitStatement.setDouble(1,transferAmount);
            debitStatement.setInt(2,sourceAccount);

            debitStatement.executeUpdate();

            PreparedStatement creditStatement =
                    connection.prepareStatement(
                            "UPDATE accounts " +
                                    "SET balance=balance+? " +
                                    "WHERE acc_no=?");

            creditStatement.setDouble(1,transferAmount);
            creditStatement.setInt(2,targetAccount);

            creditStatement.executeUpdate();

            connection.commit();

            System.out.println("Success");

        } catch(Exception error) {

            try {
                if(connection != null)
                    connection.rollback();
            }
            catch(Exception rollbackError) {
                rollbackError.printStackTrace();
            }

            error.printStackTrace();
        }
    }

    public static void main(String[] args) {

        transfer(101,102,1000);
    }
}
