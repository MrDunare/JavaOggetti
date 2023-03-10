package it.softwareinside.garage;

import it.softwareinside.veicoli.VeicoloAMotore;

public class Garage {
	
	private VeicoloAMotore[] veicoli;
	
	
	public int addVeicolo(VeicoloAMotore veicolo) {
		int contatore = -1;
		if (veicolo == null)
			return contatore;
			
		for (int i = 0; i < veicoli.length; i++) {
			if( this.veicoli[i] == null) {
				this.veicoli[i] = veicolo;
				return i;
			}	
			
		}
		
		return contatore;
	}
	
	public VeicoloAMotore removeMacchina(int posizione) {
		
		if( posizione < 0 || posizione >= this.veicoli.length)
			return null;
		
		VeicoloAMotore tmp = this.veicoli[posizione];
		
		this.veicoli[posizione] = null;
		
		return tmp;	
		
	}
	
	public void stampaSituazionePosti() {
		for(VeicoloAMotore veicolo : this.veicoli)
			if(veicolo != null)
			System.out.println(veicolo); 
	}
	
	
	public Garage() {
		this.veicoli = new VeicoloAMotore[10];
	}
	
	@Override
	public String toString() {
		return " veicoli: " + this.veicoli; 
	}
	
	public void setVeicolo(VeicoloAMotore[] veicoli) {
		this.veicoli=veicoli;
	}
	
	public VeicoloAMotore[] getVeicolo() {
		return veicoli;
	}
			
}
