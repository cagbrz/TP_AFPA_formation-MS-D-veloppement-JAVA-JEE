package tp4;

public class HabitationProfessionnelle extends Habitation {
	
	private int NbEmployes;
	private double SurfaceOccupée;
	
	public int getNbEmployes() {return NbEmployes;}
	public void setNbEmployes(int nbEmployes) {NbEmployes = nbEmployes;}

	public double getSurfaceOccupée() {return SurfaceOccupée;}
	public void setSurfaceOccupée(double surfaceOccupée) {SurfaceOccupée = surfaceOccupée;}
	
	public HabitationProfessionnelle(String P, String A, double surface, double Soccupee, int nbreEmployes) {
		super(P, A, surface);
		this.NbEmployes = nbreEmployes;
		this.SurfaceOccupée = Soccupee;
	}

	public double impot() {
		double resultat = getSurfaceOccupée()*2 + ((NbEmployes/10)*1000);
		return resultat;
	}

	public void Affiche() {
		super.Affiche();
		System.out.println("Voici le nombre d'employés: " + getNbEmployes());
		
	}

}
