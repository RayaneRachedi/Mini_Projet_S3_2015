package projet;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import projet.search.RechercheTest;
import projet.tri.TestTriTable;

/*
 * This Java source file was generated with gradle
 * by 'Latixel' at '06/11/15 22:06' with Gradle 2.8
 *
 * @author Latixel, @date 06/11/15 22:06
 */
/**
 * Classe de Test JUnit de la librairie (tri et recherche)
 * @author Latixel
 *
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
	TestTriTable.class,
	RechercheTest.class,
})
public class ProjetTest {
	// aucun test car effectué avec JUnit
}
