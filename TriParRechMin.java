package tp2;

public class TriParRechMin {
	static void tri_par_recherche_min(int[] tab) {  
		int taille = tab.length; 
	    int plus_petit = tab[0];
	    
		int provisoire = 0;  
	    for(int i=0; i < taille-1; i++) {
	    	int index = i;  
            for (int j = i + 1; j < tab.length; j++) {
                 if (tab[j] < tab[index]) { 
                      index = j;
                 }
            }
            int min = tab[index];
            tab[index] = tab[i]; 
            tab[i] = min;
       }
	 } 
	    
	   

	
	static void displayTab(int[] tab) {    
		for(int i=0; i < tab.length; i++) {
			System.out.print(tab[i] + " " + "\n");  
	    }
	}
	
	
	public static void main(String[] args ) {
		int[] tab = new int[]{10,22,6,15,3};  
		 
        System.out.println("---Avant le tri---"); 
    
        displayTab(tab);
 
        // tri des elements de tableau avec le tri
        tri_par_recherche_min(tab);
 
        System.out.println("---Apres le tri---");  
    
        displayTab(tab);
        
       // System.out.println(""+ tab.length);
	}
}
