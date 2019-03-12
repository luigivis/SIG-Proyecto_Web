package jdbc;

import java.sql.Connection;  
import java.sql.DriverManager;
import java.sql.SQLException;
 
public class DbConnection 
{
	
	private static String database;
	private static String driver = "com.mysql.jdbc.Driver";
	private static String host = "sql9.freesqldatabase.com";
	private static String port = "3306";
	private static String user = "sql9282868";
	private static String password = "i9qsCGTwrm";
	private static String dbMessage;
	
	public static Connection getConnection() {
		Connection connection = null;
		
		try {
			Class.forName(driver).newInstance();
			connection = DriverManager.getConnection(
					"jdbc:mysql://" + host + ":" + port + "/" + database,
					user, password);
		} catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
			setDbMessage(ex.toString());
		}
		
		return connection;
	}
	
	public DbConnection() {
		this.database = "sql9282868";
	}
	
	public DbConnection (String database) {
		this.database = database;
	}

    public static String getDbMessage() {
        return dbMessage;
    }

    public static void setDbMessage(String dbMessage) {
        DbConnection.dbMessage = dbMessage;
    }
	
	/**
	 * @return the dbMessage
	 */
	

}
	
