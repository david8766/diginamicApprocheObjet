package tri;

import java.util.Comparator;

public class ComparatorHabitant implements Comparator<Ville> {

	public int compare(Ville ville1, Ville ville2) {
		if (ville1.getNbHabitants() > ville2.getNbHabitants()) {
			return 1;
		}
		if (ville1.getNbHabitants() < ville2.getNbHabitants()) {
			return -1;
		}
		return 0;
	}

}
