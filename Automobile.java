package it.softwareinside.veicoli;

public class Automobile extends VeicoloAMotore{
	
	private int numPorte;
	
	public Automobile() {
		super();
		
	}
	
	public Automobile(int annoImmatricolazione,String marca,String tipoAlimentazione,int cilindrata,int numPorte) {
		super(annoImmatricolazione, marca, tipoAlimentazione, cilindrata);
		setNumPorte(numPorte);
		
	}
	
	@Override
	public String toString() {
		return "Automobile---> numero porte : " + this.numPorte + super.toString();
	}
	
	
	public void setNumPorte(int numPorte) {
		this.numPorte=numPorte;
	}
	
	public int getNumPorte() {
		return numPorte;
	}
}
