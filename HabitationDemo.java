package tp4;

public class HabitationDemo {
	public static void main(String[] args) {
		double ToutesLesHabitations[]= {0,0,0,0};
		
		Habitation habitation1	=	new HabitationIndividuelle("Caro", "369 avenue Sully", 300, 4, true);
		Habitation habitation2	=	new HabitationIndividuelle("Stanis", "22 rue Voltaire", 300, 4, false);
		Habitation habitation3	=	new HabitationProfessionnelle("plopsaland", "IDK", 300, 100, 10);		
		Habitation habitation4	=	new HabitationProfessionnelle("walibi", "IDK", 1200, 1000, 65);		
		
		ToutesLesHabitations[0]	=	habitation1.impot();
		ToutesLesHabitations[1]	=	habitation2.impot();
		ToutesLesHabitations[2]	=	habitation3.impot();
		ToutesLesHabitations[3]	=	habitation4.impot();
		
		System.out.println("************************************************************************************************************************************************************************");
		System.out.println("Test de la fonction impot()\n");
		System.out.println("cette fonction calcule le montant de l’impôt que doit payer le propriétaire de l’habitation à raison de 2 euros par m2\n");
		System.out.println("la superficie de l'habitation de " + habitation1.getProprietaire() + " habitant au " + habitation1.getAdresse() + " est de " + habitation1.getSurface() + "m2");
		System.out.println("Le prix de l'impot est de: " + habitation1.impot()+ "€\n");
		
		System.out.println("************************************************************************************************************************************************************************");
		System.out.println("Test de la fonction affiche() avec l'habitation 1.\n");
		System.out.println("Cette fonction affiche les trois attributs de la classe Habitation\n");
		habitation1.Affiche();
		
		System.out.println("\n************************************************************************************************************************************************************************");
		System.out.println("Test de la fonction impot() dans la classe fille HabitationIndividuelle\n");
		System.out.println("cette fonction calcule le montant de l’impôt que doit payer le propriétaire de l’habitation à raison de 2 euros par m2");
		System.out.println("On y ajoute 100€ par nombre de pieces et 500€ s'il y a la presence d'une piscine\n");
		System.out.println("la superficie de l'habitation de " + habitation1.getProprietaire() + " habitant au " + habitation1.getAdresse() + " est de " 
							+ habitation1.getSurface() + "m2. Il y a dans cette maison 4 pèces et une piscine./n");
		System.out.println("Le prix de l'impot est de: " + habitation1.impot()+ "€\n");

		System.out.println("\n************************************************************************************************************************************************************************");
		System.out.println("Test de la fonction affiche() avec l'habitation 2.\n");
		System.out.println("Cette fonction affiche les trois attributs de la classe Habitation\n");
		habitation2.Affiche();

		System.out.println("\n************************************************************************************************************************************************************************");
		System.out.println("Test de la fonction impot() dans la classe fille HabitationIndividuelle\n");
		System.out.println("cette fonction calcule le montant de l’impôt que doit payer le propriétaire de l’habitation à raison de 2 euros par m2");
		System.out.println("On y ajoute 100€ par nombre de pieces et 500€ s'il y a la presence d'une piscine\n");
		System.out.println("la superficie de l'habitation de " + habitation2.getProprietaire() + " habitant au " + habitation2.getAdresse() + " est de " 
							+ habitation2.getSurface() + "m2. Il y a dans cette maison 4 pèces et n'a pas de piscine./n");
		System.out.println("Le prix de l'impot est de: " + habitation2.impot()+ "€\n");
		
		System.out.println("\n************************************************************************************************************************************************************************");
		System.out.println("Test de la fonction affiche() avec l'habitation 3.\n");
		System.out.println("Cette fonction affiche les cinq attributs de la classe Habitation\n");
		habitation3.Affiche();

		System.out.println("\n************************************************************************************************************************************************************************");
		System.out.println("Test de la fonction impot() dans la classe fille HabitationProfessionnelle\n");
		System.out.println("cette fonction calcule le montant de l’impôt que doit payer le propriétaire de l’habitation à raison de 2 euros par m2 occupé");
		System.out.println("On y ajoute 1000€ par tranche de 10 employés\n");
		System.out.println("la superficie de l'habitation de " + habitation3.getProprietaire() + " habitant au " + habitation3.getAdresse() + " est de " 
							+ habitation3.getSurface() + "m2 avec une surface occupée de 100 m2 et a 10 employés.\n");
		System.out.println("Le prix de l'impot est de: " + habitation3.impot()+ "€\n");
		
		System.out.println("\n************************************************************************************************************************************************************************");
		System.out.println("Test de la fonction affiche() avec l'habitation 4.\n");
		System.out.println("Cette fonction affiche les cinq attributs de la classe Habitation\n");
		habitation4.Affiche();

		System.out.println("\n************************************************************************************************************************************************************************");
		System.out.println("Test de la fonction impot() dans la classe fille HabitationProfessionnelle\n");
		System.out.println("cette fonction calcule le montant de l’impôt que doit payer le propriétaire de l’habitation à raison de 2 euros par m2 occupé");
		System.out.println("On y ajoute 1000€ par tranche de 10 employés\n");
		System.out.println("la superficie de l'habitation de " + habitation4.getProprietaire() + " habitant au " + habitation4.getAdresse() + " est de " 
							+ habitation4.getSurface() + "m2 avec une surface occupée de 1000 m2 et a 65 employés.\n");
		System.out.println("Le prix de l'impot est de: " + habitation4.impot()+ "€\n");
		
		System.out.println("\n************************************************************************************************************************************************************************");
		System.out.println("Test de la fonction TotalImpot(double [] ToutesLesHabitations) dans la classe fille Habitation\n");
		System.out.println("cette fonction calcule l’impôt local des habitations (individuelles ou professionnelles) d’une commune");
		System.out.println("Le total des impots de la ville est de: " + Habitation.TotalImpot(ToutesLesHabitations) + "€\n");

	}
}
