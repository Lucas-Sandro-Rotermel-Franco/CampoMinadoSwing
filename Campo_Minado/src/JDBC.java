import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC {
	
	private String url = "jdbc:mysql://localhost/campo_minado?useSSL=false";
	private String user = "user";
	private String password = "user";
	Connection connection = null;

	public Connection getConnection() {
		try {
			if (connection == null)
				connection = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
}
