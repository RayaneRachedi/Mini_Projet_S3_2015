import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class RechercheTest {
	
	@Test
	public void TestInteger()
	{
		ArrayList<Integer> intTab = new ArrayList<Integer>();
		intTab.add(6);
		intTab.add(8);
		intTab.add(10);
		intTab.add(12);
		intTab.add(14);
		
		Recherche tabInt = new Recherche(intTab);
		
		System.out.println("Valeur : 6");
		assertTrue(tabInt.RechercheValeur(6) == 0);
		System.out.println("Valeur : 12");
		assertTrue(tabInt.RechercheValeur(12) == 3);
		System.out.println("Valeur : 14");
		assertTrue(tabInt.RechercheValeur(14) == 4);

	}

}
