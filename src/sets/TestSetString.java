package sets;

import java.util.HashSet;

public class TestSetString {

	private static Pays trouverPIBMax(HashSet<Pays> hs) {
		double pibMax = 0.00D;
		Pays paysAtrouver = new Pays();

		for (Pays pays : hs) {
			if (pays.getPib() > pibMax) {
				pibMax = pays.getPib();
				paysAtrouver = pays;
			}
		}

		return paysAtrouver;
	}

	private static Pays trouverPIBTotMax(HashSet<Pays> hs) {
		double pibTotMax = 0.00D;
		Pays paysAtrouver = new Pays();
		for (Pays pays : hs) {
			double pibTot = pays.getPib() * pays.getNbHabitants();
			if (pibTot > pibTotMax) {
				pibTotMax = pibTot;
				paysAtrouver = pays;
			}
		}
		return paysAtrouver;
	}

	private static Pays trouverPIBTotMin(HashSet<Pays> hs) {
		double pibTotMin = Double.MAX_VALUE;
		Pays paysAtrouver = new Pays();
		for (Pays pays : hs) {
			double pibTot = pays.getPib() * pays.getNbHabitants();
			if (pibTot < pibTotMin) {
				pibTotMin = pibTot;
				paysAtrouver = pays;
			}
		}
		return paysAtrouver;
	}

	public static void main(String[] args) {
		// Exercise 2
		// Learn how to manipulate a set of Strings
		HashSet<String> hs = new HashSet<String>();
		hs.add("USA");
		hs.add("France");
		hs.add("Allemagne");
		hs.add("UK");
		hs.add("Italie");
		hs.add("Japon");
		hs.add("Chine");
		hs.add("Russie");
		hs.add("Inde");

		int count = 0;
		String stringToRemove = "";
		for (String string : hs) {
			int totChars = string.length();
			if (totChars > count) {
				count = totChars;
				stringToRemove = string;
			}
		}
		hs.remove(stringToRemove);
		for (String string : hs) {
			System.out.println(string);
		}
		System.out.println("Le plus nombre de lettres pour un pays était : " + stringToRemove);
		System.out.println("-------------------------------------------");

		// ----------------------------------------------------------------------------------------------------------

		// Exercise 3
		// Learn how to manipulate a set of Objects
		HashSet<Pays> hs2 = new HashSet<Pays>();
		Pays usa = new Pays("USA", 331449281, 63543.58);
		Pays france = new Pays("France", 68014000, 44770.00);
		Pays allemagne = new Pays("Allemagne", 83222442, 58150.64);
		Pays uk = new Pays("UK", 56286961, 40406.58);
		Pays italie = new Pays("Italie", 60359546, 31676.58);
		Pays japon = new Pays("Japon", 125050000, 40113.06);
		Pays chine = new Pays("Chine", 1411780000, 10500.40);
		Pays russie = new Pays("Russie", 147170015, 10126.72);
		Pays inde = new Pays("Inde", 1326093247, 1900.71);

		hs2.add(usa);
		hs2.add(france);
		hs2.add(allemagne);
		hs2.add(uk);
		hs2.add(italie);
		hs2.add(japon);
		hs2.add(chine);
		hs2.add(russie);
		hs2.add(inde);

		Pays paysAtrouver = trouverPIBMax(hs2);
		System.out.println("le pays avec le PIB/habitant le plus important: " + paysAtrouver.getNom());
		System.out.println("-------------------------------------------------------------------------");
		Pays paysAtrouver2 = trouverPIBTotMax(hs2);
		System.out.println("le pays avec le PIB total le plus important: " + paysAtrouver2.getNom());
		Pays paysAtrouver3 = trouverPIBTotMin(hs2);
		System.out.println("le pays avec le PIB total le plus petit: " + paysAtrouver3.getNom().toUpperCase());
		System.out.println("-------------------------------------------------------------------------");

		hs2.remove(paysAtrouver3);

		for (Pays pays : hs2) {
			System.out.println(pays + " - PIB tot: " + pays.getPib() * pays.getNbHabitants());
		}
	}

}
