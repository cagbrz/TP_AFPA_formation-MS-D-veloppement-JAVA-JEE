package tp4;

public class HabitationIndividuelle extends Habitation {
	private int NbrePieces;
	private boolean Piscine;
	
	public int getNbrePieces() {return NbrePieces;}
	public void setNbrePieces(int nbrePieces) {NbrePieces = nbrePieces;	}
	public boolean isPiscine() {return Piscine;}
	public void setPiscine(boolean piscine) {Piscine = piscine;}
	
	public HabitationIndividuelle(String P, String A, double S, int NbreP, boolean pi) {
		super(P, A, S);
		// TODO Auto-generated constructor stub
		this.NbrePieces = NbreP;
		this.Piscine = pi;
	}
	
	public double impot() {
		double resultat = super.impot();
		resultat = resultat + getNbrePieces()*100;
		if (isPiscine() == true) {
			resultat += 500;
		} 
		return resultat;
	}

	//d’affiche les trois attributs de la classe Habitation
	public void Affiche() {
		super.Affiche();
		System.out.println("Voici le nombre de pièces de l'habitation: " + getNbrePieces());
		System.out.println("Présence de piscine : " + isPiscine());
	}

}
