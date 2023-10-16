package tp4_bis;

public class Bus extends Vehicule{

	TypeVehicule type;
	
	public Bus(String immat) {
		super(immat, 4, 0);
		this.type = TypeVehicule.Bus;
	}
	
	public TypeVehicule getType() {return type;}
	public void setType(TypeVehicule type) {this.type = type;}

	public int VitesseMax() {
		return 150;
	}

	@Override
	public String toString() {
		return "Type de vehicule : " + this.type + ",\nImmatriculation : " + this.immatriculation + ",\nPoids à vide du véhicule : " + 
				this.PoidsAVide + " tonnes" +  "\nLa vitesse est de: "+VitesseMax()+" km/h\n";
	}
}
