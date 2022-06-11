package entites;

public class TestAdressePostale {

	public static void main(String[] args) {
		AdressePostale uneAdresse = new AdressePostale(15, "rue du marais", "34000", "Montpellier");
		System.out.println(uneAdresse.toString());
		
		AdressePostale uneDeuxiemeAdresse = new AdressePostale(22, "rue des près", "75001", "Paris");
		System.out.println(uneDeuxiemeAdresse.toString());

	}

}
