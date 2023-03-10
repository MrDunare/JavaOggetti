package it.softwareinside.garage;

import java.util.Scanner;

import it.softwareinside.veicoli.Automobile;
import it.softwareinside.veicoli.Furgone;
import it.softwareinside.veicoli.Motocicletta;

public class Main {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		Garage garage = new Garage();
		String lettera = key.next();
		
		
		do {
			
			System.out.println("che cosa devo fare?");
			System.out.println("premi a per aggiungere furgone");
			System.out.println("premi s per aggiungere automobile");
			System.out.println("premi b per aggiungere motocicletta");
			System.out.println("premi w per stampare la situazione");
			lettera = key.next();
			
			
		switch (lettera) {
			case "a":
				garage.addVeicolo(new Furgone(2000, "honda", "benzina", 2000, 3000));		
				break;
			case "s":
				garage.addVeicolo(new Automobile(2000, "honda", "benzina", 2000, 3000));		
				break;
			case "b":
				garage.addVeicolo(new Motocicletta(2020, "ktm", "benzina", 2000, "cross", 4));		
				break;
			case "w":
				garage.stampaSituazionePosti();		
				break;

			default:
				break;
			}
			
		} while (! lettera.equals("q"));
		
		key.close();
	}

}
