package it.softwareinside.Cinema;

public class Cinema {
	
	/*
	 * cinema ---> ci sono dei film e persone cpaienza massima[10] , nome cinema, film [] e persone[]
	 * 
	 * Film : nome, genere, etaMinima
	 * 
	 * persone : nome,eta [10]
	 * 
	 * Metodi : per cinema : aggiungi film nota(i film al cinema massimo sono 5) 
	 * torna true se riesco ad ggiungere, metodo rimuovi film e ritorna il film rimosso.
	 * 
	 * stampa lista film di tipo void
	 * stampa persone al cinema(void)
	 * 
	 * rimuovi tutte le persone --> void
	 * 
	 * add persona al film : prende in input la persona ed un film
	 * 
	 * aggiungo la persona la film e se l'eta della persona è maggiore 
	 * di o uguale del campo film.getEtaMinima.
	 * se succede ritorno true altrimenti falso
	 * 
	 * 
	 * 
	 * 
	 */
	
	private String nome;
	private Persona[] persone;
	private Film[] films;
	
	
	//###############  METODI  ###############
	
	public Film removeFilm(int posizione) {
		
		if (posizione < 0 || posizione >= this.films.length) {	
			return null;
		}
		
		Film tmp = this.films[posizione];
		
		this.films[posizione] = null;
		
		return tmp;
		
	}
	
	
	
	
	
	public void removePersone() {
		
		for (int i = 0; i < this.persone.length; i++) {
			this.persone[i] = null;
			
		}
		
	}
	
	
	
	public boolean cercaFilm(Film film) {
		
		if(film == null)
			return false;
			
		for (int i = 0; i < films.length; i++) {
			
			if(this.films[i] == null)
				continue;
			
			if(this.films[i].getNome().equals(film.getNome()))
				return true;
		}
		
		return false;
	}
	
	
	
	
	//AGGIUNGI FILM
	//se ce posto e non ce un altro film con lo stesso nome
	public boolean addFilm(Film film) {
		
		if (this.films == null)
			return false;
		
		if(cercaFilm(film))
			return false;
		
		for (int i = 0; i < this.films.length; i++) {
			
			
			//esiste un posto libero?
			if(this.films[i] == null ) {
				this.films[i] = film;
				return true;
			}	
		}
		return false;
			
	}
	
	
	//AGGIUNGI PERSONE
	public boolean addPersone(Persona persone) {
		
		if(this.persone == null)
			return false;
		
		for (int i = 0; i < this.persone.length; i++) {
			
			if(this.persone[i] == null) {
				this.persone[i] = persone;
				return true;
			}
			
		}
		
		return false;
			
	}
	
	//STAMPA TUTTI I FILM
	public void stampaFilm() {
		
		for(Film filmm : this.films)
			System.out.println(filmm);
	}
	
	//STAMPA TUTTE LE PERSONE
	public void stampaPersone() {
		for(Persona umano : this.persone)
			System.out.println(umano);
	}
	
	
	
	public Cinema(String nome) {
		setNome(nome);
		this.films = new Film[5];
		this.persone = new Persona[10];
	}
	
	
	public Cinema() {
		this("Cinema magico");
	}
	
	
	@Override
	public String toString() {
		
		String ris = "";
		String ris1 = "" ;
		
		for(Persona persona : persone)
			ris += persona + "\n";
		
		for(Film film : films)
			ris1 += film + "\n";
		
		return " Nome del cinema : " + this.nome + ",\n persone : " + ris + ",\n film : " + ris1;
	}
	
	//GETTER AND SETTER
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome=nome;
	}
	
	public void setFilm(Film[] films) {
		this.films=films;
	}
	
	public void setPersona(Persona[] persone) {
		this.persone = persone;
	}
	
	public Persona[] getPersona() {
		return persone;
	}
	public Film[] getFilm() {
		return films;
	}
		
	
}
