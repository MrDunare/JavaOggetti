package it.softwareinside.Zoo;



import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AnimaliTest {

	@Test
	public void test() {

		
		Zoo zoo = new Zoo();
		
		assertEquals(zoo.getNome(), "Il regno degli animali");
		
		// assertEquals(zoo.getNome(), "Il grande zoo");  ----> torna la striscia rossa
		
		
	}

}
