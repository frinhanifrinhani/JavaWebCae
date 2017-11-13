//main
package conexao;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class JDBCExemplo {
	/*
	 * public static void main(String[] args) throws SQLException { Connection
	 * conexao = (Connection)
	 * DriverManager.getConnection("jdbc:mysql://localhost/java_web_cae","root",
	 * "0777"); System.out.println("Conectado!"); conexao.close(); }
	 */

	public static void main(String[] args) {
		ConnectionFactory conexao = (ConnectionFactory) new ConnectionFactory();
			//System.out.println(conexao.getConnection());
			if(!(conexao == null)) {
				System.out.println("sim");
			}
		}

}