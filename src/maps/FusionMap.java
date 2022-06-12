package maps;

import java.util.HashMap;
import java.util.Iterator;

public class FusionMap {

	public static void main(String[] args) {
		// Création map1
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "Rouge");
		map1.put(2, "Vert");
		map1.put(3, "Orange");
		// Création map2
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(4, "Blanc");
		map2.put(5, "Bleu");
		map2.put(6, "Orange");
		// Création map 3
		HashMap<Integer, String> map3 = new HashMap<Integer, String>();

		Iterator<Integer> keysIte = map1.keySet().iterator();
		Iterator<String> valuesIte = map1.values().iterator();
		Iterator<Integer> keysIte2 = map2.keySet().iterator();
		Iterator<String> valuesIte2 = map2.values().iterator();

		while (keysIte.hasNext() && valuesIte.hasNext()) {
			map3.put(keysIte.next(), valuesIte.next());
		}
		while (keysIte2.hasNext() && valuesIte2.hasNext()) {
			map3.put(keysIte2.next(), valuesIte2.next());
		}
		System.out.println(map3);

	}

}
