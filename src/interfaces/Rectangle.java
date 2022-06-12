package interfaces;

public class Rectangle implements ObjetGeometrique {
	private double longueur;
	private double largeur;

	public Rectangle(double longueur, double largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}

	@Override
	public double perimetre() {
		return 2 * (longueur + largeur);
	}

	@Override
	public double surface() {
		return longueur * largeur;
	}

	@Override
	public String toString() {
		return "Rectangle [longueur=" + longueur + ", largeur=" + largeur + ", perimetre=" + perimetre() + ", surface="
				+ surface() + "]";
	}
}
