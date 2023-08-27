package criador.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoMySql {

	public Connection conectar() {
		
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/criadordelutas",
					"root", "9430");
		} catch (Exception e) {
			e.printStackTrace();;
		}
		return conn;
	}

}
