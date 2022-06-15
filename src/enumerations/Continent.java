package enumerations;

public enum Continent {
	AFRIQUE ("Afrique"),
	AMERIQUE ("Am�rique"),
	ASIE ("Asie"),
	EUROPE ("Europe"),
	OCEANIE ("Oc�anie");
	
	private String libelle;
	
	Continent(String libelle) {
		this.libelle = libelle;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	

}
