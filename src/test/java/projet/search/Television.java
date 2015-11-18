package projet.search;

public class Television implements Comparable<Television>{

	private String nom;
	private int puissance;
	
	public Television(String newNom, int newPuissance) {
		nom = new String(newNom);
		puissance = newPuissance;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getPuissance() {
		return puissance;
	}

	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}

	@Override
	public int compareTo(Television o) {

		if (this.getPuissance() < o.getPuissance())
			return -1;
		else if (this.getPuissance() == o.getPuissance())
			return 0;
		else
			return 1;
		
	}
	
}
