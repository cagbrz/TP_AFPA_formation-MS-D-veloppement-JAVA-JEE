package tp4_bis;

public class VehiculeDemo {
	public static void main(String[] args) {
		float consoVehicule;
		
		Utilitaires ut = new Utilitaires();
		
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
		
		Convoi c2 = new Convoi(5);
		c2.ajouteAuConvoi(vehicule1);
		c2.ajouteAuConvoi(vehicule2);
		c2.ajouteAuConvoi(vehicule5);
		c2.ajouteAuConvoi(vehicule10);
		
		Convoi c3 = new Convoi(5);
		c3.ajouteAuConvoi(vehicule1);
		c3.ajouteAuConvoi(vehicule4);
		c3.ajouteAuConvoi(vehicule3);
		c3.ajouteAuConvoi(vehicule10);
		c3.ajouteAuConvoi(vehicule8);
		
		//consoVehicule = ut.consommation(vehicule1.VitesseMax(), vehicule1.poidsTotal());
		
		System.out.println("**************************************************TESTS SUR LA VITESSE DU BUS*********************************************************************************************");
		System.out.println("Test de la fonction vitesse()\n");
		System.out.println("Cette fonction calcule la vitesse du vehicule en fonction de son type et de sa charge\n");
		System.out.println("Ici, nous avons un véhicule de type Bus");
		System.out.println("Le bus peut donc rouler au maximum à " + vehicule1.VitesseMax() + " Km/h.\n");

		System.out.println("************************************************TESTS SUR LA CONSOMMATION DU BUS*******************************************************************************************");
		System.out.println("Test de la fonction consommation (int v, int p), avec v la vitesse du bus et p son poids\n");
		System.out.println("Cette fonction calcule la consommation du bus en fonction de sa vitesse et de son poids total\n");
		System.out.println("Ici, nous avons un véhicule de type Bus");
		System.out.println("La consommation du bus est donc de " + ut.consommation(vehicule1.VitesseMax(), vehicule1.poidsTotal()) + " litres pour 100 km.\n");

		
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
		
		System.out.println("**********************************************TESTS SUR LA CONSOMMATION DU CAMION CITERNE*****************************************************************************************");
		System.out.println("Test de la fonction consommation (int v, int p), avec v la vitesse du bus et p son poids\n");
		System.out.println("Cette fonction calcule la consommation du bus en fonction de sa vitesse et de son poids total\n");
		System.out.println("Ici, nous avons un véhicule de type camion citerne");
		System.out.println("----------Le poids du véhicule est de 0 tonnes----------");
		System.out.println("La consommation du camion citerne est donc de " + ut.consommation(vehicule2.VitesseMax(), vehicule2.poidsTotal()) + " litres pour 100 km.\n");
		System.out.println("----------Le poids du véhicule est de 2 tonnes----------");
		System.out.println("La consommation du camion citerne est donc de " + ut.consommation(vehicule3.VitesseMax(), vehicule3.poidsTotal()) + " litres pour 100 km.\n");
		System.out.println("----------Le poids du véhicule est de 5 tonnes----------");
		System.out.println("La consommation du camion citerne est donc de " + ut.consommation(vehicule4.VitesseMax(), vehicule4.poidsTotal()) + " litres pour 100 km.\n");
		System.out.println("----------Le poids du véhicule est de 8 tonnes----------");
		System.out.println("La consommation du camion citerne est donc de " + ut.consommation(vehicule5.VitesseMax(), vehicule5.poidsTotal()) + " litres pour 100 km.\n");
		System.out.println("----------Le poids du véhicule est de 11 tonnes----------");
		System.out.println("La consommation du camion citerne est donc de " + ut.consommation(vehicule6.VitesseMax(), vehicule6.poidsTotal()) + " litres pour 100 km.\n");
		
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
		
		System.out.println("**********************************************TESTS SUR LA CONSOMMATION DU CAMION BÂCHÉ*****************************************************************************************");
		System.out.println("Test de la fonction consommation (int v, int p), avec v la vitesse du bus et p son poids\n");
		System.out.println("Cette fonction calcule la consommation du bus en fonction de sa vitesse et de son poids total\n");
		System.out.println("Ici, nous avons un véhicule de type camion bâché");
		System.out.println("----------Le poids du véhicule est de 0 tonnes----------");
		System.out.println("La consommation du camion citerne est donc de " + ut.consommation(vehicule7.VitesseMax(), vehicule7.poidsTotal()) + " litres pour 100 km.\n");
		System.out.println("----------Le poids du véhicule est de 2 tonnes----------");
		System.out.println("La consommation du camion citerne est donc de " + ut.consommation(vehicule8.VitesseMax(), vehicule8.poidsTotal()) + " litres pour 100 km.\n");
		System.out.println("----------Le poids du véhicule est de 5 tonnes----------");
		System.out.println("La consommation du camion citerne est donc de " + ut.consommation(vehicule9.VitesseMax(), vehicule9.poidsTotal()) + " litres pour 100 km.\n");
		System.out.println("-----------Le poids du véhicule est de 15 tonnes----------");
		System.out.println("La consommation du camion citerne est donc de " + ut.consommation(vehicule10.VitesseMax(), vehicule10.poidsTotal()) + " litres pour 100 km.\n");
		System.out.println("----------Le poids du véhicule est de 21 tonnes----------");
		System.out.println("La consommation du camion citerne est donc de " + ut.consommation(vehicule11.VitesseMax(), vehicule11.poidsTotal()) + " litres pour 100 km.\n");
		
		System.out.println("\n***********************************************TESTS SUR LA L'AFFICHAGE DU CONVOI C1**************************************************************************************");
		System.out.println("Creation d'un convoi c1 avec la ligne 'Convoi c1 = new Convoi(5);'");
		System.out.println("Ajout des véhicules 1, 4 et 7 avec la fonction ajouteAuConvoi(Vehicule vehicule)\n");
		System.out.println("Test de la fonction AfficheConvoi()");
		System.out.println("cette fonction affiche les differents véhicules présents dans le convoi\n");
		c1.afficheConvoi();
		
		System.out.println("\n*********************************************TESTS SUR LA VITESSE MAXIMUM DU CONVOI C1************************************************************************************");
		System.out.println("Creation de la fonction vitesseMaxConvoi()");
		System.out.println("Cette fonction calcule la vitesse maximim du convoi,");
		System.out.println("sachant que cette vitesse correspond à la plus petite des visites maximales des vehicules du convoi");
		System.out.println("La vitesse maximale du convoi c1 est de: "+ c1.vitesseMaxConvoi()+" km/h");
		
		System.out.println("\n***********************************************TESTS SUR LA L'AFFICHAGE DU CONVOI C2**************************************************************************************");
		System.out.println("Creation d'un convoi c2 avec la ligne 'Convoi c2 = new Convoi(5);'");
		System.out.println("Ajout des véhicules 1, 2,5 et 10 avec la fonction ajouteAuConvoi(Vehicule vehicule)\n");
		System.out.println("Test de la fonction AfficheConvoi()");
		System.out.println("cette fonction affiche les differents véhicules présents dans le convoi\n");
		c2.afficheConvoi();
		
		System.out.println("\n*********************************************TESTS SUR LA VITESSE MAXIMUM DU CONVOI C2************************************************************************************");
		System.out.println("Creation de la fonction vitesseMaxConvoi()");
		System.out.println("Cette fonction calcule la vitesse maximim du convoi,");
		System.out.println("sachant que cette vitesse correspond à la plus petite des visites maximales des vehicules du convoi");
		System.out.println("La vitesse maximale du convoi c2 est de: "+ c2.vitesseMaxConvoi()+" km/h");
		
		System.out.println("\n***********************************************TESTS SUR LA L'AFFICHAGE DU CONVOI C3**************************************************************************************");
		System.out.println("Creation d'un convoi c3 avec la ligne 'Convoi c3 = new Convoi(5);'");
		System.out.println("Ajout des véhicules 1, 2,4, 3, 1O et 8 avec la fonction ajouteAuConvoi(Vehicule vehicule)\n");
		System.out.println("Test de la fonction AfficheConvoi()");
		System.out.println("cette fonction affiche les differents véhicules présents dans le convoi\n");
		c3.afficheConvoi();
		
		System.out.println("\n*********************************************TESTS SUR LA VITESSE MAXIMUM DU CONVOI C3************************************************************************************");
		System.out.println("Creation de la fonction vitesseMaxConvoi()");
		System.out.println("Cette fonction calcule la vitesse maximim du convoi,");
		System.out.println("sachant que cette vitesse correspond à la plus petite des visites maximales des vehicules du convoi");
		System.out.println("La vitesse maximale du convoi c3 est de: "+ c3.vitesseMaxConvoi()+" km/h");

	}

}
