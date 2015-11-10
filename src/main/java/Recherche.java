import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

public class Recherche<T>{
	
	private ArrayList<Comparable<T>> tableau;
	
	public Recherche(ArrayList<T> tab)
	{
		tableau = (ArrayList<Comparable<T>>) tab;
	}
	
	public int RechercheValeur(T Objet)
	{
		int taille = tableau.size();
		Boolean sortie = false;
		int i = ((taille-1)/2);	
		do
		{	
			System.out.println("i = " + i);
			System.out.println("tableau.get(i) : " + tableau.get(i));
			System.out.println("tableau.get(i).compareTo(Objet) : " + tableau.get(i).compareTo(Objet));
			System.out.println("sortie = " + sortie);

			if ((tableau.get(i).compareTo(Objet)) > 0){
				i = (i/2);
			}
			else if ((tableau.get(i).compareTo(Objet)) == 0)
				sortie = true;
			else
				i = i + (i/2);
		}while((sortie == false) || (i >= taille) || (i<0));
		
		System.out.println("sortie = " + sortie);

		return i;
	}
	/*
	public static void main(String [] args)
	{
		ArrayList<Integer> intTab = new ArrayList<Integer>();
		intTab.add(6);
		intTab.add(8);
		intTab.add(10);
		intTab.add(12);
		intTab.add(14);
		
		Recherche tabInt = new Recherche(intTab);
		
		assertTrue(tabInt.RechercheValeur(6) == 0);
	}*/

}