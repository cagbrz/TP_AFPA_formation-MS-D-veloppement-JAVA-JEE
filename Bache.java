package tp4_bis;

public class Bache extends Vehicule{
	int chargeBache; 
	
	public Bache(String immat, int charge) {
		super(immat, 4, 20);
		this.chargeBache = charge;
	}
	
	public int VitesseMax() {
		super.VitesseMax();
		
		int vitesse = 0;
		
		if (chargeBache == 0) {
			vitesse = 130;
		} else if (chargeBache <= 3 && chargeBache > 0) {
			vitesse = 110;
		} else if (chargeBache > 3 && chargeBache <= 7) {
			vitesse = 90;
		} else if (chargeBache > 7 && chargeBache < 20) {
			vitesse = 80;
		} else {
			return 0;
		}
		return vitesse;
	}
	
	

}
