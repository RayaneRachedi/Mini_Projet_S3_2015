package projet.search;
import java.util.ArrayList;

public class Recherche<T>{
	
	private ArrayList<Comparable<T>> tableau;
	
	// Initialisation d'un tableau dynamique
	/**
	 * On initialise un tableau dynamique
	 * 
	 * @param tab liste d'élement dans lequel rechercher
	 */
	@SuppressWarnings("unchecked")
	public Recherche(ArrayList<T> tab)
	{
		tableau = new ArrayList<Comparable<T>>();
		for (int i = 0; i < tab.size(); i++)
			tableau.add((Comparable<T>) tab.get(i));		
	}
	
	// Initialisation d'un tableau statique
	/**
	 * On initialise un tableau statique
	 * @param tab tableau statique dans lequel rechercher
	 */
	public Recherche(Comparable<T> [] tab)
	{
		tableau = new ArrayList<Comparable<T>>();
		for (int i = 0; i < tab.length; i++)
			tableau.add(tab[i]);		
	}
	
	// Algorithme de recherche par dichotomie
	/**
	 * Cette methode permet de rechercher l'indice d'un objet se trouvant dans le tableau.
	 * Pour cela l'interface Comparable (avec compareTo) est utilisee pour pouvoir appliquer
	 * l'algorithme de recherche par dichotomie.
	 * 
	 * @param Objet objet dont on veut trouver son indice
	 * @return retorune l'indice de l'objet s'il existe, sinon -1
	 */
	public int RechercheValeur(T Objet)
	{
		int tailleMax = tableau.size()-1;
		int tailleMin = 0;
		boolean sortie = false;
		int i;	
		do
		{			
			i = (tailleMax + tailleMin)/2;

			// Valeur souhait�e plus petit que la valeur du tableau 
			if ((tableau.get(i).compareTo(Objet)) > 0){
				tailleMax = i;
			}
			// Valeur souhait�e �gale � la valeur du tableau
			else if ((tableau.get(i).compareTo(Objet)) == 0)
				sortie = true;
			// Valeur souhait�e plus grand que la valeur du tableau
			else
				tailleMin = i;
			
			// Si on a atteint l'extr�me du tableau (min ou max)s
			if ((tailleMax - tailleMin) <= 1)
			{
				if (tableau.get(tailleMax).compareTo(Objet) == 0)
					i = tailleMax;
				else if (tableau.get(tailleMin).compareTo(Objet) == 0)
					i = tailleMin;
				else
					i = -1;
			
				sortie = true;
			}
			
		}while(sortie == false);
		
		return i;
	}

}