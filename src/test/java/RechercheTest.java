import static org.junit.Assert.*;
import java.util.ArrayList; 
import org.junit.Test;

public class RechercheTest {
	
	@Test
	public void TestInteger()
	{
		ArrayList<Float> floatTab = new ArrayList<Float>();
		floatTab.add((float) 6.0);
		floatTab.add((float) 8.4);
		floatTab.add((float) 10.1);
		floatTab.add((float) 11.9);
		floatTab.add((float) 12.95);
		floatTab.add((float) 14.35);
		floatTab.add((float) 15.49);
		
		Recherche<Float> floatRecherche = new Recherche<Float>(floatTab);
		
		System.out.println("Valeur : 6.0");
		assertTrue(floatRecherche.RechercheValeur((float) 6.0) == 0);
		System.out.println("Valeur : 12.0");
		assertTrue(floatRecherche.RechercheValeur((float) 12.95) == 4);
		System.out.println("Valeur : 14.35");
		assertTrue(floatRecherche.RechercheValeur((float) 14.35) == 5);
		System.out.println("Valeur : 9.54");
		assertTrue(floatRecherche.RechercheValeur((float) 9.54) == -1);
		System.out.println("Valeur : 15.49");
		assertTrue(floatRecherche.RechercheValeur((float) 15.49) == 6);
		
		Float [] floatTabStatic = {(float) 6.0,(float) 7.9,(float) 8.5,(float) 15.36,(float) 19.5};
		
		floatRecherche = new Recherche<Float>(floatTabStatic);
		
		System.out.println("Valeur : 6.0");
		assertTrue(floatRecherche.RechercheValeur((float) 6.0) == 0);
		System.out.println("Valeur : 8.5");
		assertTrue(floatRecherche.RechercheValeur((float) 8.5) == 2);
		System.out.println("Valeur : 19.5");
		assertTrue(floatRecherche.RechercheValeur((float) 19.5) == 4);
		System.out.println("Valeur : 9.3");
		assertTrue(floatRecherche.RechercheValeur((float) 9.3) == -1);
		
		//////////////////////////////////////////////////
		
		ArrayList<Integer> intTab = new ArrayList<Integer>();
		intTab.add(6);
		intTab.add(8);
		intTab.add(10);
		intTab.add(11);
		intTab.add(12);
		intTab.add(14);
		intTab.add(15);
		
		Recherche<Integer> intRecherche = new Recherche<Integer>(intTab);

		System.out.println("Valeur : 6");
		assertTrue(intRecherche.RechercheValeur(6) == 0);
		System.out.println("Valeur : 11");
		assertTrue(intRecherche.RechercheValeur(11) == 3);
		System.out.println("Valeur : 15");
		assertTrue(intRecherche.RechercheValeur(15) == 6);
		System.out.println("Valeur : 13");
		assertTrue(intRecherche.RechercheValeur(13) == -1);
		
		Integer [] intTabStatic = {6,8,11,15,18};
		intRecherche = new Recherche<Integer>(intTabStatic);
		
		System.out.println("Valeur : 6");
		assertTrue(intRecherche.RechercheValeur(6) == 0);
		System.out.println("Valeur : 11");
		assertTrue(intRecherche.RechercheValeur(11) == 2);
		System.out.println("Valeur : 18");
		assertTrue(intRecherche.RechercheValeur(18) == 4);
		System.out.println("Valeur : 14");
		assertTrue(intRecherche.RechercheValeur(14) == -1);

		///////////////////////////////////////////////////
		
		ArrayList<String> stringTab = new ArrayList<String>();
		stringTab.add("a");
		stringTab.add("abc");
		stringTab.add("cad");
		stringTab.add("dee");
		stringTab.add("def");
		stringTab.add("fas");
		stringTab.add("gga");
		
		Recherche<String> stringRecherche = new Recherche<String>(stringTab);

		System.out.println("Valeur : a");
		assertTrue(stringRecherche.RechercheValeur("a") == 0);
		System.out.println("Valeur : cad");
		assertTrue(stringRecherche.RechercheValeur("cad") == 2);
		System.out.println("Valeur : dee");
		assertTrue(stringRecherche.RechercheValeur("dee") == 3);
		System.out.println("Valeur : gga");
		assertTrue(stringRecherche.RechercheValeur("gga") == 6);
		System.out.println("Valeur : z");
		assertTrue(stringRecherche.RechercheValeur("z") == -1);
		
		String [] stringTabStatic = {"abc","def","ghi"};
		stringRecherche = new Recherche<String>(stringTabStatic);
		
		System.out.println("Valeur : abc");
		assertTrue(stringRecherche.RechercheValeur("abc") == 0);
		System.out.println("Valeur : ghi");
		assertTrue(stringRecherche.RechercheValeur("ghi") == 2);
		System.out.println("Valeur : dgt");
		assertTrue(stringRecherche.RechercheValeur("dgt") == -1);
		
	}

}
