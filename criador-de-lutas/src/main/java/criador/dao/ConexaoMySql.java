package criador.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMySql {
	
	public static Connection conectar() {
		try {
			final String url = "jdbc:mysql://localhost/criadordelutas?verifyServerCertificate=false&useSSL=true";
			final String user = "root";
			final String pass = "9430";
			
			return DriverManager.getConnection(url, user, pass);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
