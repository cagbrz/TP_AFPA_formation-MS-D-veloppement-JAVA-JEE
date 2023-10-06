package tp3;

public class DemoLivre {
	public static void main(String[] args) {
		Livre livre = new Livre("Harry Potter", "JK Rowling", "Poche");
		Livre livre2 = new Livre("Harry Potter", "JK Rowling", "Poche");
		System.out.println("Titre du livre: "+livre.getTitre());
		System.out.println("Auteur du livre: "+livre.getNomAuteur());
		System.out.println("Editeur du livre: "+livre.getEditeur());
		
		int nb = 4;
		System.out.println("Nombre d'exemplaires du livre présents dans la bibliotèque: "+livre.getNbreExemplaires());
		
		System.out.println("Genre du livre: "+livre.getGenre());
		System.out.println("\nJouons avec le nombre d'exemplaires:\n");
		System.out.println("Nombre de livres à la base = " + livre.nbreExemplaires);
		livre.nouvelExemplaire();
		System.out.println("Nombre de livres après la fonction 'nouvelExemplaire()': " + livre.nbreExemplaires);
		livre.nouvelExemplaire(nb);
		System.out.println("Nombre de livres après la fonction 'nouvelExemplaire(int nb)' avec nb = " + nb + ": " + livre.nbreExemplaires);
		livre.perteExemplaire();
		System.out.println("Nombre de livres après la fonction 'perteExemplaire': " + livre.nbreExemplaires);
		livre.perteExemplaire(nb);
		System.out.println("Nombre de livres après la fonction 'perteExemplaire(int nb)' avec nb = "+ nb +" : " + livre.nbreExemplaires);
		
		System.out.println("\n\nCréation de la fonction toString() \nqui retourne la chaine de caractère qu'o souhaiterais voir \nsi on veut afficher toutes les caractéristiques d'un livre.\n");
		livre.toString();
		System.out.println("Affiche la fonction toString: \n" + livre.toString());
		
		System.out.println("\n\nVérifions maintenant si le livre est déjà présent dans la bibliotèque");
		System.out.println("Si estPresent() return 'True', alors il y a au moins un exemplaire dans la bibliotèque");
		System.out.println("Si estPresent() return 'False', alors il n'y a aucun exemplaire dans la bibliotèque");
		System.out.println("Voici le nombre d'exemplaire présents dans la bibliotèque: " + livre.nbreExemplaires);
		System.out.println("estPresent: " + livre.estPresent());
		livre.nouvelExemplaire();
		System.out.println("Nombre de livres après la fonction 'nouvelExemplaire()': " + livre.nbreExemplaires);
		System.out.println("Nous avons ajouté un exemplaire avec la fonction nouvelExemplaire()");
		System.out.println("estPresent: " + livre.estPresent());
		livre.perteExemplaire(2);
		System.out.println("Nombre de livres après la fonction 'perteExemplaire(int nb)' avec nb = 2: " + livre.nbreExemplaires);
		System.out.println("estPresent: " + livre.estPresent());
		
		System.out.println("\n\nnouvelEditeur retourne une nouvelle instance de Livre ayant: \n- le même titre, \n- le même auteur \n- et le même genre que le livre qui exécute cette méthode\n");
		livre.nouvelEditeur("blabla");
		System.out.println("Voici ce que retourne la fonction lorsque nous rentrons 'livre.nouvelEditeur(\"blabla\");': \n"+livre.toString());
		
	}
}
