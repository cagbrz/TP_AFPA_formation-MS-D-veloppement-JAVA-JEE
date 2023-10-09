package tp3;

import java.util.ArrayList;

public class Bibliobus {

    private String name;
    private Livre[] biblio;
    private int taille = 100; 
    private int limite = 0; 
    Livre[] catalogue = new Livre[taille];
    
    public Bibliobus(String name) {
        this.name = name;
        this.biblio = new Livre[taille];
    }

    public int totauxLivres() {
        int totaux = 0;
        int indice = 0;
        int x = 0;
        
        while(biblio[x].equals(null)) {
        	indice = x;
        }
        
    	for(int i = 0; i<indice; i++) {
    		totaux = totaux +  biblio[i].nbreExemplaires;
    	}
        return totaux;
    }

    public String afficheBiblio() {
    	String result= "";
    	int j = 0;
    	while(biblio[j] != null) {
    		for(int i = 0; i<biblio.length; i++) {
    			result += biblio[i].toString();
    		}
         j = 1;
        }
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Livre[] getBiblio() {
        return biblio;
    }

    public void setBiblio(Livre[]biblio) {
        this.biblio = biblio;
    }

    public void ajoutLivre(String titre, String auteur, String editeur) {
        Livre nouveauLivre = new Livre(titre, auteur, editeur);
        int indice = 0;
        int i = 0;
        while(biblio[i] != null) {
        	indice = i;
        }
        if (biblio.length < 100) {
            biblio[indice+1] = nouveauLivre;
        }
        
    }

    public void ajoutLivre(Livre livre) {
        int indice = 0;
        int i = 0;
        while(biblio[i] != null) {
        	indice = i;
        }
        if (biblio.length < 100) {
            biblio[indice+1] = livre;
        }
    }
}
