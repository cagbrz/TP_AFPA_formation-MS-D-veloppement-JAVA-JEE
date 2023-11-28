package tp4_bis;

public class Convoi {
	Vehicule[]	tabConvoi 	= 	new Vehicule[taille];
	int		taille		=	5;
	int 		indice 		= 	0;
	TypeVehicule 	typeVehicule;
		
	public Convoi(int newTaille) {
		this.taille	=	newTaille;
		this.indice	= 	0;
	}

	/**
 	* Ajoute au convoi un véhicule
  	**/
	public void ajouteAuConvoi(Vehicule vehicule) {
		this.tabConvoi[indice] = vehicule;
		indice ++;
	}

	/**
 	* Affiche les différents véhicules présents dans le convoi
  	**/
	public void afficheConvoi() {
		for(int i = 0; i < tabConvoi.length; i++) {
			if (tabConvoi[i]== null) {
				this.indice = i;
				break;
			}
		}
		
		//affiche les informations de chaque véhicule du convoi
		for(int i = 0; i < tabConvoi.length; i++) {
			if (i < indice) {
				System.out.println("---------------------------Véhicule n°"+(i+1)+"---------------------------");
				System.out.println(tabConvoi[i].toString());
			}
		}
	}

	/**
 	* Retourne la vitesse maximale du convoi
  	* Elle correspond à la vitesse maximale du véhicule le plus petit/léger
 	**/
	public int vitesseMaxConvoi() {
		int vitesseMaxConvoi	=	tabConvoi[0].VitesseMax();
		
		for(int i = 1; i < this.indice; i++) {
			if (tabConvoi[i -1].VitesseMax() <= tabConvoi[i].VitesseMax()) {
				vitesseMaxConvoi = tabConvoi[i-1].VitesseMax();
			}
		}
		
		return vitesseMaxConvoi;
	}
}
