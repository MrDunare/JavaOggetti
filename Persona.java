package it.softwareinside.Cinema;

public class Persona {
	
	
	private String nome;
	private int eta;
	
	public Persona() {
		this("alessio", 25);
		
	}
	
	public Persona(String nome, int eta) {
		setEta(eta);
		setNome(nome);
	}


	@Override
	public String toString() {
		return "  Persona Nome = "  + nome + " eta = " + eta;
	}
	
	
	//getter and setter
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getEta() {
		return eta;
	}
	public void setEta(int eta) {
		this.eta = eta;
	}
	
	
	
}
