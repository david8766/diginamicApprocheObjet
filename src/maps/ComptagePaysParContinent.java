package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class ComptagePaysParContinent {

	public static void main(String[] args) {
		List<Pays> paysList = new ArrayList<>();		
		paysList.add(new Pays("France", 65000000 , "Europe"));
		paysList.add(new Pays("Allemagne", 80000000 , "Europe"));
		paysList.add(new Pays("Belgique", 10000000 , "Europe"));
		paysList.add(new Pays("Russie", 150000000 , "Asie"));
		paysList.add(new Pays("Chine", 1400000000 , "Asie"));
		paysList.add(new Pays("Indonésie", 220000000 , "Océanie"));
		paysList.add(new Pays("Australie", 20000000 , "Océanie"));
		
		HashMap<String, Integer> mapPays = new HashMap<String, Integer>();
		
		for (Pays pays : paysList) {
			if (mapPays.containsKey(pays.getContinent())) {
				mapPays.put(pays.getContinent(), mapPays.get(pays.getContinent())+1);			
			} else {
				mapPays.put(pays.getContinent(), 1);
			}
		}
		System.out.println(mapPays);
	}

}
