package tp4;

public class HabitationProfessionnelle extends Habitation {
	
	private int NbEmployes;
	
	public int getNbEmployes() {return NbEmployes;}
	public void setNbEmployes(int nbEmployes) {NbEmployes = nbEmployes;}

	public HabitationProfessionnelle(String P, String A, double S, int nbreEmployes) {
		super(P, A, S);
		this.NbEmployes = nbreEmployes;
	}

	public void Affiche() {
		super.Affiche();
		System.out.println("Voici le nombre d'employés: " + getNbEmployes());
	}
}
