package tp3;

public class Livre {
	private static String titre;
	private static String nomAuteur;
	private static String editeur; 
	int nbreExemplaires;
	static String genre;
	private static int getNbreExemplaires; 
	
	public Livre (String newTitre, String NewNomAuteur, String NewEditeur) {
		Livre.setTitre(newTitre);
		Livre.nomAuteur = NewNomAuteur;
		Livre.editeur = NewEditeur;
		this.nbreExemplaires = 1;
		this.genre = "Non spécifié";
	}
	//Implémentation de tous les getters et setters necessaires
	public static String getTitre() {
		return titre;
	}

	public static void setTitre(String newTitre) {
		Livre.titre = newTitre;
	}
	
	public static String getNomAuteur() { 
		return nomAuteur;
	}

	public static void setNomAuteur(String newNomAuteur) {
		Livre.nomAuteur = newNomAuteur;
	}
	
	public static String getEditeur() {
		return editeur;
	}

	public static void setEditeur(String newEditeur) {
		Livre.nomAuteur = newEditeur;
	}

	public int getNbreExemplaires() {
		return nbreExemplaires;
	}

	public void setNbreExemplaires (int newNbreExemplaire) {
		this.nbreExemplaires = newNbreExemplaire;
	}
	
	public static void setGenre(String Newgenre) {
		Livre.genre = Newgenre;
	}
	
	public static String getGenre() {
		return genre;
	}

	//création de la fonction nouvelExemplaire() qui ajoute 1 au nombre d'exemplaires déjà existants
	public void nouvelExemplaire() {
		this.nbreExemplaires = this.nbreExemplaires + 1;
	}
	
	//création de la fonction nouvelExemplaire(int nb) qui ajoute un nombre nb au nombre d'exemplaires déjà existants
	public void nouvelExemplaire(int nb) {
		this.nbreExemplaires = this.nbreExemplaires + nb;
	}
	
	//création de la fonction nouvelExemplaire() qui supprime 1 au nombre d'exemplaires déjà existants
	public void perteExemplaire() {
		this.nbreExemplaires = this.nbreExemplaires - 1;
	}
	
	//création de la fonction nouvelExemplaire() qui supprime 1 au nombre d'exemplaires déjà existants
	public void perteExemplaire(int nb) {
		this.nbreExemplaires = this.nbreExemplaires - nb;
	}

	//retourne une chaîne de caractères qu’on souhaiterait voir si on veut afficher toutes les caractéristiques d’un livre
	public String toString() {
		String newString;
		newString = "Titre: " + Livre.titre + "\nNom de l'auteur: " + Livre.nomAuteur+ "\nEditeur: " + Livre.editeur + 
				"\nNombre d'exemplaires présents: " + Livre.getNbreExemplaires + "\nGenre du livre: " + Livre.getGenre();
		return newString;
	}
	
	public boolean estPresent() {
		int nbLivre = getNbreExemplaires;
		if (nbLivre == 0) {
			return false; 
		}
		return true; 
	}

//	retourne vrai si le livre passé en paramètre et l’instance courante (celui qui exécute la méthode) sont les mêmes, faux sinon.
//	public boolean equals(Livre l) {
//		if(){
//			return true
//		}
//		return false
//	}
	
	//retourne une nouvelle instance de Livre ayant le même titre, le même auteur et le même genre que le livre qui exécute cette méthode
	public void nouvelEditeur(String unEditeur) {
		Livre.titre = titre;
		Livre.nomAuteur = nomAuteur;
		Livre.editeur = unEditeur;
		this.nbreExemplaires = getNbreExemplaires();
		this.genre = "Non spécifié";
	}
}
