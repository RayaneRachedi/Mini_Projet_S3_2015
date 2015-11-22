package projet.search;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

import projet.search.Recherche;

public class RechercheTest {
	
	public ArrayListTab arrayListTab;
	public StaticTab staticTab;
	
	public RechercheTest() {
		arrayListTab = new ArrayListTab();
		staticTab = new StaticTab();
	}
	
	@Test
	public void testFloat()
	{		
		Recherche<Float> floatRecherche = new Recherche<Float>(arrayListTab.getFloatArrayListTab());
		
		System.out.println("TestFloatArrayList : \n");
		
		System.out.println("Valeur : 6.0");
		assertTrue(floatRecherche.rechercheValeur((float) 6.0) == 0);
		System.out.println(floatRecherche.rechercheValeur((float) 6.0) + "\n");
		
		System.out.println("Valeur : 12.95");
		assertTrue(floatRecherche.rechercheValeur((float) 12.95) == 4);
		System.out.println(floatRecherche.rechercheValeur((float) 12.95) + "\n");

		System.out.println("Valeur : 14.35");
		assertTrue(floatRecherche.rechercheValeur((float) 14.35) == 5);
		System.out.println(floatRecherche.rechercheValeur((float) 14.35) + "\n");

		System.out.println("Valeur : 9.54");
		assertTrue(floatRecherche.rechercheValeur((float) 9.54) == -1);
		System.out.println(floatRecherche.rechercheValeur((float) 9.54) + "\n");

		System.out.println("Valeur : 15.49");
		assertTrue(floatRecherche.rechercheValeur((float) 15.49) == 6);
		System.out.println(floatRecherche.rechercheValeur((float) 15.49) + "\n");

				
		floatRecherche = new Recherche<Float>(staticTab.getFloatStaticTab());
		
		System.out.println("TestFloatStatic : \n");
		
		System.out.println("Valeur : 6.0");
		assertTrue(floatRecherche.rechercheValeur((float) 6.0) == 0);
		System.out.println(floatRecherche.rechercheValeur((float) 6.0) + "\n");

		System.out.println("Valeur : 8.5");
		assertTrue(floatRecherche.rechercheValeur((float) 8.5) == 2);
		System.out.println(floatRecherche.rechercheValeur((float) 8.5) + "\n");

		System.out.println("Valeur : 19.5");
		assertTrue(floatRecherche.rechercheValeur((float) 19.5) == 4);
		System.out.println(floatRecherche.rechercheValeur((float) 19.5) + "\n");

		System.out.println("Valeur : 9.3");
		assertTrue(floatRecherche.rechercheValeur((float) 9.3) == -1);
		System.out.println(floatRecherche.rechercheValeur((float) 9.3) + "\n");
		
	}
	
	@Test
	public void testInteger() {
		
		Recherche<Integer> intRecherche = new Recherche<Integer>(arrayListTab.getIntArrayListTab());

		System.out.println("TestIntegerArrayList : \n");
				
		System.out.println("Valeur : 6");
		assertTrue(intRecherche.rechercheValeur(6) == 0);
		System.out.println(intRecherche.rechercheValeur(6) + "\n");

		System.out.println("Valeur : 11");
		assertTrue(intRecherche.rechercheValeur(11) == 3);
		System.out.println(intRecherche.rechercheValeur(11) + "\n");
		
		System.out.println("Valeur : 15");
		assertTrue(intRecherche.rechercheValeur(15) == 6);
		System.out.println(intRecherche.rechercheValeur(15) + "\n");
		
		System.out.println("Valeur : 13");
		assertTrue(intRecherche.rechercheValeur(13) == -1);
		System.out.println(intRecherche.rechercheValeur(13) + "\n");
		
		intRecherche = new Recherche<Integer>(staticTab.getIntStaticTab());
		
		System.out.println("TestIntegerStatic : \n");
		
		System.out.println("Valeur : 6");
		assertTrue(intRecherche.rechercheValeur(6) == 0);
		System.out.println(intRecherche.rechercheValeur(6) + "\n");

		System.out.println("Valeur : 11");
		assertTrue(intRecherche.rechercheValeur(11) == 2);
		System.out.println(intRecherche.rechercheValeur(11) + "\n");

		System.out.println("Valeur : 18");
		assertTrue(intRecherche.rechercheValeur(18) == 4);
		System.out.println(intRecherche.rechercheValeur(18) + "\n");

		System.out.println("Valeur : 14");
		assertTrue(intRecherche.rechercheValeur(14) == -1);
		System.out.println(intRecherche.rechercheValeur(14) + "\n");
		
	}

