package criador.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import criador.model.Atleta;

public class AtletaDao {
	
	public void cadastrarAtleta(Atleta atleta) {
		String insert = "INSERT INTO atleta (nome, cpf, email, equipe, faixa, sexo, idade, peso) "
				+ "VALUES (?,?,?,?,?,?,?,?)";
		Connection conn = ConexaoMySql.getConexao();
		PreparedStatement stmt = null;
		
		try {
			stmt = conn.prepareStatement(insert);
			stmt.setString(1, atleta.getNome());
			stmt.setString(2, atleta.getCpf());
			stmt.setString(3, atleta.getEmail());
			stmt.setString(4, atleta.getEquipe());
			stmt.setString(5, atleta.getFaixa());
			stmt.setString(6, atleta.getSexo());
			stmt.setInt(7, atleta.getIdade());
			stmt.setDouble(8, atleta.getPeso());
			stmt.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(stmt != null)
					stmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if(conn != null)
					conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		System.out.println("Registro criado!");
		
	}

}
