package files;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class TestFiles {

	public static void main(String[] args) {
		System.out.println("File separator : "+System.getProperty("file.separator"));
		//Cr�er une repr�sentation du chemin d'un fichier
		Path path = Paths.get("C://files/donnees_communes.csv");
		System.out.println(path.getRoot());
		System.out.println(path.getParent());
		System.out.println(path.getFileName());
		
		//v�rification du type de fichier
		boolean estFichier = Files.isRegularFile(path);
		if(estFichier) {
			System.out.println("C'est un fichier");
		} else {
			System.out.println("Ce n'est pas un fichier");
		}
		//v�rification de la lisibilit�
		boolean estLisible = Files.isReadable(path);
		if(estLisible) {
			System.out.println("Il est lisible...");
		} else {
			System.out.println("Il n'est pas lisible.");
		}
		//v�rification si c'est un r�pertoire
		boolean estRepertoire = Files.isDirectory(path);
		if(estRepertoire) {
			System.out.println("C'est un r�pertoire");
		} else {
			System.out.println("Ce n'est pas un r�pertoire");
		}
		
		//copier un fichier
		Path pathDestinationCopy = Paths.get("C://files/tmp/donnees_communes_copy.csv");
		try {
			System.out.println("On va essayer une copie");
			Files.copy(path, pathDestinationCopy,StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			System.out.println("Probl�me avec la copie de fichier...");
			e.printStackTrace();
		} finally {
			System.out.println("On a essay� une copie");
		}

		//d�placement d'un fichier
		Path pathDestinationMove = Paths.get("C://files/donnees_communes_move.csv");
		try {
			Files.move(path, pathDestinationMove,StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			System.out.println("Probl�me avec le d�placement de fichier...");
			e.printStackTrace();
		}
		
		//supression d'un fichier 
		Path pathToDelete = Paths.get("C://files/tmp/donnees_communes_copy.csv");
		try {
			Files.delete(pathToDelete);
		} catch (IOException e) {
			System.out.println("Probl�me avec la suppression de fichier");
		}
		
		//parcours d'un r�pertoire 
		Path pathDirectory = Paths.get("C://files/tmp/");
		try {
			DirectoryStream<Path> stream = Files.newDirectoryStream(pathDirectory);
			Iterator<Path> iterator = stream.iterator();
			while (iterator.hasNext()) {
				Path pathOfDirectory = iterator.next();
				System.out.println(pathOfDirectory);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//lecture d'un fichier
		try {
			List<String> lines = Files.readAllLines(pathDestinationMove);
			for (String line : lines) {
				System.out.println(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//ecriture dans un fichier
		try {
			List<String> lines = new ArrayList<>();
			lines.add("Bonjour");
			lines.add("le");
			lines.add("monde !");
			Path pathToWrite = Paths.get("C://files/tmp/bonjourlemonde.txt");
			Files.write(pathToWrite, lines);
		} catch (IOException e) {
			e.printStackTrace();
			
		}

	}

}
