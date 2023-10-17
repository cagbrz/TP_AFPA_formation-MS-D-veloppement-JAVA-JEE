package tp4_bis;

public class Convoi {
	int taille = 5;
	Vehicule[] tabConvoi = new Vehicule[taille];
	TypeVehicule typeVehicule;
	int indice = 0;
		
	public Convoi(int newTaille) {
		this.taille = newTaille;
		this.indice = 0;
	}
	
	public void ajouteAuConvoi(Vehicule vehicule) {
		this.tabConvoi[indice] = vehicule;
		indice ++;
	}

	public void afficheConvoi() {
		for(int i = 0; i < tabConvoi.length; i++) {
			if (tabConvoi[i]== null) {
				this.indice = i;
				break;
			}
		}
		for(int i = 0; i < tabConvoi.length; i++) {
			if (i < indice) {
				System.out.println("---------------------------Véhicule n°"+(i+1)+"---------------------------");
				System.out.println(tabConvoi[i].toString());
			}
		}
	}
	
	public int vitesseMaxConvoi() {
		int vitesseMaxConvoi = tabConvoi[0].VitesseMax();
		for(int i = 1; i < this.indice; i++) {
			if (tabConvoi[i -1].VitesseMax() <= tabConvoi[i].VitesseMax()) {
				vitesseMaxConvoi = tabConvoi[i-1].VitesseMax();
			}
		}
		return vitesseMaxConvoi;
	}
}
