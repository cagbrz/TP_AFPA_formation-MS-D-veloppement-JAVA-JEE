package tp5;

import java.util.Arrays;

public class Bouquet {
	int taille = 10;
	Fleur [] tabBouquet = new Fleur[10];
	int PrixBouquet;
	
	public Bouquet() {
		this.PrixBouquet = 0;
		this.tabBouquet = new Fleur[10];
		this.taille = 10;
	}
	//ajoute une quantite d'un même type de fleurs dans un bouquet
	public void ajouteFleurBouquet(Fleur fleur) {
		int count = 0;
		while(count < taille) {
			if (tabBouquet[count] != null) {
				count ++;
			}
		}
		tabBouquet[count] = fleur;
	}
	//ajoute une quantite d'un même type de fleurs dans un bouquet
	public void ajouteFleurBouquet(Fleur fleur, int qte) {
		int count = 0;
		while(count < taille) {
			if (tabBouquet[count] != null) {
				count ++;
			}
		}
		//for (int i = 0; i<qte; i++) {
		//	tabBouquet[count] = fleur;
		//}
		
		this.tabBouquet[count].qteFleurEnStock = qte;
	}
	
	public String afficherBouquet() {
		String message = "";
		int i = 0;
		
		while(tabBouquet[i] != null ) {
			for(i = 0; i<tabBouquet.length-1; i++) {
				message = message +"\n" +this.toString();
			}
		}
		return message;

	}

	@Override
	public String toString() {
		return "\nBouquet \nTaille du bouquet: " + taille + "\nTabBouquet: " + Arrays.toString(tabBouquet) + "\nPrix du bouquetBouquet: " + PrixBouquet + "\n";
	}
	
	public void affichePrixBouquet() {
		System.out.println("Le prix du bouquet est de " + this.PrixBouquet + " €.");
	}

}
