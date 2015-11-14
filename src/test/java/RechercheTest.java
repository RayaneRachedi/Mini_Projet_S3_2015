import static org.junit.Assert.*;
import org.junit.Test;

public class RechercheTest {
	
	public ArrayListTab arrayListTab;
	public StaticTab staticTab;
	
	public RechercheTest() {
		arrayListTab = new ArrayListTab();
		staticTab = new StaticTab();
	}
	
	@Test
	public void TestFloat()
	{		
		Recherche<Float> floatRecherche = new Recherche<Float>(arrayListTab.getFloatArrayListTab());
		
		System.out.println("TestFloatArrayList : \n");
		
		System.out.println("Valeur : 6.0");
		assertTrue(floatRecherche.RechercheValeur((float) 6.0) == 0);
		System.out.println(floatRecherche.RechercheValeur((float) 6.0) + "\n");
		
		System.out.println("Valeur : 12.95");
		assertTrue(floatRecherche.RechercheValeur((float) 12.95) == 4);
		System.out.println(floatRecherche.RechercheValeur((float) 12.95) + "\n");

		System.out.println("Valeur : 14.35");
		assertTrue(floatRecherche.RechercheValeur((float) 14.35) == 5);
		System.out.println(floatRecherche.RechercheValeur((float) 14.35) + "\n");

		System.out.println("Valeur : 9.54");
		assertTrue(floatRecherche.RechercheValeur((float) 9.54) == -1);
		System.out.println(floatRecherche.RechercheValeur((float) 9.54) + "\n");

		System.out.println("Valeur : 15.49");
		assertTrue(floatRecherche.RechercheValeur((float) 15.49) == 6);
		System.out.println(floatRecherche.RechercheValeur((float) 15.49) + "\n");

				
		floatRecherche = new Recherche<Float>(staticTab.getFloatStaticTab());
		
		System.out.println("TestFloatStatic : \n");
		
		System.out.println("Valeur : 6.0");
		assertTrue(floatRecherche.RechercheValeur((float) 6.0) == 0);
		System.out.println(floatRecherche.RechercheValeur((float) 6.0) + "\n");

		System.out.println("Valeur : 8.5");
		assertTrue(floatRecherche.RechercheValeur((float) 8.5) == 2);
		System.out.println(floatRecherche.RechercheValeur((float) 8.5) + "\n");

		System.out.println("Valeur : 19.5");
		assertTrue(floatRecherche.RechercheValeur((float) 19.5) == 4);
		System.out.println(floatRecherche.RechercheValeur((float) 19.5) + "\n");

		System.out.println("Valeur : 9.3");
		assertTrue(floatRecherche.RechercheValeur((float) 9.3) == -1);
		System.out.println(floatRecherche.RechercheValeur((float) 9.3) + "\n");
		
	}
	
	@Test
	public void TestInteger() {
		
		Recherche<Integer> intRecherche = new Recherche<Integer>(arrayListTab.getIntArrayListTab());

		System.out.println("TestIntegerArrayList : \n");
				
		System.out.println("Valeur : 6");
		assertTrue(intRecherche.RechercheValeur(6) == 0);
		System.out.println(intRecherche.RechercheValeur(6) + "\n");

		System.out.println("Valeur : 11");
		assertTrue(intRecherche.RechercheValeur(11) == 3);
		System.out.println(intRecherche.RechercheValeur(11) + "\n");
		
		System.out.println("Valeur : 15");
		assertTrue(intRecherche.RechercheValeur(15) == 6);
		System.out.println(intRecherche.RechercheValeur(15) + "\n");
		
		System.out.println("Valeur : 13");
		assertTrue(intRecherche.RechercheValeur(13) == -1);
		System.out.println(intRecherche.RechercheValeur(13) + "\n");
		
		intRecherche = new Recherche<Integer>(staticTab.getIntStaticTab());
		
		System.out.println("TestIntegerStatic : \n");
		
		System.out.println("Valeur : 6");
		assertTrue(intRecherche.RechercheValeur(6) == 0);
		System.out.println(intRecherche.RechercheValeur(6) + "\n");

		System.out.println("Valeur : 11");
		assertTrue(intRecherche.RechercheValeur(11) == 2);
		System.out.println(intRecherche.RechercheValeur(11) + "\n");

		System.out.println("Valeur : 18");
		assertTrue(intRecherche.RechercheValeur(18) == 4);
		System.out.println(intRecherche.RechercheValeur(18) + "\n");

		System.out.println("Valeur : 14");
		assertTrue(intRecherche.RechercheValeur(14) == -1);
		System.out.println(intRecherche.RechercheValeur(14) + "\n");
		
	}

