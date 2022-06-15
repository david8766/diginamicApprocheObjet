package enumerations;

public class TestEnumeration {

	public static void main(String[] args) {
		Saison[] saisons = Saison.values();
		for (Saison saison : saisons) {
			System.out.println("Index: n°" + saison.getIndex() + " - saison: " + saison.getSaison());
		}
 
	}

}
