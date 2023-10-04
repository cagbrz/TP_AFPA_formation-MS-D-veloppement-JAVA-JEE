package tp1;

public class Point {
	/** Abscisse du point */
	public int x = 0;
	
	/** Ordonnee du point */
	public int y = 0;
	
	/** On peut construire un point en donnant ses coordonnees.
	 * @param x abscisse du point
	 * @param y ordonnee du point
	 * */
	public Point(int unX, int unY) {
		x = unX;
		y = unY;
	}
	
	/** Par defaut, le point construit est l’origine du repere. */
	public Point() {
		this(0, 0); 
	}
}