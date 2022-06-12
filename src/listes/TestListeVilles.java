package listes;

import java.util.ArrayList;
import java.util.List;

public class TestListeVilles {

	public static void main(String[] args) {
		List<Ville> villes = new ArrayList<>();
		villes.add(new Ville("Nice", 343000));
		villes.add(new Ville("Carcassonne", 47800));
		villes.add(new Ville("Narbonne", 53400));
		villes.add(new Ville("Lyon", 484000));
		villes.add(new Ville("Foix", 9700));
		villes.add(new Ville("Pau", 77200));
		villes.add(new Ville("Marseille", 850700));
		villes.add(new Ville("Tarbes", 40600));

		int maxNbHabitants = 0;
		int minNbHabitants = Integer.MAX_VALUE;
		int indexToRemove = -1;
		Ville villeLaPlusPeuplee = null;
		for (int i = 0; i < villes.size(); i++) {
			Ville ville = villes.get(i);
			if (ville.getNbHabitants() > maxNbHabitants) {
				villeLaPlusPeuplee = ville;
				maxNbHabitants = ville.getNbHabitants();
			} else if (ville.getNbHabitants() < minNbHabitants) {
				minNbHabitants = ville.getNbHabitants();
				indexToRemove = i;
			}
			if (ville.getNbHabitants() >= 100000) {
				ville.setNom(ville.getNom().toUpperCase());
			}

		}
		System.out.println(
				"La ville la plus peuplée (" + maxNbHabitants + " habitants) est : " + villeLaPlusPeuplee.toString());
		Ville villeLaMoinsPeuplee = villes.get(indexToRemove);
		villes.remove(indexToRemove);
		System.out.println("Après supression de la ville la moins peuplée (" + villeLaMoinsPeuplee.toString()
				+ "), la liste résultante est :");
		for (Ville ville : villes) {
			System.out.println(ville.toString());
		}

	}

}
