import java.util.ArrayList;

public class Recherche<T>{
	
	private ArrayList<Comparable<T>> tableau;
	
	// Initialisation d'un tableau dynamique
	@SuppressWarnings("unchecked")
	public Recherche(ArrayList<T> tab)
	{
		tableau = new ArrayList<Comparable<T>>();
		for (int i = 0; i < tab.size(); i++)
			tableau.add((Comparable<T>) tab.get(i));		
	}
	
	// Initialisation d'un tableau statique
	public Recherche(Comparable<T> [] tab)
	{
		tableau = new ArrayList<Comparable<T>>();
		for (int i = 0; i < tab.length; i++)
			tableau.add(tab[i]);		
	}
	
	// Algorithme de recherche par dichotomie
	public int RechercheValeur(T Objet)
	{
		int tailleMax = tableau.size()-1;
		int tailleMin = 0;
		Boolean sortie = false;
		int i;	
		do
		{			
			i = (tailleMax + tailleMin)/2;

			// Valeur souhaitée plus petit que la valeur du tableau 
			if ((tableau.get(i).compareTo(Objet)) > 0){
				tailleMax = i;
			}
			// Valeur souhaitée égale à la valeur du tableau
			else if ((tableau.get(i).compareTo(Objet)) == 0)
				sortie = true;
			// Valeur souhaitée plus grand que la valeur du tableau
			else
				tailleMin = i;
			
			// Si on a atteint l'extrême du tableau (min ou max)s
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