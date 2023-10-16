package tp4_bis;

public class VehiculeDemo {
	public static void main(String[] args) {
		Vehicule vehicule1 = new Bus("EB-162-TT");
		
		Vehicule vehicule2 = new Citerne("6592 YG 62", 0);
		Vehicule vehicule3 = new Citerne("6592 YG 62", 2);
		Vehicule vehicule4 = new Citerne("6592 YG 62", 6);
		Vehicule vehicule5 = new Citerne("6592 YG 62", 8);
		Vehicule vehicule6 = new Citerne("6592 YG 62", 11);
		
		Vehicule vehicule7 = new Bache("AB-6992-ES", 0);
		Vehicule vehicule8 = new Bache("AB-6992-ES", 2);
		Vehicule vehicule9 = new Bache("AB-6992-ES", 5);
		Vehicule vehicule10 = new Bache("AB-6992-ES", 15);
		Vehicule vehicule11 = new Bache("AB-6992-ES", 21);

		Convoi c1 = new Convoi(5);
		c1.ajouteAuConvoi(vehicule1);
		c1.ajouteAuConvoi(vehicule4);
		c1.ajouteAuConvoi(vehicule7);
		
		System.out.println("**************************************************TESTS SUR LA VITESSE DU BUS*********************************************************************************************");
		System.out.println("Test de la fonction vitesse()\n");
		System.out.println("Cette fonction calcule la vitesse du vehicule en fonction de son type et de sa charge\n");
		System.out.println("Ici, nous avons un véhicule de type Bus");
		System.out.println("Le bus peut donc rouler au maximum à " + vehicule1.VitesseMax() + " Km/h.\n");

		System.out.println("\n***********************************************TESTS SUR LA VITESSE DU CAMION CITERNE************************************************************************************");
		System.out.println("Test de la fonction vitesse()\n");
		System.out.println("cette fonction calcule la vitesse du vehicule en fonction de son type et de sa charge\n");
		System.out.println("Ici, nous avons un véhicule de type camion citerne");
		System.out.println("----------Le poids du véhicule est de 0 tonnes----------");
		System.out.println("Le camion citerne peut donc rouler au maximum à " + vehicule2.VitesseMax() + " Km/h.\n");
		System.out.println("----------Le poids du véhicule est de 2 tonnes----------");
		System.out.println("Le camion citerne peut donc rouler au maximum à " + vehicule3.VitesseMax() + " Km/h.\n");
		System.out.println("----------Le poids du véhicule est de 5 tonnes----------");
		System.out.println("Le camion citerne peut donc rouler au maximum à " + vehicule4.VitesseMax() + " Km/h.\n");
		System.out.println("----------Le poids du véhicule est de 8 tonnes----------");
		System.out.println("Le camion citerne peut donc rouler au maximum à " + vehicule5.VitesseMax() + " Km/h.\n");
		System.out.println("----------Le poids du véhicule est de 11 tonnes----------");
		System.out.println("Le camion citerne peut donc rouler au maximum à " + vehicule6.VitesseMax() + " Km/h.\n");
		
		System.out.println("\n***********************************************TESTS SUR LA VITESSE DU CAMION BÂCHÉ**************************************************************************************");
		System.out.println("Test de la fonction vitesse()\n");
		System.out.println("cette fonction calcule la vitesse du vehicule en fonction de son type et de sa charge\n");
		System.out.println("Ici, nous avons un véhicule de type camion bâché");
		System.out.println("----------Le poids du véhicule est de 0 tonnes----------");
		System.out.println("Le camion bâché peut donc rouler au maximum à " + vehicule7.VitesseMax() + " Km/h.\n");
		System.out.println("----------Le poids du véhicule est de 2 tonnes----------");
		System.out.println("Le camion bâché peut donc rouler au maximum à " + vehicule8.VitesseMax() + " Km/h.\n");
		System.out.println("----------Le poids du véhicule est de 5 tonnes----------");
		System.out.println("Le camion bâché peut donc rouler au maximum à " + vehicule9.VitesseMax() + " Km/h.\n");
		System.out.println("-----------Le poids du véhicule est de 15 tonnes----------");
		System.out.println("Le camion bâché peut donc rouler au maximum à " + vehicule10.VitesseMax() + " Km/h.\n");
		System.out.println("----------Le poids du véhicule est de 21 tonnes----------");
		System.out.println("Le camion bâché peut donc rouler au maximum à " + vehicule11.VitesseMax() + " Km/h.\n");
		
		System.out.println("\n***********************************************TESTS SUR LA L'AFFICHAGE DU CONVOI**************************************************************************************");
		System.out.println("Creation d'un convoi c1 avec la ligne 'Convoi c1 = new Convoi(5);'");
		System.out.println("Ajout des véhicules 1, 4 et 7 avec la fonction ajouteAuConvoi(Vehicule vehicule)\n");
		System.out.println("Test de la fonction AfficheConvoi()");
		System.out.println("cette fonction affiche les differents véhicules présents dans le convoi\n");
		c1.afficheConvoi();
	}
}
