package tp1;

/** cette classe modelise l’etat du velo d’un cycliste qui roule.*/
public class Velo {
  /** la vitesse actuelle du velo. */
  private int vitesse = 0;

  /** le cycliste accelere.
  @param increment indique de combien la vitesse du velo augmente.
  */
  public void accelerer(int increment) {
    vitesse = vitesse + increment;
  }
  
  /** le cycliste freine.
	@param decrement indique de combien la vitesse du velo baisse.
   */
  public void freiner(int decrement) {
	  if (vitesse > decrement) {
		  vitesse = vitesse - decrement;
	  } else {
		  this.vitesse = 0;
	  }
  }

  /** affiche l’etat du velo, i.e. sa vitesse. 
 * @param velo */
  public void imprimeEtat() {
	  System.out.println("vitesse: " + vitesse);
  }

  public int getVitesseVelo() {
	return this.vitesse;  
  }

  	public void setVitesse (int vitesse) {
  		this.vitesse = vitesse;
  	}
}