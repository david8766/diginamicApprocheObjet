package enumerations;

import java.util.ArrayList;
import java.util.List;

public class TestPaysAvecEnum {

	public static void main(String[] args) {
		List<Pays> paysList = new ArrayList<>();
		paysList.add(new Pays("France", 65000000, Continent.EUROPE));
		paysList.add(new Pays("Allemagne", 80000000, Continent.EUROPE));
		paysList.add(new Pays("Belgique", 10000000, Continent.EUROPE));
		paysList.add(new Pays("Russie", 150000000, Continent.ASIE));
		paysList.add(new Pays("Chine", 1400000000, Continent.ASIE));
		paysList.add(new Pays("Indonésie", 220000000, Continent.OCEANIE));
		paysList.add(new Pays("Australie", 20000000, Continent.OCEANIE));

		int totE = 0;
		int totAs = 0;
		int totO = 0;
		int totAm = 0;
		int totAf = 0;

		for (Pays pays : paysList) {
			switch (pays.getContinent()) {
			case "Europe":
				totE += 1;
				break;
			case "Asie":
				totAs += 1;
				break;
			case "Océanie":
				totO += 1;
				break;
			case "Amérique":
				totAm += 1;
				break;
			case "Afrique":
				totAf += 1;
				break;
			}
			System.out.println(pays.toString());
		}

		System.out.println("Europe: " + totE + " continent(s) - Asie: " + totAs + " continent(s) - Océanie: " + totO
				+ " continent(s) - Afrique: " + totAf + " continent(s) - Amérique: " + totAm + " continent(s).");

	}

}
