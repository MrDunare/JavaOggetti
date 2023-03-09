package it.softwareinside.Zoo;



public class StarterZoo {

	public static void main(String[] args) {
		
		Zoo zoo = new Zoo();
		
		zoo.addAnimale(new Animali("leone", 3, 'm'));
		zoo.addAnimale(new Animali("leone", 3, 'm'));
		zoo.addAnimale(new Animali("leone", 3, 'm'));
		zoo.addAnimale(new Animali("leone", 3, 'm'));
		zoo.addAnimale(new Animali("leone", 3, 'f'));
		zoo.addAnimale(new Animali("leone", 3, 'f'));
		zoo.addAnimale(new Animali("leone", 3, 'f'));
		zoo.addAnimale(new Animali());
		zoo.addAnimale(new Animali());
		zoo.addAnimale(new Animali());
		
		
		zoo.StampaAnimali();
		
	}

}
