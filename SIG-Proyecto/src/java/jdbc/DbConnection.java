package jdbc;

import java.sql.Connection;  
import java.sql.DriverManager;
import java.sql.SQLException;
 
public class DbConnection 
{
	
	private String database = "NJhyvd1ujn";
	private String driver = "com.mysql.jdbc.Driver";
	private String host = "remotemysql.com";
	private String port = "3306";
	private String user = "NJhyvd1ujn";
	private String password = "PCjF8tve8M";
	private String dbMessage;
	
	public Connection getConnection() {
		Connection connection = null;
		
		try {
			Class.forName(driver).newInstance();
			connection = DriverManager.getConnection(
					"jdbc:mysql://" + host + ":" + port + "/" + database,
					user, password);
		} catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
			setDbMessage(ex.getMessage());
		}
		
		return connection;
	}
	
	public DbConnection() {
		this.database = "NJhyvd1ujn";
	}
	
	public DbConnection (String database) {
		this.database = database;
	}
	
	/**
	 * @return the dbMessage
	 */
	public String getDbMessage() {
		return dbMessage;
	}

	/**
	 * @param dbMessage the dbMessage to set
	 */
	public void setDbMessage(String dbMessage) {
		this.dbMessage = dbMessage;
	}

}
	
