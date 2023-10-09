package tp3;

public class DemoBibliobus {

    public static void main(String[] args) {
        Livre livre = new Livre("Harry Potter", "JK Rowling", "Poche",Egenre.Document,15);
        Livre livre2 = new Livre("pif", "paf", "pouf", Egenre.Policier,2);

        System.out.println(livre);
        Bibliobus bibliotheque = new Bibliobus("Bibliotheque");
        Bibliobus b1 = new Bibliobus("Veleda");
        b1.ajoutLivre("Les Misérables", "Victor Hugo", "plop");
        b1.ajoutLivre("Le Seigneur des Anneaux", "J.R.R.Tolkien", "Poche");
        b1.ajoutLivre("Harry Potter", "JK Rowling", "Poche");
        b1.afficheBiblio();
        bibliotheque.ajoutLivre("Le Seigneur des Anneaux", "J.R.R.Tolkien", "Poche");
        livre.nouvelExemplaire(5);
        bibliotheque.ajoutLivre("Harry Potter", "JK Rowling", "Poche");
        bibliotheque.ajoutLivre(livre);

        System.out.println(bibliotheque.afficheBiblio());
        System.out.println("Total Livres: " + bibliotheque.totauxLivres());
        
    }
}
