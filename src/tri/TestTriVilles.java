package tri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestTriVilles {

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

		/*
		 * Collections.sort(villes);
		 * 
		 * for (Ville ville : villes) { System.out.println(ville.toString()); }
		 */

		System.out.println("Tri par habitants :");
		Collections.sort(villes, new ComparatorHabitant());
		for (Ville ville : villes) {
			System.out.println(ville.toString());
		}
		System.out.println("-----------------------------------------------");
		System.out.println("Tri par nom :");
		Collections.sort(villes, new ComparatorNom());
		for (Ville ville : villes) {
			System.out.println(ville.toString());
		}
	}

}
