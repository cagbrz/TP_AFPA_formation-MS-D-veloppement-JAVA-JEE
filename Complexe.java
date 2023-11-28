package tp2;

public class Complexe {
	static	int modulo		= 	0;
	static	int sommeReels		= 	0;
	static	int multReels		= 	0;
	static	int sommeImaginaires	=	0;
	static	int multImaginaires;
	private	int imaginaire;
	private	int reel;
	private	int cos;
	private	int sin;
	
	public Complexe(int newReel, int newImaginaire) {
		this.modulo		=	0;
		this.sommeReels		=	0;
		this.multReels		=	0;
		this.sommeImaginaires	=	0;
		this.multImaginaires	=	0;
		this.imaginaire		= 	newImaginaire;
		this.reel		=	newReel;
	}

	public int getReel() {
		return this.reel;
	}
	
	public void setReel(int reel) {
		this.reel = reel;
	}
	
	public int getImaginaire() {
		return this.imaginaire;
	}
	
	public void setImaginaire(int imaginaire) {
		this.imaginaire = imaginaire;
	}
	
	public int module(int reel, int imaginaire) {
		Complexe.modulo = reel * reel + imaginaire * imaginaire;
		return Complexe.modulo;
	}
	
	public int sommeDeuxReels(int reel1, int reel2) {
		Complexe.sommeReels = reel1 + reel2;
		return sommeReels;
	}
	public int multiplicationDeuxReels(int reel1, int reel2) {
		Complexe.multReels = reel1 * reel2;
		return multReels;
	}
	
	public int sommeDeuxImaginaires(int imaginaire1, int imaginaire2) {
		Complexe.sommeImaginaires = imaginaire1 + imaginaire2;
		return sommeImaginaires;
	}
	
	public int multDeuxImaginaires(int imaginaire1, int imaginaire2) {
		Complexe.multImaginaires = imaginaire1 * imaginaire2;
		return multImaginaires;
	}

	public int cosComplexe() {
		this.cos = this.reel/module(this.reel, this.imaginaire);
		return cos;
	}
	
	public int sinComplexe() {
		this.sin = this.imaginaire/module(this.reel, this.imaginaire);
		return this.sin;
	}
	
	public Complexe newComplexe(Complexe truc) {
		int newReel		=	this.reel + truc.getReel();
		int newImaginaire	=	this.imaginaire + truc.getImaginaire();
	
		return new Complexe(newReel, newImaginaire);
	}

	public static void main (String[] args) {
		Complexe c1	=	new Complexe(3, 6);
		Complexe c2	=	new Complexe (5,6);
		
		c1.module(3, 2);
		c1.newComplexe(c1);
		
		System.out.println("modulo: " + modulo);
//		System.out.println("somme de c1 et C2: " + newCÒomplexe());
	}
	
}
