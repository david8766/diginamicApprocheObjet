package interfaces;

public class TestObjetGeometrique {

	public static void main(String[] args) {
		ObjetGeometrique[] objets = new ObjetGeometrique[2];
		objets[0] = new Cercle(25.5);
		objets[1] = new Rectangle(48, 12);
		for (ObjetGeometrique objetGeometrique : objets) {
			System.out.println(objetGeometrique.toString());
		}

	}

}
