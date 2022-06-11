package entites;

public class Personne {
	String nom;
	String prenom;
	AdressePostale adresse;

	public Personne(String nom, String prenom, AdressePostale adresse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", ville=" + adresse.ville + "]";
	}
}
