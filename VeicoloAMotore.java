package it.softwareinside.veicoli;

public class VeicoloAMotore {
	
	private int annoImmatricolazione;
	private String marca;
	private String tipoAlimentazione;
	private int cilindrata;
	
	public VeicoloAMotore() {
		this(1998, "honda", "benzina", 1200);
	}
	
	public VeicoloAMotore(int annoImmatricolazione,String marca,String tipoAlimentazione,int cilindrata) {
		setAnnoImmatricolazione(annoImmatricolazione);
		setCilindrata(cilindrata);
		setMarca(marca);
		setTipoAlimentazione(tipoAlimentazione);
	}
	
	
	@Override
	public String toString() {
		return " anno immatricolazione : " + this.annoImmatricolazione +
				", marca: " + this.marca + ", tipo alimetazione: " + this.tipoAlimentazione + 
				", cilindrata: " + this.cilindrata;
	}
	
	public void setAnnoImmatricolazione(int annoImmatricolazione) {
		this.annoImmatricolazione=annoImmatricolazione;
	}
	public void setMarca(String marca) {
		this.marca=marca;
	}
	public void setTipoAlimentazione(String tipoAlimentazione) {
		this.tipoAlimentazione=tipoAlimentazione;
	}
	public void setCilindrata(int cilindrata) {
		this.cilindrata=cilindrata;
	}
	public int getAnnoImmatricolazione() {
		return annoImmatricolazione;
	}
	public String getMarca() {
		return marca;
	}
	public String getTipoAlimentazione() {
		
		switch (tipoAlimentazione) {
		case "benzina":
			this.tipoAlimentazione="benzina";
			break;
		case "diesel":
			this.tipoAlimentazione="diesel";
			break;
		case "gpl":
			this.tipoAlimentazione="gpl";
			break;	
		default:
			this.tipoAlimentazione="benzina";
			break;
		}
		return tipoAlimentazione;
	}
	public int getCilindrata() {
		return cilindrata;
	}
	
}
