package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import tri.Ville;

public class MapVilles {

	public static void main(String[] args) {
		List<Ville> villes = new ArrayList<Ville>();
		Ville v1 = new Ville("Nice", 343000);
		villes.add(v1);
		Ville v2 = new Ville("Carcassonne", 47800);
		villes.add(v2);
		Ville v3 = new Ville("Narbonne", 53400);
		villes.add(v3);
		Ville v4 = new Ville("Lyon", 484000);
		villes.add(v4);
		Ville v5 = new Ville("Foix", 9700);
		villes.add(v5);
		Ville v6 = new Ville("Pau", 77200);
		villes.add(v6);
		Ville v7 = new Ville("Marseille", 850700);
		villes.add(v7);
		Ville v8 = new Ville("Tarbes", 40600);
		villes.add(v8);

		HashMap<String, Integer> mapVilles = new HashMap<String, Integer>();
		mapVilles.put(v1.getNom(), v1.getNbHabitants());
		mapVilles.put(v2.getNom(), v2.getNbHabitants());
		mapVilles.put(v3.getNom(), v3.getNbHabitants());
		mapVilles.put(v4.getNom(), v4.getNbHabitants());
		mapVilles.put(v5.getNom(), v5.getNbHabitants());
		mapVilles.put(v6.getNom(), v6.getNbHabitants());
		mapVilles.put(v7.getNom(), v7.getNbHabitants());
		mapVilles.put(v8.getNom(), v8.getNbHabitants());

		Iterator<String> keysIte = mapVilles.keySet().iterator();
		Iterator<Integer> valuesIte = mapVilles.values().iterator();

		int minNbHabitants = Integer.MAX_VALUE;
		String MinVilleString = "";

		while (keysIte.hasNext() && valuesIte.hasNext()) {
			Integer integer = (Integer) valuesIte.next();
			String ville = (String) keysIte.next();
			if (minNbHabitants > integer) {
				minNbHabitants = integer;
				MinVilleString = ville;
			}
		}
		System.out.println(mapVilles);
		mapVilles.remove(MinVilleString);
		System.out.println(mapVilles);
	}

}
