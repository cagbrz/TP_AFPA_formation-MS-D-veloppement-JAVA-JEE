package tp4;

import tp3_bis.Livre;

public class Habitation {
	private String proprietaire; 					//Nom du proprietaire 
	private String adresse; 						//Adresse de l'habitation
	private double surface;							//Surface de l'habitation 
													//Permet de calculer le montant de l'imppot
	private Habitation[] ToutesLesHabitations;		//création d'un tableau pour y ranger toutes les habitations
	int ToutesLesHabitationsCount;
	
	public String getProprietaire() {return proprietaire;}
	public void setProprietaire(String proprietaire) {this.proprietaire = proprietaire;}
	public String getAdresse() {return adresse;}
	public void setAdresse(String adresse) {this.adresse = adresse;}
	public double getSurface() {return surface;}
	public void setSurface(double surface) {this.surface = surface;}

	public Habitation(String P, String A, double surface2) {
		this.proprietaire = P;
		this.adresse = A;
		this.surface = surface2;
	}
	
	//calcule le montant de l’impôt que doit payer le propriétaire de l’habitation à raison de 2 euros par m2
	public double impot() {
		double resultat; 
		resultat = getSurface()*2;
		return resultat;
	}

	//d’affiche les trois attributs de la classe Habitation
	public void Affiche() {
		System.out.println("Le propriétaire de l'habitation est: " + getProprietaire());
		System.out.println("L'adresse de l'habitation est: " + getAdresse());
		System.out.println("La surface de l'habitation est: " + getSurface());
	}
	
	
	public static double TotalImpot(double [] ToutesLesHabitations) {
		double totauxImpots = 0;
		for (int i = 0; i < ToutesLesHabitations.length; i++) {
			totauxImpots += ToutesLesHabitations[i];
		}
		return totauxImpots;
	}
}
