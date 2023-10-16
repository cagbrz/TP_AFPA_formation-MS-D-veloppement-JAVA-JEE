package tp4_bis;

public abstract class Vehicule {
	String immatriculation;
	int PoidsAVide;
	int chargeMaximum;
	int charge;
	
	public String getImmatriculation() {return immatriculation;}
	public void setImmatriculation(String immatriculation) {this.immatriculation = immatriculation;}
	public int getPoidsAVide() {return PoidsAVide;}
	public void setPoidsAVide(int poidsAVide) {PoidsAVide = poidsAVide;}
	public int getChargeMaximum() {return chargeMaximum;}
	public void setChargeMaximum(int chargeMaximum) {this.chargeMaximum = chargeMaximum;}
	public int getCharge() {return charge;}
	public void setCharge(int charge) {this.charge = charge;}
	
	public Vehicule (String immat, int poidsVide, int chargeMax) {
		this.immatriculation = immat;
		this.PoidsAVide = poidsVide;
		this.chargeMaximum = chargeMax;
	}
	
	public abstract int VitesseMax();
	
	public abstract String toString();

}
