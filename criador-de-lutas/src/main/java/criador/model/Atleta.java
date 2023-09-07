package criador.model;

import criador.dao.AtletaDao;

public class Atleta {
	
	private String nome;
	private String cpf;
	private String email;
	private String equipe;
	private String faixa;
	private String sexo;
	private int idade;
	private double peso;
	
	public Atleta() {

	}

	public Atleta(String nome, String cpf, String email, String equipe, 
					String faixa, String sexo, int idade, double peso) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.equipe = equipe;
		this.faixa = faixa;
		this.sexo = sexo;
		this.idade = idade;
		this.peso = peso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEquipe() {
		return equipe;
	}

	public void setEquipe(String equipe) {
		this.equipe = equipe;
	}

	public String getFaixa() {
		return faixa;
	}

	public void setFaixa(String faixa) {
		this.faixa = faixa;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void salvar() {
		new AtletaDao().cadastrarAtleta(this);
	}
	
}
