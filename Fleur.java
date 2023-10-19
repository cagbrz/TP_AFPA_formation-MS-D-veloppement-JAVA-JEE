package tp5;

public class Fleur {
	TypesFleurs fleur;
	int qteFleurEnStock;
	float prixFleur;
	
	public Fleur(TypesFleurs newfleur, int quantité, float nouveauPrixFleur) {
		this.fleur = newfleur;
		this.prixFleur = nouveauPrixFleur;
		this.qteFleurEnStock = quantité;
	}
	
	public TypesFleurs getFleur() {return fleur;}
	public int getQteFleur() {return qteFleurEnStock;}
	public void setQteFleur(int qteFleur) {this.qteFleurEnStock = qteFleur;}
	public float getPrixFleur() {return prixFleur;}

	public int ajoutQteFleur(int quantite) {
		this.qteFleurEnStock += quantite;
		return qteFleurEnStock;
	}
	
	public void CasParticulierRetraitQuantite(int quantite) {
		int count = 0;
		int qte;
		int qteFinaleRetire;
		qte = this.qteFleurEnStock -= quantite;
		while (qte !=0) {
			count ++;
			qte ++;
		}
		qteFinaleRetire = quantite - count;
		this.qteFleurEnStock += count;
		System.out.println("La quantité demandée était supérieur au stock de tiges présent pour cette fleur.");
		System.out.println("Nous avons donc retirer le maximum de tiges possibles, c'est-à-dire "+qteFinaleRetire+" tiges.");
	}
	
	public void retraitQteFleur(int quantite) {
		if (quantite > this.qteFleurEnStock) {
			CasParticulierRetraitQuantite(quantite);
		} else {
			this.qteFleurEnStock -= quantite;
		}
	}
	
	public void afficheEtatFleur() {
		System.out.println("------------------------------"+this.fleur+"------------------------------");
		System.out.println("Le prix de la fleur est de: "+this.prixFleur+" € la tige");
		System.out.println("Le stock de la fleur est de: "+this.qteFleurEnStock+" tiges\n");
	}

	@Override
	public String toString() {
		return "\nFleur: " + fleur + "\nQuantite de Fleurs : " + qteFleurEnStock + "\nPrix d'une fleur: " + prixFleur+"\n";
	}
	
	
	
}
