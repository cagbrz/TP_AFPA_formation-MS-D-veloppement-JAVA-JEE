package tp5;

import tp4_bis.Bus;
import tp4_bis.Vehicule;

public class DemoFleurs {
	public static void main(String[] args) {
		Fleur dahlia = new Fleur(TypesFleurs.DAHLIA, 100, 2);
		Fleur Rose = new Fleur(TypesFleurs.ROSE, 100, 1);
		Fleur Camelia = new Fleur(TypesFleurs.CAMELIA, 100, 3);
		Fleur Iris = new Fleur(TypesFleurs.IRIS, 100, 4);
		Fleur Lys = new Fleur(TypesFleurs.LYS, 100, 5);
		
		Bouquet bouquet1 = new Bouquet();
		bouquet1.tabBouquet[0] = Lys;
		bouquet1.tabBouquet[1] = Lys;
		
		
		System.out.println("********************************************* AFFICHE L'ETAT DES FLEURS *********************************************");
		dahlia.afficheEtatFleur();
		Rose.afficheEtatFleur();
		Camelia.afficheEtatFleur();
		Iris.afficheEtatFleur();
		Lys.afficheEtatFleur();
		
		System.out.println("*************************************** RETRAIT D'UNE CERTAINE QUANTITÉ DANS LE STOCK ***************************************\n");
		System.out.println("\nNous avons retirer 15 tiges au stock de dahlias");
		dahlia.retraitQteFleur(12);
		dahlia.afficheEtatFleur();
		System.out.println("\nNous avons retirer 59 tiges au stock de Roses");
		Rose.retraitQteFleur(59);
		Rose.afficheEtatFleur();
		System.out.println("\nNous avons retirer 26 tiges au stock de Camelias");
		Camelia.retraitQteFleur(26);
		Camelia.afficheEtatFleur();
		System.out.println("\nNous avons retirer 3 tiges au stock d'Iris");
		Iris.retraitQteFleur(3);
		Iris.afficheEtatFleur();
		System.out.println("\nNous avons retirer 15 tiges au stock de Lys");
		Lys.retraitQteFleur(150);
		Lys.afficheEtatFleur();
		
		System.out.println("*************************************** AJOUT D'UNE CERTAINE QUANTITÉ DANS LE STOCK ***************************************\n");
		System.out.println("Nous avons ajouté 15 tiges au stock de dahlias");
		dahlia.ajoutQteFleur(15);
		dahlia.afficheEtatFleur();
		System.out.println("\nNous avons ajouté 59 tiges au stock de Roses");
		Rose.ajoutQteFleur(59);
		Rose.afficheEtatFleur();
		System.out.println("\nNous avons ajouté 26 tiges au stock de Camelias");
		Camelia.ajoutQteFleur(26);
		Camelia.afficheEtatFleur();
		System.out.println("\nNous avons ajouté 3 tiges au stock d'Iris");
		Iris.ajoutQteFleur(3);
		Iris.afficheEtatFleur();
		System.out.println("\nNous avons ajouté 15 tiges au stock de Lys");
		Lys.ajoutQteFleur(15);
		Lys.afficheEtatFleur();

		System.out.println("*************************************** AFFICHE LE PRIX D'UN BOUQUET ***************************************\n");
		bouquet1.affichePrixBouquet();
		dahlia.afficheEtatFleur();
		
		System.out.println("*************************************** AFFICHE LE BOUQUET AVEC AJOUT **************************************\n");

		System.out.println(bouquet1.afficherBouquet());
		bouquet1.ajouteFleurBouquet(dahlia, 3);
		System.out.println(bouquet1.afficherBouquet());
	}
}
