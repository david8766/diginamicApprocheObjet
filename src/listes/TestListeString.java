package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestListeString {

	public static void main(String[] args) {
		List<String> villes = new ArrayList<>();
		villes.addAll(Arrays.asList("Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes"));
		String villeLaPlusLongue = "";
		for (String ville : villes) {
			if (ville.length() > villeLaPlusLongue.length()) {
				villeLaPlusLongue = ville;
			}
		}
		System.out.println(
				"La ville ayant le plus de lettres (" + villeLaPlusLongue.length() + ") est : " + villeLaPlusLongue);
		for (int i = 0; i < villes.size(); i++) {
			villes.set(i, villes.get(i).toUpperCase());
		}
		for (Iterator<String> iterator = villes.iterator(); iterator.hasNext();) {
			String string = iterator.next();
			if (string.startsWith("N")) {
				iterator.remove();
			}
		}
		System.out.println("La liste résultante est : ");
		for (String ville : villes) {
			System.out.println(ville);
		}

	}

}
