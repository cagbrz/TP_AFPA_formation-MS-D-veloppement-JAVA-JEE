package tp4_bis;

public class Bache extends Vehicule{
	int chargeBache; 
	TypeVehicule type; 
	
	public Bache(String immat, int charge) {
		super(immat, 4, 20);
		this.chargeBache = charge;
		this.type = TypeVehicule.Bache;
	}
	
	public int getChargeBache() {return chargeBache;}
	public void setChargeBache(int chargeBache) {this.chargeBache = chargeBache;}
	public TypeVehicule getType() {return type;}
	public void setType(TypeVehicule type) {this.type = type;}



	public int VitesseMax() {	
		int vitesse;
		
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
	
	@Override
	public String toString() {
		return "Type de vehicule : " + this.type + ",\nImmatriculation : " + this.immatriculation + ",\nPoids à vide du véhicule : " + 
				this.PoidsAVide + " tonnes,\nCharge maximum du véhicule : " + this.chargeMaximum + " tonnes,\nCharge actuelle : " + 
				this.chargeBache + " tonnes"+"\nLa vitesse est de: "+VitesseMax()+" km/h\n";
	}

	@Override
	public int poidsTotal() {
		return (this.chargeBache + 4);
	}

}
