package criador.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import criador.model.Atleta;

public class AtletaDao {
	
	public void cadastrarAtleta(Atleta atleta) {
		String insert = "INSERT INTO atleta (nome, cpf, email, equipe, faixa, sexo, idade, peso) "
				+ "VALUES (?,?,?,?,?,?,?,?)";
		PreparedStatement stmt = null;
		Connection conn = null;
		
		try {
			conn = new ConexaoMySql().getConexao();
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
	}
	
	public ArrayList<Atleta> buscarAtleta(String cpf){
		String select = "SELECT * FROM atleta WHERE cpf LIKE '%"+ cpf +"%'";
		ResultSet rs = null;
		Connection conn = null;
		PreparedStatement stmt = null;
		Atleta atleta = null;
		ArrayList<Atleta> atletas = null;
		
		try {
			conn = new ConexaoMySql().getConexao();
			stmt = conn.prepareStatement(select);
			rs = stmt.executeQuery();
			if (rs != null) {
				atletas = new ArrayList<Atleta>();
				while (rs.next()) {
					atleta = new Atleta();
					atleta.setNome(rs.getString("nome"));
					atleta.setCpf(rs.getString("cpf"));
					atleta.setEmail(rs.getString("email"));
					atleta.setEquipe(rs.getString("equipe"));
					atleta.setFaixa(rs.getString("faixa"));
					atleta.setSexo(rs.getString("sexo"));
					atleta.setIdade(rs.getInt("idade"));
					atleta.setPeso(rs.getDouble("peso"));
					atletas.add(atleta);
				}
			}
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
		return atletas;
	}
	
	public void excluirAtleta (String cpf) {
		String delete = "DELETE FROM atleta WHERE cpf = ?";
		PreparedStatement stmt = null;
		Connection conn = null;
		
		try {
			conn = new ConexaoMySql().getConexao();
			stmt = conn.prepareStatement(delete);
			stmt.setString(1, cpf);
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
	}
	
	public void alterarAtleta () {
		
	}
}
