package it.softwareinside.Cinema;

public class Film {
	
	
	private String nome,genere;
	private int etaMinima;
	
	
	
	
	
	
	
	
	
	
	
	public Film() {
		this("il pescatore", "avventura", 18);
	}
	
	
	
	
	public Film(String nome, String genere, int etaMinima) {
		setEtaMinima(etaMinima);
		setGenere(genere);
		setNome(nome);
	}




	@Override
	public String toString() {
		return "Film --> nome=" + nome + ", genere=" + genere + ", etaMinima=" + etaMinima;
	}
	
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGenere() {
		return genere;
	}
	public void setGenere(String genere) {
		this.genere = genere;
	}
	public int getEtaMinima() {
		return etaMinima;
	}
	public void setEtaMinima(int etaMinima) {
		this.etaMinima = etaMinima;
	}


}
