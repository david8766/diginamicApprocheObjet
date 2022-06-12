package listes;

import java.util.ArrayList;
import java.util.List;

public class FusionListe {

	public static void main(String[] args) {
		List<String> liste1 = new ArrayList<String>();
		liste1.add("Rouge");
		liste1.add("Vert");
		liste1.add("Orange");
		List<String> liste2 = new ArrayList<String>();
		liste2.add("Blanc");
		liste2.add("Bleu");
		liste2.add("Orange");

		List<String> listeFusion = new ArrayList<String>();
		for (String string : liste1) {
			listeFusion.add(string);
		}
		for (String string : liste2) {
			listeFusion.add(string);
		}
		System.out.println("La liste fusionnée listeFusion a : " + listeFusion.size() + " élément(s).");

		List<String> liste3 = new ArrayList<>();
		liste3.addAll(liste1);
		liste3.addAll(liste2);

		System.out.println("La liste fusionnée liste3 a : " + liste3.size() + " élément(s).");

	}

}
