package sets;

public class Pays {
	// Arguments
	private String nom;
	private long nbHabitants;
	private double pib;
	
	// Constructor
	public Pays() {}
	public Pays(String nom, long nbHabitants, double pib) {
		super();
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		this.pib = pib;
	}
	
	
	
	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public long getNbHabitants() {
		return nbHabitants;
	}



	public void setNbHabitants(long nbHabitants) {
		this.nbHabitants = nbHabitants;
	}



	public double getPib() {
		return pib;
	}



	public void setPib(double pib) {
		this.pib = pib;
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Pays: " + this.nom + " - Nombre d'habitants: " + this.nbHabitants + " - PIB/habitant: " + this.pib;
	}
	
	
}
