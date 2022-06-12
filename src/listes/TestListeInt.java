package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestListeInt {

	public static void main(String[] args) {
		List<Integer> entiers = new ArrayList<>();
		entiers.addAll(Arrays.asList(-1, 5, 7, 3, -2, 4, 8, 5));
		for (int i = 0; i < entiers.size(); i++) {
			System.out.println("L'élément " + i + " est : " + entiers.get(i));
		}
		System.out.println("La liste a " + entiers.size() + " éléments.");
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int indexToRemove = -1;
		for (int i = 0; i < entiers.size(); i++) {
			int entier = entiers.get(i);
			max = Integer.max(max, entier);
			min = Integer.min(min, entier);
			if (entier == min) {
				indexToRemove = i;
			}
		}
		entiers.remove(indexToRemove);
		System.out.println("Le max est : " + max);
		System.out.println("Le min est : " + min);

		for (int i = 0; i < entiers.size(); i++) {
			int entier = entiers.get(i);
			if (entier < 0) {
				entiers.set(i, Math.abs(entier));
			}
			System.out.println("L'élément " + i + " est : " + entiers.get(i));

		}

	}

}
