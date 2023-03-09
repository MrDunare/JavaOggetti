package it.softwareinside.Cinema;

public class testCinema {

	public static void main(String[] args) {
		
		
		
		Cinema cinema = new Cinema();
		
		
		
		System.out.println("###############");
		
		
		cinema.addFilm(new Film());
		cinema.addFilm(new Film("fats and go", " fantasy", 18));
		
		
		
		System.out.println("###############");
		
		
		cinema.addPersone(new Persona());
		cinema.addPersone(new Persona());
		cinema.addPersone(new Persona());
		cinema.addPersone(new Persona());
		cinema.addPersone(new Persona());
		cinema.addPersone(new Persona());
		cinema.addPersone(new Persona());
		cinema.addPersone(new Persona());
		cinema.addPersone(new Persona());
		cinema.addPersone(new Persona());
		
		
		System.out.println(cinema);
		
		
	}

}
