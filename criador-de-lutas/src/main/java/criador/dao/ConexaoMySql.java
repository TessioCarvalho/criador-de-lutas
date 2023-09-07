package criador.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoMySql {

	public Connection getConexao() {
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/criadordelutas?useSSL=false", "root", "9430");
		} catch (Exception e){
			e.printStackTrace();
		}
		return conn;
	}
}