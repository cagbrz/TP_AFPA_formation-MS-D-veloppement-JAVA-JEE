package Bibliobus;

public class DemoBibliobus {

	public static void main(String[] args) {
		Bibliobus b1 = new Bibliobus("Veleda");
		b1.ajoutLivre("Les misérables", "Victor Hugo", "Eyrolls");
		b1.ajoutLivre("Enquêtes Impossible", "Pierre Bellemarre", "Eyrolls");
		b1.ajoutLivre("Don Von-room", "Chanks", "IBM");

		b1.afficheCatalogue();
		// ****************************************//
		b1.afficheLivre(1);
	}

}
