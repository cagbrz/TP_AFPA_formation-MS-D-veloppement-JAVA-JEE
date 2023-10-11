package tp4;

public class HabitationDemo {
	public static void main(String[] args) {
		Habitation habitation1 = new HabitationIndividuelle("Caro", "369 avenue Sully", 300, 4, true);
		Habitation habitation2 = new HabitationIndividuelle("Stanis", "22 rue Voltaire", 300, 4, false);
		Habitation habitation3 = new HabitationProfessionnelle("plopsaland", "IDK", 300, 10);
		
		System.out.println("*************************************************************************************************************************");
		System.out.println("Test de la fonction impot()\n");
		System.out.println("cette fonction calcule le montant de l’impôt que doit payer le propriétaire de l’habitation à raison de 2 euros par m2\n");
		System.out.println("la superficie de l'habitation de " + habitation1.getProprietaire() + " habitant au " + habitation1.getAdresse() + " est de " + habitation1.getSurface() + "m2");
		System.out.println("Le prix de l'impot est de: " + habitation1.impot()+ "€\n");
		
		System.out.println("*************************************************************************************************************************");
		System.out.println("Test de la fonction affiche() avec l'habitation 1.\n");
		System.out.println("Cette fonction affiche les trois attributs de la classe Habitation\n");
		habitation1.Affiche();
		
		System.out.println("\n*************************************************************************************************************************");
		System.out.println("Test de la fonction impot() dans la classe fille HabitationIndividuelle\n");
		System.out.println("cette fonction calcule le montant de l’impôt que doit payer le propriétaire de l’habitation à raison de 2 euros par m2");
		System.out.println("On y ajoute 100€ par nombre de pieces et 500€ s'il y a la presence d'une piscine\n");
		System.out.println("la superficie de l'habitation de " + habitation1.getProprietaire() + " habitant au " + habitation1.getAdresse() + " est de " 
							+ habitation1.getSurface() + "m2. Il y a dans cette maison 4 pèces et une piscine./n");
		System.out.println("Le prix de l'impot est de: " + habitation1.impot()+ "€\n");

		System.out.println("\n*************************************************************************************************************************");
		System.out.println("Test de la fonction affiche() avec l'habitation 2.\n");
		System.out.println("Cette fonction affiche les trois attributs de la classe Habitation\n");
		habitation2.Affiche();

		System.out.println("\n*************************************************************************************************************************");
		System.out.println("Test de la fonction impot() dans la classe fille HabitationIndividuelle\n");
		System.out.println("cette fonction calcule le montant de l’impôt que doit payer le propriétaire de l’habitation à raison de 2 euros par m2");
		System.out.println("On y ajoute 100€ par nombre de pieces et 500€ s'il y a la presence d'une piscine\n");
		System.out.println("la superficie de l'habitation de " + habitation2.getProprietaire() + " habitant au " + habitation2.getAdresse() + " est de " 
							+ habitation2.getSurface() + "m2. Il y a dans cette maison 4 pèces et n'a pas de piscine./n");
		System.out.println("Le prix de l'impot est de: " + habitation2.impot()+ "€\n");
		
		System.out.println("\n*************************************************************************************************************************");
		System.out.println("Test de la fonction affiche() avec l'habitation 3.\n");
		System.out.println("Cette fonction affiche les trois attributs de la classe Habitation\n");
		habitation3.Affiche();

	}
}
