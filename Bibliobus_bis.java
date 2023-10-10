package tp3_bis;

import tp3_bis.Egenre;
import tp3_bis.Livre;

public class Bibliobus_bis {
	private String name;
	private Livre[] biblio;
	private int livreCount; // Pour suivre le nombre actuel de livres dans le tableau
	
	public Bibliobus_bis(String name, int capacity) {
		this.name = name;
		if (capacity > 200) {
			System.out.println("La capacité maximum de la bibliothèque est de 200.");
			this.biblio = new Livre[200];
		} else {
			this.biblio = new Livre[capacity];
		}
		this.livreCount = 0;
		
	}

	public int totauxLivres() {
		int totaux = 0;
		for (int i = 0; i < livreCount; i++) {
			totaux += biblio[i].getNbreExemplaires();
			}
		return totaux;
	}

	public String afficheBiblio() {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < livreCount; i++) {
			result.append(biblio[i].toString()).append("\n");
		}
		return result.toString();
	}

	public String getName() { return name; }
	public void setName(String name) { this.name = name;}
	public Livre[] getBiblio() { return biblio; }
	public String getTitre(int id) { return biblio[id].getTitre(); }
	public String getAuteur(int id) { return biblio[id].getAuteur(); }
	public String getEditeur(int id) { return biblio[id].getEditeur(); }
	public int getNbExemp(int id) { return biblio[id].getNbreExemplaires(); }
	public Egenre getGenre(int id) { return biblio[id].getGenre(); }
	
	public void ajoutLivre(String titre, String auteur, String editeur) {
		if (livreCount < biblio.length) {
			Livre nouveauLivre = new Livre(titre, auteur, editeur);
			biblio[livreCount] = nouveauLivre;
			livreCount++;
		}
	}
	
	public void afficheLivre(int id) {
		String ch = "[ " + id + " ] " + this.getTitre(id)
		+ " " + this.getAuteur(id) + " " + this.getEditeur(id)
		+ " " + this.getGenre(id) + " . Nombre exemplaires : "
		+ this.getNbExemp(id);
		System.out.println(ch);
	}
	    
	public void afficheListLivrePresent(Egenre genre) {
		for(int i = 0; i < biblio.length; i++) {
			if (biblio[i].estPresent()) {
				this.afficheLivre(i);
			}
		}
	}
	    
	public void afficheLivreParGenre(Egenre g) {
		for(int i = 0; i < biblio.length; i++) {
			if(getGenre(i) == g) {
				this.afficheLivre(i);
			}
		}
	}

	public boolean estConnu(Livre lv) {
		for(int i = 0; i < biblio.length; i++) {
			if(biblio[i].equals(lv)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean reellementPresent(int id) {
		if(biblio[id].estPresent()) {
			return true;
		}
		return false;
	}

	public boolean reellementPresent(Livre lv) {
		if(lv.estPresent()) {
			return true;
		}
		return false;
	}
	
	public int nbExemplaires(int id) { return this.getNbExemp(id); }
	public int nbExemplaires(Livre lv) { return lv.getNbreExemplaires(); }
		
	// On écrase la case d'indice id 
	// avec la dernière case du catalogue
	public void sortirLivre(int id) {
		int limite = biblio.length;
		if(id < limite) {
			biblio[id] = biblio[limite-1];
			limite --;
		}
	}
		
	///////////////////////////////////////////////
	// 2 ème méthode : avec un décalage à gauche
	public void sortirLivre2(int id) {
		int limite = biblio.length;
		if(id < limite) {
			for(int i = id; i < limite -1; i++) {
				biblio[i] = biblio[i+1];
			}
			limite --;
		}
	}
	

	public String upTitre(String titreLivre) {
		titreLivre = titreLivre.toUpperCase();
		return titreLivre;
	}
	
	
	public String upTitreEtAuteur(String auteur) {
		auteur = auteur.toUpperCase();
		return auteur;
	}

	
	public int getNbreExemplairesAuteur(String auteur) {
		int total = 0;
		for(int i = 0; i < biblio.length; i++) {
			if(getAuteur(i) == auteur) {
				total = total + getNbExemp(i);
				System.out.println(i);
			}
		}
		return total;
	}

	public int getNbreExemplairesGenre(String genre) {
		int total = 0;
		for(int i = 0; i < biblio.length; i++) {
			if(getAuteur(i) == genre) {
				total = total + getNbExemp(i);
				System.out.println(i);
			}
		}
		return total;
	}

}
