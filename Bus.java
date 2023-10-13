package tp4_bis;

public class Bus extends Vehicule{

	public Bus(String immat) {
		super(immat, 4, 0);
	}
	
	public int VitesseMax() {
		super.VitesseMax();
		return 150;
	}
}
