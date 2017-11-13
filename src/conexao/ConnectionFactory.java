
//factory
package conexao;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class ConnectionFactory {
	public Connection getConnection() {
		try {
			return (Connection) DriverManager.getConnection("jdbc:mysql://localhost/java_web_cae","root","0777");
		}catch (SQLException e){
			throw new RuntimeException(e);
		}
	}
}