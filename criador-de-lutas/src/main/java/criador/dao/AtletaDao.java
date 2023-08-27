package criador.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import criador.model.Atleta;

public class AtletaDao {
	
	public void cadastrarAtleta(Atleta atleta) throws SQLException {
		
		Connection conexao = ConexaoMySql.conectar();
		
		String sql = "INSERT INTO atleta VALUES (?,?,?,?,?,?,?,?)";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, atleta.getNome());
		stmt.setString(1, atleta.getCpf());
		stmt.setString(1, atleta.getEmail());
		stmt.setString(1, atleta.getEquipe());
		stmt.setString(1, atleta.getFaixa());
		stmt.setString(1, atleta.getSexo());
		stmt.setInt(1, atleta.getIdade());
		stmt.setDouble(1, atleta.getPeso());
		
		stmt.execute();
		
		System.out.println("Registro criado!");
		
		conexao.close();
		stmt.close();
	}

}