	@Test
	public void TestString() {
	
		Recherche<String> stringRecherche = new Recherche<String>(arrayListTab.getStringArrayListTab());

		System.out.println("TestStringArrayList : \n");
		
		System.out.println("Valeur : a");
		assertTrue(stringRecherche.RechercheValeur("a") == 0);
		System.out.println(stringRecherche.RechercheValeur("a") + "\n");

		System.out.println("Valeur : cad");
		assertTrue(stringRecherche.RechercheValeur("cad") == 2);
		System.out.println(stringRecherche.RechercheValeur("cad") + "\n");

		System.out.println("Valeur : dee");
		assertTrue(stringRecherche.RechercheValeur("dee") == 3);
		System.out.println(stringRecherche.RechercheValeur("dee") + "\n");

		System.out.println("Valeur : gga");
		assertTrue(stringRecherche.RechercheValeur("gga") == 6);
		System.out.println(stringRecherche.RechercheValeur("gga") + "\n");

		System.out.println("Valeur : z");
		assertTrue(stringRecherche.RechercheValeur("z") == -1);
		System.out.println(stringRecherche.RechercheValeur("z") + "\n");
		
		stringRecherche = new Recherche<String>(staticTab.getStringStaticTab());
		
		System.out.println("TestStringStatic : \n");
		
		System.out.println("Valeur : abc");
		assertTrue(stringRecherche.RechercheValeur("abc") == 0);
		System.out.println(stringRecherche.RechercheValeur("abc") + "\n");

		System.out.println("Valeur : ghi");
		assertTrue(stringRecherche.RechercheValeur("ghi") == 2);
		System.out.println(stringRecherche.RechercheValeur("ghi") + "\n");

		System.out.println("Valeur : dgt");
		assertTrue(stringRecherche.RechercheValeur("dgt") == -1);
		System.out.println(stringRecherche.RechercheValeur("dgt") + "\n");
		
	}
	
	@Test
	public void TestTelevision() {
		
		Recherche<Television> teleRecherche = new Recherche<Television>(arrayListTab.getTeleArrayListTab());
		
		System.out.println("TestTelevisionArrayList : \n");
		
		System.out.println("Valeur : new Television(\"Philips\", 750)");
		assertTrue(teleRecherche.RechercheValeur(new Television("Philips", 750)) == 0);
		System.out.println(teleRecherche.RechercheValeur(new Television("Philips", 750)) + "\n");

		System.out.println("Valeur : new Television(\"LG\", 1125)");
		assertTrue(teleRecherche.RechercheValeur(new Television("LG", 1125)) == 2);
		System.out.println(teleRecherche.RechercheValeur(new Television("LG", 1125)) + "\n");
		
		System.out.println("Valeur : new Television(\"Sony\", 1619)");
		assertTrue(teleRecherche.RechercheValeur(new Television("Sony", 1619)) == 4);
		System.out.println(teleRecherche.RechercheValeur(new Television("Sony", 1619)) + "\n");
		
		System.out.println("Valeur : new Television(\"Sony\", 1619)");
		assertTrue(teleRecherche.RechercheValeur(new Television("Polaroid", 650)) == -1);
		System.out.println(teleRecherche.RechercheValeur(new Television("Polaroid", 650)) + "\n");
		
		teleRecherche = new Recherche<Television>(staticTab.getTeleStaticTab());
		
		System.out.println("TestTelevisionStatic : \n");
		
		System.out.println("Valeur : new Television(\"Philips\", 750)");
		assertTrue(teleRecherche.RechercheValeur(new Television("Philips", 750)) == 0);
		System.out.println(teleRecherche.RechercheValeur(new Television("Philips", 750)) + "\n");

		System.out.println("Valeur : new Television(\"LG\", 1125)");
		assertTrue(teleRecherche.RechercheValeur(new Television("LG", 1125)) == 2);
		System.out.println(teleRecherche.RechercheValeur(new Television("LG", 1125)) + "\n");
		
		System.out.println("Valeur : new Television(\"Sony\", 1619)");
		assertTrue(teleRecherche.RechercheValeur(new Television("Sony", 1619)) == 4);
		System.out.println(teleRecherche.RechercheValeur(new Television("Sony", 1619)) + "\n");
		
		System.out.println("Valeur : new Television(\"Sony\", 1619)");
		assertTrue(teleRecherche.RechercheValeur(new Television("Polaroid", 650)) == -1);
		System.out.println(teleRecherche.RechercheValeur(new Television("Polaroid", 650)) + "\n");
		
	}
	
}
