package entites;

public class TestPersonne {

	public static void main(String[] args) {
		Personne pers1 = new Personne("Doe", "Jhon", new AdressePostale(16, "rue des près", "75001", "Paris"));
		Personne pers2 = new Personne("Tor", "Mark", new AdressePostale(35, "rue des roses", "13000", "Marseille"));
		System.out.println(pers1.toString());
		System.out.println(pers2.toString());


	}

}
