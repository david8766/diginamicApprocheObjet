package enumerations;

public class Pays {
	private String nom;
	private Integer ndHabitants;
	private Continent continent;
	
	public Pays(String nom, Integer ndHabitants, Continent continent) {
		super();
		this.nom = nom;
		this.ndHabitants = ndHabitants;
		this.continent = continent;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Integer getNdHabitants() {
		return ndHabitants;
	}

	public void setNdHabitants(Integer ndHabitants) {
		this.ndHabitants = ndHabitants;
	}

	public String getContinent() {
		return this.continent.getLibelle();
	}

	public void setContinent(Continent continent) {
		this.continent = continent;
	}
	@Override
	public String toString() {
	
		return "Pays [nom=" + nom + ", nbHabitants=" + ndHabitants + " - continent=" + continent.getLibelle() + "]";
	}
}
