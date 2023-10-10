package tp3_bis;

public class BiblioDemo_bis {

	/**
	 * public static void main(String[] args) {
        Livre livre = new Livre("Harry Potter", "JK Rowling", "Poche",Egenre.Document,15);
        Livre livre2 = new Livre("pif", "paf", "pouf", Egenre.Policier,2);

        System.out.println(livre);
        Bibliobus bibliotheque = new Bibliobus("Bibliotheque", 9);
        Bibliobus b1 = new Bibliobus("Veleda", 14);
        b1.ajoutLivre("Les Misérables", "Victor Hugo", "plop");
        b1.ajoutLivre("Le Seigneur des Anneaux", "J.R.R.Tolkien", "Poche");
        b1.ajoutLivre("Harry Potter", "JK Rowling", "Poche");
        b1.afficheBiblio();
        bibliotheque.ajoutLivre("Le Seigneur des Anneaux", "J.R.R.Tolkien", "Poche");
        livre.nouvelExemplaire(5);
        bibliotheque.ajoutLivre("Harry Potter", "JK Rowling", "Poche");
//        bibliotheque.ajoutLivre(livre);

        System.out.println(bibliotheque.afficheBiblio());
        System.out.println("Total Livres: " + bibliotheque.totauxLivres());
        
    }

	 * @param args
	 */
    public static void main(String[] args) {
        // Création d'une instance de Bibliobus avec une capacité de 5 livres
        Bibliobus_bis bibliobus = new Bibliobus_bis("Ma Bibliothèque", 5);

        // Ajout de quelques livres
        bibliobus.ajoutLivre("Titre1", "Auteur1", "Editeur1");
        bibliobus.ajoutLivre("Titre2", "Auteur2", "Editeur2");
        bibliobus.ajoutLivre("Titre3", "Auteur3", "Editeur3");

        // Affichage de la bibliothèque
        System.out.println("Bibliothèque après l'ajout de livres :\n");
        System.out.println(bibliobus.afficheBiblio());

        // Affichage du total d'exemplaires
        System.out.println("Nombre total d'exemplaires dans la bibliothèque : " + bibliobus.totauxLivres());
    }
}

