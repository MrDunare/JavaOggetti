package it.softwareinside.veicoli;

public class Furgone extends VeicoloAMotore{
	
	private int capacitaCarico;
	
	public Furgone() {
		this(2002, "fiat","metano", 1000, 20000);
		
	}
	
	public Furgone(int annoImmatricolazione,String marca,String tipoAlimentazione,int cilindrata,int capacitaCarcico) {
		super(annoImmatricolazione, marca, tipoAlimentazione, cilindrata);
		setCapacita(capacitaCarcico);
		
	}
	
	
	@Override
	public String toString() {
		return " Furgone ---> capacita carico : " + this.capacitaCarico + super.toString();
	}
	
	
	public void setCapacita(int capacitaCarico) {
		this.capacitaCarico=capacitaCarico > 0 ? capacitaCarico : 1000;
	}
	
	public int getCapacita() {
		return capacitaCarico;
	}
}
