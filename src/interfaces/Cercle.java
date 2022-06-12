package interfaces;

public class Cercle implements ObjetGeometrique {
	private double r;

	public Cercle(double r) {
		super();
		this.r = r;
	}

	@Override
	public double perimetre() {
		return 2 * Math.PI * r;
	}

	@Override
	public double surface() {
		return Math.PI * r * r;
	}

	@Override
	public String toString() {
		return "Cercle [r=" + r + ", perimetre=" + perimetre() + ", surface=" + surface() + "]";
	}
}
