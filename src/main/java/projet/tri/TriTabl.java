/**
 * 
 */
package projet.tri;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Latixel
 * Classe de tri.
 */
public class TriTabl {
	/**
	 * Constructeur par défault mis en privé pour empécher quelle soit instanciée.
	 */
	private TriTabl() {}

	/**
	 * Cette méthode statique permet de trier une liste d'objets.
	 * Pour cela l'interface Comparable (avec compareTo) est utilisé pour pouvoir comparer 2 objets.
	 * @param tabl arrayList d'élément(s) Comparable à trier
	 * @throws NullArgumentException si la liste est null
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void triArray(ArrayList<Comparable> tabl) throws NullArgumentException {
		if(tabl == null)
			throw new NullArgumentException("ArrayList null");
		int i, cmp;
		boolean nonTrier;
		do {
			nonTrier = false;
			for(i = 0 ; i < tabl.size()-1 ; i++) {
				cmp = tabl.get(i).compareTo(tabl.get(i+1));
				if(cmp > 0) { //i > i+1
					Collections.swap(tabl, i, i+1); //on interverti les 2 éléments dans la liste
					nonTrier = true; //on doit repasser car nontrier
				} // else if(cmp < 0) { //i < i+1
				//} else  //i = i+1
			}
		} while(nonTrier);
	}

}
