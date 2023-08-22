package criador.model;

public class Atleta {
	
	private String nome;
	private String equipe;
	private String faixa;
	private char sexo;
	private int idade;
	private double peso;
	
	public Atleta() {

	}

	public Atleta(String nome, String equipe, String faixa, char sexo, int idade, double peso) {
		super();
		this.nome = nome;
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

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
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
	
}
