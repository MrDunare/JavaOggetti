package it.softwareinside.Zoo;

public class Animali {
	
	
	
	//VETTORE ANIMALI [10] nel costruttore 10 vuoto
	//METODI : STAMPA ANIMALI , AGGIUNGI ANIMALE (INPUT ANIMALE TORNA VERA O FALSO) E IN PIU NON POSSONO ESSERE AGGIUNTI 
	//DUE LEONI MASCHI NELLO STESSO ZOO, METODO RIMUOVI ANIMALE IN UNA DETERMINATA POSIZIONE 
	
	private String specie;
	private int eta;
	private char sesso;
	
	
	public Animali() {
		this("pinguino", 7, 'f');
	}
	
	public Animali(String specie,int eta,char sesso) {
		setSpecie(specie);
		setEta(eta);
		setSesso(sesso);
	}
	
	
	@Override
	public String toString() {
		return "specie : " + this.specie + ", eta: " + this.eta + ", sesso: " + this.sesso;
	}
	
	public void setSpecie(String specie) {
		this.specie=specie;
	}
	public void setEta(int eta) {
		this.eta = eta;
	}
	public void setSesso(char sesso) {
		this.sesso=sesso;
	}
	
	public String getSpecie() {
		return specie;
	}
	public int getEta() {
		return eta;
	}
	public char getSesso() {
		return sesso;
	}
	
}
