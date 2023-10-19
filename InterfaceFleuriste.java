package tp5;

public interface InterfaceFleuriste {
	//Le client, dont l’identité est prenom nom, veut démarrer la composition d’un nouveau bouquet
	public void creationBouquet(String nom, String prenom);
	
	//Le client veut connaître le stock disponible pour la fleur nomFleur
	public int quantiteEnStock(String nomFleur) ;
	
	//Le client veut connaître le prix unitaire de la fleur nomFleur
	public float prixDUneFleur(String nomFleur) ;
	
	//Le client a choisi la fleur nomFleur, et il en veut qte
	public void ajoutFleur(String nomFleur, int qte) ;
	
	//Le client veut maintenant la facture détaillée de son bouquet et son prix.
	//Ce message indique  également que le bouquet en cours de composition est terminé.
	public void facturation();
}
