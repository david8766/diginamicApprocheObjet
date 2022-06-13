package maps;

public class Pays {
	private String nom;
	private Integer ndHabitants;
	private String continent;
	
	public Pays(String nom, Integer ndHabitants, String continent) {
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
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}
	
	

}
