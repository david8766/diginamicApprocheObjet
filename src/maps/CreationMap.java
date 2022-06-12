package maps;

import java.util.HashMap;
import java.util.Iterator;

public class CreationMap {

	public static void main(String[] args) {
		HashMap<String, Integer> mapSalaires = new HashMap<>();
		mapSalaires.put("Paul", 1750);
		mapSalaires.put("Hicham", 1825);
		mapSalaires.put("Yu", 2250);
		mapSalaires.put("Ingrid", 2015);
		mapSalaires.put("Chantal", 2418);
		System.out.println("Taille de la map salaires: " + mapSalaires.size());

		System.out.println("-------------------------------------------------------");

		HashMap<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");

		mapVilles.put(59, "Lille");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");

		Iterator<Integer> keysIte = mapVilles.keySet().iterator();
		Iterator<String> valuesIte = mapVilles.values().iterator();

		while (keysIte.hasNext()) {
			int key = (int) keysIte.next();
			System.out.println(key);

		}

		System.out.println("-----------------------------------------------");

		while (valuesIte.hasNext()) {
			String ville = (String) valuesIte.next();
			System.out.println(ville);

		}
		System.out.println("-----------------------------------------------");
		System.out.println("Taille de la map villes: " + mapVilles.size());

	}

}
