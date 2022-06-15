package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ManipulationFichier {
	
	public static void main(String[] args) {
		//lecture fichier csv
		Path pathToRecensement = Paths.get("C://files/donnees_communes.csv");
		Path pathToBigTownFile = Paths.get("C://files/donnees_big_communes.csv");
		try {
			List<String> lines = Files.readAllLines(pathToRecensement);
			List<String> linesToWrite = new ArrayList<>();
			linesToWrite.add("COMMUNE;DEPARTEMENT;POPULATION_TOTALE");
			for(int i = 1;i<lines.size();i++) {
			
				String[] columns = lines.get(i).split(";");
				int populationTotale = Integer.parseInt(columns[9]); 
				if( populationTotale >= 25000 ) {
					String lineToWrite = "";
					//exemple avec StringBuilder
					StringBuilder sb = new StringBuilder();
					sb.append(columns[6]).append(";").append(columns[2]).append(";").append(columns[9]);
					lineToWrite = sb.toString();
					//exemple avec concat normal
					lineToWrite = columns[6] + ";" + columns[2] + ";" + columns[9];
					linesToWrite.add(lineToWrite);
				}
			} 
			Files.write(pathToBigTownFile, linesToWrite);
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
}
