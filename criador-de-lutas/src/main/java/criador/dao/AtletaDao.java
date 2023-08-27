package criador.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import criador.model.Atleta;

public class AtletaDao {
	
	public void cadastrarAtleta(Atleta atleta) {
		String sql = "INSERT INTO atleta VALUES (?,?,?,?,?,?,?,?)";
		PreparedStatement stmt = null;
		Connection conexao = null;
		
		try {
			conexao = new ConexaoMySql().conectar();
			stmt = conexao.prepareStatement(sql);
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
				if(conexao != null)
					conexao.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		System.out.println("Registro criado!");
		
	}

}
