package it.softwareinside.Zoo;


public class Zoo {

	private String nome;
	private Animali[] animali;
	
	
	

	public boolean isOneLion() {
		
		for(Animali animale : this.animali) {
			
			if(animale == null)  //significa che il posto è vuoto...
				continue;
			
			if(animale.getSpecie().equals("leone") && animale.getSesso() == 'm')
				return true;
			
		}
		return false;
		
	}
	
	
	
	
	public boolean addAnimale(Animali animale) {
		
		
		if(animali == null)
			return false;
		
		for (int i = 0; i < animali.length; i++) {
			
		
			//esiste un posto libero ??
			if(this.animali[i] == null){
								
				if(animale.getSpecie().equals("leone") && animale.getSesso() == 'm' 
						&&  isOneLion() ) 
					return false;
				
				animali[i] = animale;			
				return true;
			}
				
		}
	
		return false;
		
	}
	
	//RIMUOVO ANIMALE
	public Animali removeAnimali(int posizione) {
		if(posizione < 0 || posizione >= this.animali.length) {
			return null;
		}
		
		Animali animaliTmp = this.animali[posizione];
		
		this.animali[posizione] = null; //LO TOLGO DALL ARRAY E METTO NULL
		
		return animaliTmp;
		
	}
	
	//Stampa animali
	public void StampaAnimali() {
		for (int i = 0; i < animali.length; i++) {
			System.out.println(this.animali[i]);
		}
	}
	
	public Zoo() {
		this("Il regno degli animali");
	}
	
	
	public Zoo(String nome) {
		setNome(nome);
		this.animali = new Animali[10];
	}
	
	@Override
	public String toString() {
		String ris = "";
		for (Animali animalis : animali)
			ris += animalis + "\n";
		return "Nome zoo : " + this.nome + "\nanimali presenti\n " + ris;
	}
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setAnimali(Animali[] animali) {
		if(animali.length==10)
			
//		if(isLeoneDoppio())
//			this.animali = null;
			this.animali = animali;
	}
	
	public Animali[] getAnimali() {
		return animali;
	}
	
}
