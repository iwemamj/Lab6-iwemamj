import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

public class PrintBalanceTest{

	@Test
	public void testJUnit() {
		assertTrue("The compiler isn't feeling well today...", true);
	}
	
	@Test
	public void testen_US(){
		ArrayList<String> result_en = PrintBalance.PrintBalance("en", "US");
		assertEquals("Hello World",result_en.get(0));
		assertEquals("Please enter your name",result_en.get(1));
		assertEquals("I am pleased to meet you Matt",result_en.get(2));
		assertEquals("You owe the school $9,876,543.21",result_en.get(4));
		assertEquals("Good Bye",result_en.get(5));	
	}
	@Test
	public void testde_DE(){
		ArrayList<String> result_de = PrintBalance.PrintBalance("de", "DE");
		assertEquals("Hallo Welt",result_de.get(0));
		assertEquals("Bitte geben Sie Ihren Namen",result_de.get(1));
		assertEquals("Ich freue mich, Sie kennen zu lernen Matt",result_de.get(2));
		assertEquals("Sie schulden die Schule  \u20AC 9.876.543,21",result_de.get(4));
		assertEquals("Auf Wiedersehen",result_de.get(5));	
	}
	
	@Test
	public void testfr_FR(){
		ArrayList<String> result_fr = PrintBalance.PrintBalance("fr", "FR");
		assertEquals("Bonjour tout le monde",result_fr.get(0));
		assertEquals("S'il vous plaît entrer votre nom ",result_fr.get(1));
		assertEquals("Je suis heureux de vous rencontrer Matt",result_fr.get(2));
		assertEquals("Vous devez l'école 9 876 543,21 \u20AC ",result_fr.get(4));
		assertEquals("au revoir",result_fr.get(5));	
	}

}
