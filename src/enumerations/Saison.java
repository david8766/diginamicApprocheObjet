package enumerations;

public enum Saison {
	PRINTEMPS ("Printemps",1),
	ETE ("Eté",2),
	AUTOMNE ("Automne",3),
	HIVER ("Hiver",4);
	
	private final String saison;
	private final Integer index;

	Saison(String string, int i) {
		this.saison = string;
		this.index = i;
	}

	public String getSaison() {
		return saison;
	}

	public Integer getIndex() {
		return index;
	}
	
	

}
