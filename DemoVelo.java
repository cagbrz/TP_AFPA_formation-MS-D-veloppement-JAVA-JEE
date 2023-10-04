package tp1;

/** Classe de tests pour la classe @class velo */
public class DemoVelo {
	
	/**
	 * donne la vitesse du velo	
	 * @param vitesseVelo
	 * @param velo
	 */
		
	public static void bridageVelo(Velo velo) {
		while(velo.getVitesseVelo() < 40) {
			velo.setVitesse(velo.getVitesseVelo()+3);
			velo.imprimeEtat();
		}
	}
	
	public static void freinageVelo(Velo velo) {
		for (int i = velo.getVitesseVelo() ; i >= 0 ; i --) {
			
		}
	}
	
	public static void main(String[] args) {
		/*
		// Genere deux objets differents du type Velo
		Velo velo1 = new Velo();
		Velo velo2 = new Velo();

		// Invoque les methodes
		velo1.imprimeEtat();
		velo2.imprimeEtat();

		bridageVelo(velo1);
		 */
		Velo velo = new Velo();
		velo.setVitesse(45);
		for (int i = 0 ; i < 20 ; i ++) {
			velo.freiner(5);
			velo.imprimeEtat();
		}
		
		
	} 
}