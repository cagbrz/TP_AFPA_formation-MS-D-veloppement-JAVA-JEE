package tp4_bis;

public class Citerne extends Vehicule {
	TypeVehicule 	type;
	int		chargeCiterne;
	
	public Citerne(String immat, int charge) {
		super(immat, 3, 10);
		this.chargeCiterne	=	charge;
		this.type		=	TypeVehicule.Citerne;
	}
		
	public int getChargeCiterne() {return chargeCiterne;}
	public void setChargeCiterne(int chargeCiterne) {this.chargeCiterne = chargeCiterne;}
	public TypeVehicule getType() {return type;}
	public void setType(TypeVehicule type) {this.type = type;}

	@Override
	public int VitesseMax() {
		int vitesse;
		
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

	@Override
	public String toString() {
		return "Type de vehicule : " + this.type + ",\n" 
			+ "Immatriculation : " + this.immatriculation + ",\n" 
			+ "Poids à vide du véhicule : " + this.PoidsAVide + " tonnes,\n" 
			+ "Charge maximum du véhicule : " + this.chargeMaximum + " tonnes,\n" 
			+ "Charge actuelle : " + this.chargeCiterne + " tonnes"+"\n"
			+ "La vitesse est de: " + VitesseMax() + " km/h\n";
	}

	@Override
	public int poidsTotal() {
		return (this.chargeCiterne + 3);
	}
}
