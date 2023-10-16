package tp4_bis;

public class Convoi {
	int taille = 5;
	Vehicule[] tabConvoi = new Vehicule[taille];
	TypeVehicule typeVehicule;
	int indice;
		
	public Convoi(int newTaille) {
		this.taille = newTaille;
		this.indice = 0;
	}
	
	public void ajouteAuConvoi(Vehicule vehicule) {
		this.tabConvoi[indice] = vehicule;
		indice ++;
	}
	
	//public String toString() {
	//	return "Type de vehicule : " + this.typeVehicule + ",\nImmatriculation : " + this.immatriculation + ",\nPoids à vide du véhicule : " + this.PoidsAVide
	//			+ " tonnes,\nCharge maximum du véhicule : " + this.chargeMaximum + " tonnes,\nCharge actuelle : " + this.charge + "tonnes";
	//}

	public void afficheConvoi() {
		for(int i = 0; i < tabConvoi.length; i++) {
			if (tabConvoi[i]== null) {
				this.indice = i;
				break;
			}
		}
		for(int i = 0; i < tabConvoi.length; i++) {
			if (i < indice) {
				System.out.println("---------------------------Véhicule n°"+i+"---------------------------");
				System.out.println(tabConvoi[i].toString());
			}
		}
	}
}
