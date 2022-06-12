package listes;

import java.util.ArrayList;
import java.util.List;

public class Creationliste {
	public static void main(String[] args) {
		List<Integer> centPremiersEntiers = new ArrayList<>();
		for (int i = 1; i <= 100; i++) {
			centPremiersEntiers.add(i);
		}
		System.out.println("La liste contient : " + centPremiersEntiers.size() + " élément(s)");
	}

}
