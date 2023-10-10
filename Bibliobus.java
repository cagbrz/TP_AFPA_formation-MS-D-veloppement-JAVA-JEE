package Bibliobus;

import java.util.Iterator;

public class Bibliobus {
	private String nom;
	private int taille = 100;
	private int limite = 0;
	Livre[] catalogue = new Livre[taille];
	
	public Bibliobus(String nom) {
		this.nom = nom;
	}
	public Bibliobus(String nom, int taille) {
		this.nom = nom;
		this.taille = taille;
	}
	public void ajoutLivre(String titre, String auteur, String editeur) {
		Livre l = new Livre(titre, auteur, editeur);
		if(limite < taille) {
			catalogue[limite] = l;
			limite++;
		}else {
			System.out.println("plus de place");
		}
	}
	public void afficheCatalogue() {
		for(int i = 0; i < limite; i++) {
			System.out.println(catalogue[i]);
		}
	}
	public String getTitre(int id) {
		return catalogue[id].getTitre();
	}
	public String getAuteur(int id) {
		return catalogue[id].getAuteur();
	//Si catalogue est une liste : return catalogue.get(id).getAuteur();
	}
	public String getEditeur(int id) {
		return catalogue[id].getEditeur();
	}
	public int getNbExemp(int id) {
		return catalogue[id].getNbExemp();
	}
	public Egenre getGenre(int id) {
		return catalogue[id].getGenre();
	}
	public void afficheLivre(int id) {
		String ch = "[ " + id + " ] " + this.getTitre(id)
		+ " " + this.getAuteur(id) + " " + this.getEditeur(id)
		+ " " + this.getGenre(id) + " . Nombre exemplaires : "
		+ this.getNbExemp(id);
		System.out.println(ch);
	}
}
