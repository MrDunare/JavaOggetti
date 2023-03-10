package it.softwareinside.veicoli;

public class Motocicletta extends VeicoloAMotore{

	private String tipologia;
	private int numTempiMotore;
	
	
	public Motocicletta() {
		this(2018, "ktm", "diesel", 600, "cross", 4);
		
	}
	
	
	
	public Motocicletta(int annoImmatricolazione,String marca,String tipoAlimentazione,int cilindrata
							,String tipologia,int numTempiMotore) {
		
		super(annoImmatricolazione, marca, tipoAlimentazione, cilindrata);
		setTipologia(tipologia);
		setNumTempiMotore(numTempiMotore);
		
	}
	
	
	
	@Override
	public String toString() {
		return   " moto ----> tipo : " + this.tipologia + ",  numero tempi: " + this.numTempiMotore + super.toString();
	}
	
	
	
	public void setTipologia(String tipologia) {
		this.tipologia=tipologia;
	}
	
	public void setNumTempiMotore(int numTempiMotore) {
		this.numTempiMotore=numTempiMotore;
	}
	
	
	public String getTipologia() {
		return tipologia;
	}
	public int getNumTempiMotore() {
		return numTempiMotore;
	}
	
}
