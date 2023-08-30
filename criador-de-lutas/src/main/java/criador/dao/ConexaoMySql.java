package criador.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMySql {

	public static Connection getConexao() {
		try {
			final String url = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true";
			final String user = "root";
			final String password = "9430";
			
			return DriverManager.getConnection(url, user, password);
		} catch (SQLException e){
			throw new RuntimeException(e);
		}
		
	}

}
