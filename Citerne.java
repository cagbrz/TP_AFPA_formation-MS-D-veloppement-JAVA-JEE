package tp4_bis;

public class Citerne extends Vehicule {
	
	int chargeCiterne;
	
	public Citerne(String immat, int charge) {
		super(immat, 3, 10);
		this.chargeCiterne = charge;
	}
	public int VitesseMax(int charge) {
		super.VitesseMax();
		
		int vitesse = 0;
		
		if (chargeCiterne == 0) {
			vitesse = 130;
		} else if (chargeCiterne <= 3 && chargeCiterne > 0) {
			vitesse = 110;
		} else if (chargeCiterne > 3 && chargeCiterne <= 7) {
			vitesse = 90;
		} else if (chargeCiterne > 7 && chargeCiterne < 10) {
			vitesse = 80;
		} else {
			return 0;
		}
		return vitesse;
	}

}