	@Test
	public void testString() {
	
		Recherche<String> stringRecherche = new Recherche<String>(arrayListTab.getStringArrayListTab());

		System.out.println("TestStringArrayList : \n");
		
		System.out.println("Valeur : a");
		assertTrue(stringRecherche.rechercheValeur("a") == 0);
		System.out.println(stringRecherche.rechercheValeur("a") + "\n");

		System.out.println("Valeur : cad");
		assertTrue(stringRecherche.rechercheValeur("cad") == 2);
		System.out.println(stringRecherche.rechercheValeur("cad") + "\n");

		System.out.println("Valeur : dee");
		assertTrue(stringRecherche.rechercheValeur("dee") == 3);
		System.out.println(stringRecherche.rechercheValeur("dee") + "\n");

		System.out.println("Valeur : gga");
		assertTrue(stringRecherche.rechercheValeur("gga") == 6);
		System.out.println(stringRecherche.rechercheValeur("gga") + "\n");

		System.out.println("Valeur : z");
		assertTrue(stringRecherche.rechercheValeur("z") == -1);
		System.out.println(stringRecherche.rechercheValeur("z") + "\n");
		
		stringRecherche = new Recherche<String>(staticTab.getStringStaticTab());
		
		System.out.println("TestStringStatic : \n");
		
		System.out.println("Valeur : abc");
		assertTrue(stringRecherche.rechercheValeur("abc") == 0);
		System.out.println(stringRecherche.rechercheValeur("abc") + "\n");

		System.out.println("Valeur : ghi");
		assertTrue(stringRecherche.rechercheValeur("ghi") == 2);
		System.out.println(stringRecherche.rechercheValeur("ghi") + "\n");

		System.out.println("Valeur : dgt");
		assertTrue(stringRecherche.rechercheValeur("dgt") == -1);
		System.out.println(stringRecherche.rechercheValeur("dgt") + "\n");
		
	}
	
	@Test
	public void testTelevision() {
		
		Recherche<Television> teleRecherche = new Recherche<Television>(arrayListTab.getTeleArrayListTab());
		
		System.out.println("TestTelevisionArrayList : \n");
		
		System.out.println("Valeur : new Television(\"Philips\", 750)");
		assertTrue(teleRecherche.rechercheValeur(new Television("Philips", 750)) == 0);
		System.out.println(teleRecherche.rechercheValeur(new Television("Philips", 750)) + "\n");

		System.out.println("Valeur : new Television(\"LG\", 1125)");
		assertTrue(teleRecherche.rechercheValeur(new Television("LG", 1125)) == 2);
		System.out.println(teleRecherche.rechercheValeur(new Television("LG", 1125)) + "\n");
		
		System.out.println("Valeur : new Television(\"Sony\", 1619)");
		assertTrue(teleRecherche.rechercheValeur(new Television("Sony", 1619)) == 4);
		System.out.println(teleRecherche.rechercheValeur(new Television("Sony", 1619)) + "\n");
		
		System.out.println("Valeur : new Television(\"Sony\", 1619)");
		assertTrue(teleRecherche.rechercheValeur(new Television("Polaroid", 650)) == -1);
		System.out.println(teleRecherche.rechercheValeur(new Television("Polaroid", 650)) + "\n");
		
		teleRecherche = new Recherche<Television>(staticTab.getTeleStaticTab());
		
		System.out.println("TestTelevisionStatic : \n");
		
		System.out.println("Valeur : new Television(\"Philips\", 750)");
		assertTrue(teleRecherche.rechercheValeur(new Television("Philips", 750)) == 0);
		System.out.println(teleRecherche.rechercheValeur(new Television("Philips", 750)) + "\n");

		System.out.println("Valeur : new Television(\"LG\", 1125)");
		assertTrue(teleRecherche.rechercheValeur(new Television("LG", 1125)) == 2);
		System.out.println(teleRecherche.rechercheValeur(new Television("LG", 1125)) + "\n");
		
		System.out.println("Valeur : new Television(\"Sony\", 1619)");
		assertTrue(teleRecherche.rechercheValeur(new Television("Sony", 1619)) == 4);
		System.out.println(teleRecherche.rechercheValeur(new Television("Sony", 1619)) + "\n");
		
		System.out.println("Valeur : new Television(\"Sony\", 1619)");
		assertTrue(teleRecherche.rechercheValeur(new Television("Polaroid", 650)) == -1);
		System.out.println(teleRecherche.rechercheValeur(new Television("Polaroid", 650)) + "\n");
		
	}
	
}
